package drugiTydzie.wtorek;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-11.
 */
public class Metody2 {

    public static int AddElements(int a, int b){
        int suma = a + b;
        return suma;
    }

    public static int Silnia(int n){
        int wynik = 1;
        for( int i = 1; i <= n; i++){
            wynik *=i;
        }
        return wynik;
    }

    public static int SumaTablicy(int[] tablica){
        int suma = 0;
        for (int i =0;i < tablica.length; i++){
            suma +=tablica[i];
        }
        return suma;
    }


    public static void main(String[] args) {

        int wynik = AddElements(5, 15);
        System.out.println("Wynik dodawania to: " + wynik);

        int liczba = 6;
        int wynikSilni =Silnia(liczba); // albo int wynikSilni =Silnia(6);
        System.out.println("Silnia to: " + wynikSilni);

        int wynikSilni2 = Silnia(5);
        System.out.println("Silnia to: " + wynikSilni2);

        int[] tablica = new int[]{1, 3, 5 ,6 ,8, 9};

        int suma = SumaTablicy(tablica);
        System.out.println("Suma liczb z tablicy " + suma);


    }
}
