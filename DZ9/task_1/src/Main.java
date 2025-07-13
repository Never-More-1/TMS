public class Main {
    public static void main(String[] args) {
        IJobTitle jobTitle = new Worker();
        jobTitle.title();
        jobTitle = new Accountant();
        jobTitle.title();
        jobTitle = new Director();
        jobTitle.title();
    }
}