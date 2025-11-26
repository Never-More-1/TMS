package springApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import springApp.model.User;
import springApp.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getAllUsers(Model model) {
        List<User> allUsers = userService.getAllUsers();
        System.out.println("Found users: " + allUsers.size());
        model.addAttribute("usersKey", allUsers);
        return "users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") int id,  Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "user";
    }
}
