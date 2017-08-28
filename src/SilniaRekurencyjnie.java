import java.util.Scanner;

/**
 * Created by olaIdamian on 8/28/2017.
 */
public class SilniaRekurencyjnie {

    public static int silnia(int i){
        if(i==0){
            return 1;
        }
        return i * silnia(i -1);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Silnie jakiej liczby chcesz obliczyć?");
        int liczba = in.nextInt();
        System.out.println("Silnia liczby " + liczba + " to: " + silnia(liczba));

    }
}

