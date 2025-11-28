package springApp.controller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import springApp.exception.UsernameExistException;
import springApp.model.dto.UserRegistrationDto;
import springApp.service.SecurityService;
import springApp.service.UserService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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
    public String registration(@Valid @ModelAttribute UserRegistrationDto userRegistrationDto,
                               BindingResult bindingResult,
                               Model model) throws SQLException, UsernameExistException {
        if (bindingResult.hasErrors()) {
            List<String> errMessages = new ArrayList<>();

            for (ObjectError objectError : bindingResult.getAllErrors()) {
                System.out.println(objectError);
                errMessages.add(objectError.getDefaultMessage());
            }
            model.addAttribute("errors", errMessages);
            return "error";
        }

        Boolean result = securityService.registration(userRegistrationDto);
        if (result) {
            return "redirect:/user"; //редирект вместо прямого возврата
        }
        model.addAttribute("error_message", "Ошибка регистрации");
        return "registration";
    }

    @ExceptionHandler(UsernameExistException.class)
    public String usernameExistException(UsernameExistException e) {
        System.out.println("User already exist: " + e.getUsername());
        ModelAndView model = new ModelAndView("error");
        model.setStatus(HttpStatus.BAD_REQUEST);
        model.addObject("errors", "Username already exist");
        return "error";
    }
}
