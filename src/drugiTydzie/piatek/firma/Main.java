package drugiTydzie.piatek.firma;

import drugiTydzie.piatek.firma.Pracownik;

/**
 * Created by olaIdamian on 7/14/2017.
 */
public class Main {

    public static void main(String[] args) {


        Pracownik pracownik = new Pracownik();
        pracownik.WPisywanieDanych();
        System.out.println();
//        pracownik.WypisywanieDanych();

//        pracownik.WPisywanieNazwisk();
//        pracownik.WpisywanieZarobkow();



       System.out.println("Imię: " + pracownik.getImie() +"\nNazwisko: " + pracownik.getNazwisko() + " \nZarobki: " + pracownik.getZarobki() + "zł");



    }
}
