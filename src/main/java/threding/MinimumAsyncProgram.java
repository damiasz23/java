package threding;

import java.util.Random;

public class MinimumAsyncProgram {

    public static double sumArr(double[] arr){
        double sum =0;
        for(double e:arr){
            sum+=e;
        }
        return sum;
    }


    public static void main(String[] args) throws InterruptedException {

        int ARRAY_SIZE = 100;
        double[] arr = new double[10000000];
        Random r = new Random();

        for(int i = 0;i < arr.length;i++){
            arr[i] = r.nextDouble();
        }

        MinimumAsync minimumAsync = new MinimumAsync(arr, 4);
        System.out.println();

        long startTime = System.currentTimeMillis();
        double v = minimumAsync.findMinimumAsync();
        long after = System.currentTimeMillis() - startTime;
        System.out.println("Wynik sumawania tablicy na wielu wątkach to: " + after);



        long singleStart = System.currentTimeMillis();
        double singleResult = sumArr(arr);
        long singleAfter = System.currentTimeMillis() - singleStart;
        System.out.println("Na jednym watku: " + singleAfter);


    }
}
