package drugiTydzie.piatek.firma;

import java.util.Scanner;

/**
 * Created by olaIdamian on 7/14/2017.
 */
public class Pracownik {


    private String name;
    private String surname;
    private int salary;


    public String getImie() {
        return name;

    }

    public void setImie(String imie) {
        this.name = imie;
    }

    public String getNazwisko() {
        return surname;
    }

    public void setNazwisko(String nazwisko) {
        this.surname = nazwisko;
    }

    public int getZarobki() {
        return salary;
    }

    public void setZarobki(int zarobki) {
        this.salary = zarobki;
    }

    public String WPisywanieDanych() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj imie pracownika: ");
        name = in.nextLine();
        System.out.println("Podaj nazwisko pracownika: ");
        surname = in.nextLine();
        System.out.println("Podaj ile zarabia (zł) pracownik: ");
        salary = in.nextInt();
//        String dane = imie + nazwisko + zarobki;
        return name + surname + salary;
    }

//    public  void WypisywanieDanych(){
//        System.out.println("Imię: " + this.imie +"\nNazwisko: " + this.nazwisko + " \nZarobki: " + this.zarobki + "zł");
//
//    }
//    public String WPisywanieNazwisk() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj nazwisko pracownika: ");
//        nazwisko = in.nextLine();
//        return nazwisko;
//    }
//
//    public int WpisywanieZarobkow(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj ile zarabia pracownik: ");
//        zarobki = in.nextInt();
//        return zarobki;
//    }



}
