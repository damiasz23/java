package mojeDomowe;

import java.util.Scanner;

/**
 * Created by olaIdamian on 7/11/2017.
 */
public class CiagPrzedzial {
    public static void main(String[] args) {

        int liczbyDoWczytania = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj ilość liczb");
        liczbyDoWczytania = in.nextInt();

        int[] tablica = new int[liczbyDoWczytania];
        int[] tablicaWynikowa = new int[liczbyDoWczytania];


        for(int i = 0; i < tablica.length; i++){
            System.out.println("Wpisz element tablicy");
            tablica[i] = in.nextInt();


        }
        for(int i = 0; i < tablica.length; i++){
            System.out.println(i);

        }


        }

    }


