package pierwszyTydzien;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class Trojkat {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double x;
        double y;
        double z;


        System.out.println("Podaj długość pierwszego boku: ");
        x = in.nextDouble();
        System.out.println("Podaj długość pdrugiego boku: ");
        y = in.nextDouble();
        System.out.println("Podaj długość trzeciego boku: ");
        z = in.nextDouble();

        if((x+y>z)&&(x+z>y)&&(y+z> x)){
            System.out.println("Powstanie trójkąt");
            double p = (x + y + z)/2;
            double wynikBezPierwiastka = p* (p - x)*(p - y)*(p - z);
            double pole = Math.sqrt(wynikBezPierwiastka);

            System.out.println("p: " + p);
            System.out.println("pole: " + pole);
        }
        else{
            System.out.println("Nie powstanie trójkąt: ");
        }





    }

}
