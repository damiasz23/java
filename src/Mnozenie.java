package mojeDomowe;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by olaIdamian on 7/11/2017.
 */
public class Mnozenie {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Podaj wynik mnożenia nastepujących liczb: " );
        int a = random.nextInt(11);
        System.out.print(a + " i ");

        int b = random.nextInt(11);
        System.out.println(b);

        int wynik = a * b;
        int mojWynik = in.nextInt();

        while (wynik !=mojWynik){
            System.out.println("Źle! Spróbuj jeszcze raz");
            mojWynik = in.nextInt();
        }
        System.out.println("Dobrze!!! Wynik mnożenia to: " + wynik);

    }
}
