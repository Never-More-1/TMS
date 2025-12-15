package springApp.model.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.stereotype.Component;
import springApp.annotation.AdultAge;

@Data
@Component
public class UserRegistrationDto {
    @NotBlank
    @Size(min = 2, max = 10)
    private String username;

    @AdultAge
    private int age;

    @Pattern(regexp = "[A-z]{6}")
    private String password;
}
