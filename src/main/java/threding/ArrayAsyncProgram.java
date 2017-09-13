package threding;

import java.util.Random;

public class ArrayAsyncProgram {

    public static void main(String[] args) throws InterruptedException {

        int ARRAY_SIZE = 1000;
        double[] arr = new double[1000];
        Random r = new Random();

        for(int i = 0;i < arr.length;i++){
            arr[i] = r.nextDouble();
        }


        long l = System.currentTimeMillis();
        ArrayAsync async = new ArrayAsync(arr, 4);
        double v = async.StartCalculations();
        System.out.println("Wynik sumawania tablicy na wątkach to: " + v);
        long l1 = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(l1);
    }

}
