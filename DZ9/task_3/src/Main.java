public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Man man1 = new Man(20, "Дима");
        //Man man2 = man1;//это не является клонированием, т.к. в man2 передается ссылка на содержимое в man1.
        //то есть, при изменении каких-либо параметров в man1, эти параметры так же изменятся в man2.
        Man man2 = man1.clone();//в этом случае клонирование выполняется корректно.
        man1.setAge(25);
        System.out.println("man1 age: " + man1.age);
        System.out.println("man2 age: " + man2.age);
    }
}