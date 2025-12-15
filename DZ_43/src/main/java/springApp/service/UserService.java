package springApp.service;

import org.springframework.stereotype.Service;
import springApp.model.User;
import springApp.model.dto.UserCreateDto;
import springApp.repository.UserRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public Optional<User> getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public boolean addUser(UserCreateDto user) throws SQLException {
        return userRepository.addUser(user);
    }

    public boolean removeUserById(int id) throws SQLException {
        Optional<User> userFromDb = getUserById(id);
        if(userFromDb.isPresent() && userRepository.removeUserById(id)) {
                userFromDb = getUserById(id);
                return userFromDb.isEmpty();
        }
        return false;
    }
}
