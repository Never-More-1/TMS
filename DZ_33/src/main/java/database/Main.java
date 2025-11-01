package database;

import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        UserRepository ur = new UserRepository();

        User user = new User(6, "Anexy", "228322", "Lesha", "Silentov", null, null);
        //ur.addUser(user);
        System.out.println(ur.getAllUsers());
        ur.deleteUser(5);
        ur.updateUser("lol", "ksdlmglksdmrf", "Den", "Quiet", 1);

//        Properties props = new Properties();
//        props.load(new FileInputStream("app.properties"));
//        // 1. Регистрация драйвера
//        Class.forName("org.postgresql.Driver");
//        // 2. Создание соединения
//        Connection connection = DriverManager.getConnection(
//                props.getProperty("db_url"),
//                props.getProperty("db_login"),
//                props.getProperty("db_password")
//        );
//        // 3. Создание PreparedStatement
//        PreparedStatement statement = connection.prepareStatement("SELECT * FROM users");
//        // 4. Запуск
//        ResultSet resultSet = statement.executeQuery();
//        // 5. Парсинг
//        List<User> userList = new ArrayList<>();
//        while (resultSet.next()) {
//            User userFromDb = new User();
//            userFromDb.setId(resultSet.getInt("id"));
//            userFromDb.setUsername(resultSet.getString("username"));
//            userFromDb.setPassword(resultSet.getString("password"));
//            userFromDb.setFirstname(resultSet.getString("first_name"));
//            userFromDb.setLastname(resultSet.getString("last_name"));
//
//            // Обработка возможных null значений для дат
//            Timestamp createdAt = resultSet.getTimestamp("created_at");
//            Timestamp updatedAt = resultSet.getTimestamp("updated_at");
//
//            userList.add(userFromDb);
//        }
//
//        System.out.println(userList);
//
//        // Закрытие ресурсов
//        resultSet.close();
//        statement.close();
//        connection.close();
    }
}