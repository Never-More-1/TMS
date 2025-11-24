package springApp.repository;

import springApp.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Repository
public class UserRepository {
    private static final String SELECT_ALL_USERS = "SELECT * FROM users";
    private static final String GET_USER_BY_ID = "SELECT * FROM users WHERE id = ?";

    private Connection connection;

    public static Connection createConnection() throws SQLException, ClassNotFoundException {
        Properties props = new Properties();
        //Регистрация драйвера
        Class.forName("org.postgresql.Driver");

        //Создание соединения
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/users","postgres", "root");
    }

    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        connection = createConnection();
    }

    public List<User> getAllUsers() {
        try {
            System.out.println("Executing SQL: " + SELECT_ALL_USERS);
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<User> users = parseResultSetToUserList(resultSet);
            System.out.println("Retrieved " + users.size() + " users from database");

            // Выведите содержимое для отладки
            for (User user : users) {
                System.out.println("User: id=" + user.getId() + ", name=" + user.getName() + ", age=" + user.getAge());
            }

            return users;
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public User getUserById(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_ID);
            ResultSet resultSet = preparedStatement.executeQuery();
            return parseResultSetToUser(resultSet);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return new User();
    }

    public List<User> parseResultSetToUserList(ResultSet resultSet) throws SQLException {
        List<User> userList = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getString("age"));
            user.setCreated(resultSet.getTimestamp("created"));
            user.setUpdated(resultSet.getTimestamp("updated"));
            userList.add(user);
        }
        return userList;
    }

    public User parseResultSetToUser(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getString("age"));
            user.setCreated(resultSet.getTimestamp("created"));
            user.setUpdated(resultSet.getTimestamp("updated"));
            return user;
        }
        return new User();
    }
}
