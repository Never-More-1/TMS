package springApp.service;

import org.springframework.stereotype.Service;
import springApp.model.User;
import springApp.repository.UserRepository;

import java.sql.SQLException;
import java.time.LocalDateTime;

@Service
public class SecurityService {
    public UserRepository userRepository;

    public SecurityService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registration(String userName, int age, String password) throws SQLException {
        User user = new User();
        user.setName(userName);
        user.setAge(age);
        user.setCreated(LocalDateTime.now());
        userRepository.addUser(user);
        try {
            return userRepository.addUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
