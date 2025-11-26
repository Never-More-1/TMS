package springApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springApp.service.SecurityService;
import springApp.service.UserService;

import java.sql.SQLException;


@Controller
@RequestMapping("/security")
public class SecurityController {
    public SecurityService securityService;
    public UserService userService;

    public SecurityController(SecurityService securityService, UserService userService) {
        this.securityService = securityService;
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@RequestParam("username") String username,
                               @RequestParam("age") int age,
                               @RequestParam("password") String password,
                               @RequestParam("confirmPassword") String confirmPassword,
                               Model model) throws SQLException {

        // Добавьте проверку паролей
        if (!password.equals(confirmPassword)) {
            model.addAttribute("error_message", "Пароли не совпадают");
            model.addAttribute("username", username);
            model.addAttribute("age", age);
            return "registration";
        }

        Boolean result = securityService.registration(username, age, password);
        if (result) {
            return "redirect:/user"; //редирект вместо прямого возврата
        }
        model.addAttribute("error_message", "Ошибка регистрации");
        return "registration";
    }
}
