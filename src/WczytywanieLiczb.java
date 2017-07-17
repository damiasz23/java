package mojeDomowe;

import java.util.Scanner;

/**
 * Created by olaIdamian on 7/12/2017.
 */
public class WczytywanieLiczb {

    public static int[] WpisywanieLiczb(int[] tablica){


        for(int i = 0; i <tablica.length; i++){
            Scanner in = new Scanner(System.in);
            System.out.println("Podaj elementy tablicy");
            tablica[i] = in.nextInt();
        }
        return tablica;
    }

    public static int DodawanieElementow(int[] tablica){
        int wynik = 0;
        for(int i =0;i < tablica.length; i++){
            wynik +=tablica[i];

        }
        return wynik;
    }

    public  static int MnozenieElementow(int[] tablica){
        int wynik =1;
        for(int i = 0;i < tablica.length;i++){
            wynik *=tablica[i];

        }
        return wynik;

    }
    public static int Parzyste(int[] tablica){
        int wynik = 0;
        for (int i = 0;i < tablica.length; i++){
            wynik = tablica[i];
        }
        return wynik;
    }

    public static void main(String[] args) {

        int iloscLiczb = 0;


        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy");
        iloscLiczb = in.nextInt();

        int[] tablica = new int[iloscLiczb];
        WpisywanieLiczb(tablica);

        int wynikMnozenia = MnozenieElementow(tablica);
        System.out.println("Wynik mnożenia elementów tablicy: " + wynikMnozenia);


        int wynikDodawania = DodawanieElementow(tablica);
        System.out.println("Wynik dodawania elementów tablicy: " + wynikDodawania);


        int parzyste = Parzyste(tablica);
        System.out.println("Liczby parzyste z tablicy: " + parzyste);
    }
}
