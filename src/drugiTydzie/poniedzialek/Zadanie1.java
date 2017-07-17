package drugiTydzie.poniedzialek;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class Zadanie1 {
    public static void main(String[] args) {

        int iloscLiczb;
        int liczbyDoWczytania;

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość liczb: ");
        iloscLiczb = in.nextInt();

        if (iloscLiczb >= 1 && iloscLiczb <= 30){
            int[] tablica = new int[iloscLiczb];

// wypelnianaie elementów
            for (int i = 0; i < iloscLiczb; i ++){
                System.out.println("Wpisz element tablicy");
                liczbyDoWczytania = in.nextInt();
                tablica [i] = liczbyDoWczytania;

            }
            System.out.print("Elementy tablicy to: ");


            for(int element : tablica){
                System.out.print(element + " ");

            }


        }
        else {
            System.out.println("Podałeś więcej niż 30 liczb");
        }

    }
}
