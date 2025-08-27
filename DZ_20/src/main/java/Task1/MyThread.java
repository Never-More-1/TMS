package Task1;

public class MyThread extends Thread {
    public int[] array;
    public int result;

    public MyThread(int[] array) {
        this.array = array;
    }

    public int getResult() {
        return result;
    }
}
