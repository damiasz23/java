package threding;

import java.util.Objects;

public class ArrayAsync {

    private double[] array;
    private int THREDS_COUNT;
    private Thread[] threads;
    private double sum;
    private final Object locker = new Object();

    public ArrayAsync(double[] array, int THREDS_COUNT) {
        this.array = array;
        this.THREDS_COUNT = THREDS_COUNT;

        threads = new Thread[THREDS_COUNT];

    }

    public double StartCalculations() throws InterruptedException {
        for(int i =0;i < threads.length; i++){
            int helper = i;
            threads[i] = new Thread(() -> {
                singleThredTAsk(helper);
            });
            threads[i].start();
            threads[i].join();

        }
        return sum;
    }

    private void singleThredTAsk(int startIndex){
        double result = 0;

        for(int i = startIndex; i < array.length; i +=THREDS_COUNT){
            result +=array[i];
        }
        synchronized (locker){
            sum +=result;
        }
    }
}
