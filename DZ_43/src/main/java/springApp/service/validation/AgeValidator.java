package springApp.service.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import springApp.annotation.AdultAge;

public class AgeValidator implements ConstraintValidator<AdultAge, Integer> {

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
        return value != null && value >= 18 && value <= 120;
    }
}
