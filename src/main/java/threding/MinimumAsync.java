package threding;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MinimumAsync {

    private double[] arr;
    private Thread[] threads;
    private int THREDS_COUNT;
    private double result;
    private Lock lock = new ReentrantLock();



    public MinimumAsync(double[] arr, int numberOfThreds) {
        this.arr = arr;
        this.THREDS_COUNT = numberOfThreds;
        threads = new Thread[THREDS_COUNT];
        result = arr[0];
    }

    private void methodForThreds(int startIndex){
        double smallest = arr[startIndex];
        for(int i = startIndex; i < arr.length; i +=THREDS_COUNT){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        try {
            lock.lock();
            if (smallest < result) {
                result = smallest;
            }
        }
        finally {
            lock.unlock();
        }

//        synchronized (locker){
//            sum +=result;
//        }
    }
    public double findMinimumAsync() throws InterruptedException {
        for(int i = 0;i < threads.length;i++){
            int helper = i;
            threads[i] = new Thread(() -> {
                methodForThreds(helper);
            });
            threads[i].start();
            threads[i].join();
        }
        return result;
    }

}
