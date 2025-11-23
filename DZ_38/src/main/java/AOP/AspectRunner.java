package AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectRunner {
    @Pointcut("within(AOP.UserRepository)")
    public void pointcutMethod() {}

    @Before(value = "pointcutMethod()")
    public void before() {
        System.out.println("Before Method");
    }

    @After(value = "pointcutMethod()")
    public void after(JoinPoint jp) {
        System.out.println("After Method");
        System.out.println("Signature: " + jp.getSignature());
    }

    @AfterThrowing(value = "execution(public * *owI*())", throwing = "ex")
    public void afterThrowing(ArithmeticException ex) {
        System.out.println("After Throwing Method" + ex.getMessage());
    }

    @Around(value = "execution(public * *owI*())")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around Method START!!!");
        pjp.proceed();
        System.out.println("Around Method END!!!");
    }

    @AfterReturning(value = "execution(public * *erI*(int))", returning = "o")
    public void afterReturning(Object o) {
        System.out.println("After Returning Method: " + o);
    }
}
