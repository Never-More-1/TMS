package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserRepository {
    private static final String INSERT_USER = "INSERT INTO users(id, username, password, first_name, last_name, created_at, updated_at) VALUES (DEFAULT,?,?,?,?,?,?)";
    private static final String UPDATE_USER = "UPDATE users SET username = ?, password = ?, first_name = ?, last_name = ?, updated_at = CURRENT_TIMESTAMP WHERE id = ? ";

    public void addUser(User user) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("app.properties"));
        try (Connection connection = DriverManager.getConnection(
                props.getProperty("db_url"),
                props.getProperty("db_login"),
                props.getProperty("db_password")
        );
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFirstname());
            preparedStatement.setString(4, user.getLastname());
            preparedStatement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<User> getAllUsers() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("app.properties"));
        List<User> users = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(
                props.getProperty("db_url"),
                props.getProperty("db_login"),
                props.getProperty("db_password")
        );
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, username, password, first_name, last_name, created_at, updated_at FROM users")) {
            while (rs.next()) {
                int id = rs.getInt(1);
                String userName = rs.getString(2);
                String passWord = rs.getString(3);
                String firstName = rs.getString(4);
                String lastName = rs.getString(5);
                LocalDate createdAt = null;
                LocalDate updatedAt = null;
                Timestamp createdAtTimestamp = rs.getTimestamp(6);
                Timestamp updatedAtTimestamp = rs.getTimestamp(7);

                if (createdAtTimestamp != null) {
                    createdAt = createdAtTimestamp.toLocalDateTime().toLocalDate();
                }
                if (updatedAtTimestamp != null) {
                    updatedAt = updatedAtTimestamp.toLocalDateTime().toLocalDate();
                }

                users.add(new User(id, userName, passWord, firstName, lastName, createdAt, updatedAt));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public void updateUser(String newUserName, String newPassWord, String newFirstName, String newLastName, int id) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("app.properties"));
        try (Connection connection = DriverManager.getConnection(
                props.getProperty("db_url"),
                props.getProperty("db_login"),
                props.getProperty("db_password")
        );
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER)) {
            preparedStatement.setString(1, newUserName);
            preparedStatement.setString(2, newPassWord);
            preparedStatement.setString(3, newFirstName);
            preparedStatement.setString(4, newLastName);
            preparedStatement.setInt(5, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteUser(int id) throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("app.properties"));
        try (Connection connection = DriverManager.getConnection(
                props.getProperty("db_url"),
                props.getProperty("db_login"),
                props.getProperty("db_password")
        );
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}