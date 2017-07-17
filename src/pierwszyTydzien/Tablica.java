package pierwszyTydzien;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class Tablica {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int[] liczby = new int[10];

        for(int i = 0;i < liczby.length; i++){
            System.out.println("Wpisz " + (i+1) + " element tabliczy");
            int element = in.nextInt();
            liczby[i] = element;   //druga petla for abu wypisywalo ilosc np znakow

        }
        System.out.println("Wypisz elementy tablicy");
        for(int i = 0;i < liczby.length; i++){
            int element = liczby[i];
            System.out.println(element);

        }

    }
}
