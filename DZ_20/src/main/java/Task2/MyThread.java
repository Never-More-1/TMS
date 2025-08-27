package Task2;

abstract class MyThread implements Runnable {
    public int[] array;

    public MyThread(int[] array) {
        this.array = array;
    }
}
