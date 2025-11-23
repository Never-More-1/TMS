package AOP;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    public int userId(int id){
        System.out.println("User id...");
        return id;
    }

    public void showInfo(){
        System.out.println("Info about user...");
//        System.out.println(0/0);
    }
}
