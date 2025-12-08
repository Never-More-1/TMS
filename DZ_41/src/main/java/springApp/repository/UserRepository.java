package springApp.repository;

import springApp.model.User;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Repository
public class UserRepository {
    private static final String INSERT_USER = "INSERT INTO users(name, age, created, updated) VALUES (?,?,?,?)";
    private static final String SELECT_ALL_USERS = "SELECT * FROM users";
    private static final String GET_USER_BY_ID = "SELECT * FROM users WHERE id = ?";
    private static final String GET_USER_BY_USERNAME = "SELECT * FROM users WHERE name = ?";

    private Connection connection;

    public static Connection createConnection() throws SQLException, ClassNotFoundException {
        Properties props = new Properties();
        //Регистрация драйвера
        Class.forName("org.postgresql.Driver");

        //Создание соединения
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/users", "postgres", "root");
    }

    @PostConstruct
    public void init() throws SQLException, ClassNotFoundException {
        connection = createConnection();
    }

    public List<User> getAllUsers() {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<User> users = parseResultSetToUserList(resultSet);
            return users;
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public boolean addUser(User user) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setInt(2, user.getAge());
            preparedStatement.setTimestamp(3, Timestamp.valueOf(java.time.LocalDateTime.now()));
            preparedStatement.setTimestamp(4, Timestamp.valueOf(java.time.LocalDateTime.now()));

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public User getUserById(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            return parseResultSetToUser(resultSet);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return new User();
    }

    public Optional<User> getUserByUsername(String username) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_USERNAME);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            return Optional.ofNullable(parseResultSetToUser(resultSet));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }

    public List<User> parseResultSetToUserList(ResultSet resultSet) throws SQLException {
        List<User> userList = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));

            Timestamp createdTimestamp = resultSet.getTimestamp("created");
            user.setCreated(createdTimestamp != null ? createdTimestamp.toLocalDateTime() : null);

            Timestamp updatedTimestamp = resultSet.getTimestamp("updated");
            user.setUpdated(updatedTimestamp != null ? updatedTimestamp.toLocalDateTime() : null);

            userList.add(user);
        }
        return userList;
    }

    public User parseResultSetToUser(ResultSet resultSet) throws SQLException {
        if (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setName(resultSet.getString("name"));
            user.setAge(resultSet.getInt("age"));

            Timestamp createdTimestamp = resultSet.getTimestamp("created");
            user.setCreated(createdTimestamp != null ? createdTimestamp.toLocalDateTime() : null);

            Timestamp updatedTimestamp = resultSet.getTimestamp("updated");
            user.setUpdated(updatedTimestamp != null ? updatedTimestamp.toLocalDateTime() : null);

            return user;
        }
        return null;
    }
}
