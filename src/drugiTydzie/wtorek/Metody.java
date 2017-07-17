package drugiTydzie.wtorek;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-11.
 */
public class Metody {

//    public static void PrintMessage(String imie){
//        System.out.println("Siema " + imie );
//    }
//
//    public static void DaneUzytkownika(String imie, String nazwisko, int wiek){
//        System.out.println("Masz na imie " + imie);
//        System.out.println("nazywasz się " + nazwisko);
//        System.out.println("Masz lat " + wiek);
//    }

    public static void DrukujTablice(int[] tablica){
        for (int i : tablica){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj imie");
//        String imie = in.nextLine();
//
//        System.out.println("Podaj nazwisko");
//        String nazwisko = in.nextLine();
//
//        System.out.println("Podaj wiek");
//        int wiek = in.nextInt();

        int[] tablica = new int[]{1, 2, 3, 4, 5};

//        PrintMessage(imie);
//        DaneUzytkownika(imie, nazwisko, wiek);
        DrukujTablice(tablica);

    }
}
