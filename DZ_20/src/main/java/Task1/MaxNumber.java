package Task1;

public class MaxNumber extends MyThread {
    public MaxNumber(int[] array) {
        super(array);
    }

    @Override
    public void run() {
        result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
    }
}
