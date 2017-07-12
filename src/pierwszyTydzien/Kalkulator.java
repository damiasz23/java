package pierwszyTydzien;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-05.
 */
public class Kalkulator {
    public static void main(String[] args){

        double a;
        String b;
        double c;

        double dodawanie;
        double odejmowanie;
        double mnozenie;
        double dzielenie;



        Scanner in = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbę: ");
        a = in.nextDouble();

        System.out.println("Podaj operację (+, -, *, /): ");
        b = in.next();

        System.out.println("Podaj druga liczbę: ");
        c = in.nextDouble();

        char ch= b.charAt(0); //rzutuje String na char



        switch (ch){
            case '+':
                dodawanie = a + c;
                System.out.println("Wynik dodawania to: "+ dodawanie);
                break;

            case '-':
                odejmowanie = a - c;
                System.out.println("Wynik odejmowania to : " + odejmowanie);
                break;

            case '*':
                mnozenie = a * c;
                System.out.println("Wynik mnożenia to: " + mnozenie);
                break;


            case '/':

                while(c==0){
                    System.out.println("Nie dzielimy przez 0!!");
                    System.out.println("Podaj pierwsza liczbę: ");
                    a = in.nextDouble();

                    System.out.println("Podaj operację (+, -, *, /): ");
                    b = in.next();

                    System.out.println("Podaj druga liczbę: ");
                    c = in.nextDouble();

                }
                dzielenie = a / c;
                System.out.println("Wynik dzielenia to: " + dzielenie);
                break;

        }



    }

}
