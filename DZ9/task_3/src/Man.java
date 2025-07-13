public class Man implements Cloneable {
    public int age;
    public String name;

    Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Man clone() throws CloneNotSupportedException{
        return (Man)super.clone();
    }
}
