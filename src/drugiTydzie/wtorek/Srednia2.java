package drugiTydzie.wtorek;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-11.
 */
public class Srednia2 {

    public static double SredniaTablicy(double[] tablica) {
        double srednia = 0;
        double suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
            //srednia = suma / tablica.length;

        }
        return suma/ tablica.length; // albo tak jak wyżej -
    }

    // Metoda do wpisywania poszczegolnych elementow tablicy. W funkcji main mamy skaner do podania wielkosci tablicy
    public static double[] Skaner(double[] tablica) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj elemnty tablicy");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Wprowadz liczbe " + (i + 1) + " tablicy");
            tablica[i] = in.nextDouble();
        }
        return tablica;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy");
        int rozmiar = in.nextInt();
        double[] tablica = new double[rozmiar];

        Skaner(tablica);
        for(int i = 0;i < rozmiar; i++){
            System.out.println(tablica[i]);

        }
        double srednia = SredniaTablicy(tablica);
        System.out.println("Srednia liczb to: " + srednia);


        }

}

