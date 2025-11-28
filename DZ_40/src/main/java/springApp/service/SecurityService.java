package springApp.service;

import org.springframework.stereotype.Service;
import springApp.exception.UsernameExistException;
import springApp.model.User;
import springApp.model.dto.UserRegistrationDto;
import springApp.repository.UserRepository;

import java.sql.SQLException;
import java.time.LocalDateTime;

@Service
public class SecurityService {
    public UserRepository userRepository;

    public SecurityService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registration(UserRegistrationDto userRegistrationDto) throws SQLException, UsernameExistException {
        if(isUsernameUsed(userRegistrationDto.getUsername())) {
            throw new UsernameExistException(userRegistrationDto.getUsername());
        }
        User user = new User();
        user.setName(userRegistrationDto.getUsername());
        user.setAge(userRegistrationDto.getAge());
        user.setCreated(LocalDateTime.now());
        try {
            return userRepository.addUser(user);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean isUsernameUsed(String username) throws SQLException {
        return userRepository.getUserByUsername(username).isPresent();
    }
}
