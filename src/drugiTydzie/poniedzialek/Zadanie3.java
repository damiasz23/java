package drugiTydzie.poniedzialek;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class Zadanie3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int ilosc = in.nextInt();
        int[] liczby = new int[ilosc];

        System.out.println("Podaj wartości");

        for( int i = 0; i < liczby.length; i ++){
            liczby[i] = in.nextInt();

        }

        int max = liczby[0];
        for(int i = 0 ; i < liczby.length; i ++){
            if(liczby[i] > max ){
                max = liczby[i];
            }

        }
        System.out.println("Najwieksza liczba to: " + max);

    }
}
