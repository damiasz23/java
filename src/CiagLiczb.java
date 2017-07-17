package mojeDomowe;

import java.util.Scanner;

/**
 * Created by olaIdamian on 7/11/2017.
 */
public class CiagLiczb {
    public static void main(String[] args) {

        int elementy;
        Scanner in = new Scanner(System.in);

        int[] tablica = new int[11];
        System.out.println("Podaj 10 liczb rzeczywistych: ");

        for(int i = 1; i < tablica.length; i ++){

            System.out.println("Podaj liczbę: " + i);
            tablica[i] = in.nextInt();

        }
        System.out.print("Twoje liczby to: ");
        for (int i = 1; i < tablica.length; i++){
            elementy = tablica[i];
            System.out.print(elementy + " ");
        }
    }
}
