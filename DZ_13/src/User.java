public class User {
    static boolean LogInCheck(String login, String password, String confirmPassword){
        try{
            if (login.length() >= 20 || login.contains(" ")){
                throw new WrongLoginException("Длинна логина должна быть меньше 20 или не содержать пробелов");
            }
            if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")){
                throw new WrongPasswordException("Длинна пароля должна быть меньше 20 или содержать хотя бы одну цифру");
            }
            if (!confirmPassword.equals(password)){
                throw new WrongPasswordException("Пароли не совпадают");
            }
            Runtime.getRuntime().exit(0);//!!!!!!
            return true;
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e);
            Runtime.getRuntime().exit(0);//!!!!!!
            return false;
        }finally {
            System.out.println("Я не должен это видеть");
        }
    }
}
//Не нашел другого способа, кроме как насильно прекратить выполнение метода.
//Есть ли еще какие-то способы не вызывать finally?