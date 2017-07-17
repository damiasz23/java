package mojeDomowe;

import java.util.Scanner;

/**
 * Created by olaIdamian on 7/11/2017.
 */
public class CiagLiczb2 {
    public static void main(String[] args) {

        int elementy;
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ciąg liczb które chcesz podnieść do drugiej potęgi:");

        int[] liczby = new int[6];

        for(int i = 1; i < liczby.length; i++){
            System.out.println("Liczba numer: " + i);
            liczby[i] = in.nextInt();
        }

        for(int i =1; i < liczby.length; i ++){
            elementy = liczby[i] * liczby[i];
            System.out.println("Twoje liczba to: " + i + " Liczba podniesione do kwadratu: " + elementy);
        }

    }

}
