import java.util.Scanner;

/**
 * Created by olaIdamian on 7/20/2017.
 */
public class Trojkat1 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        double[] dl = new double[3];

        for(int i = 0; i < dl.length;i++){
                System.out.println("Podaj dlugość boku trójkąta");
                double boki = in.nextDouble();
                dl[i] = boki;
        }

        if((dl[0] + dl[1] > dl[2])&&(dl[0]) + dl[2] > dl[1] && (dl[1] + dl[2] > dl[0])){
            System.out.println("Powstanie trójkąt");
            double p = (dl[0] + dl[1] + dl[2])/2;
            double wynikBezPierwiastka = p* (p - dl[0])*(p - dl[1])*(p - dl[2]);
            double pole = Math.sqrt(wynikBezPierwiastka);

            System.out.println("p: " + p);
            System.out.println("pole: " + pole);

        }
        else{
            System.out.println("nie powstanie trojkąt");
        }
    }
}
