package mojeDomowe;

import java.util.Scanner;

/**
 * Created by olaIdamian on 7/11/2017.
 */
public class CiagLiczbDodawanie {
    public static void main(String[] args) {

        int element;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczby od których chcesz odjąć 1");
        int[] liczby = new int[10];

        for(int i = 1; i < liczby.length; i++){
            System.out.println("Twoje liczby to: " + i);
            liczby[i] = in.nextInt(); // wpisywanie poszczegolnych elementow tablicy
        }
        for(int i = 1; i < liczby.length; i++){
            element = liczby[i] - 1;
            System.out.println("Różnica liczb to: " + element);
        }
    }
}
