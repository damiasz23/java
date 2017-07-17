package mojeDomowe;


import java.util.Scanner;

public class Kalkul {
    public static void main(String[] args) {

        int dodawanie;
        int odejmowanie;
        int mnozenie;
        int dzielenie;

        int liczba1;
        String operacja;
        int liczba2;

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        liczba1 = in.nextInt();

        System.out.println("Podaj znak działania (+, -, *, /): ");
        operacja = in.next();

        char znak = operacja.charAt(0);

        System.out.println("Podaj druga liczbę");
        liczba2 = in.nextInt();

        switch (znak){
            case '+':
                dodawanie = liczba1 + liczba2;
                System.out.println("Wynik dodawania to: " + dodawanie);
                break;

            case '-':
                odejmowanie = liczba1 - liczba2;
                System.out.println("Wynik odejmowania: " + odejmowanie);
                break;

            case '*':
                mnozenie = liczba1 * liczba2;
                System.out.println("Wynik mnożenia: " + mnozenie);
                break;

            case '/':

                    while (liczba2 <= 0){
                        System.out.println("Nie dzielimy przez 0!!");
                        System.out.println("Podaj pierwsza liczbę: ");
                        liczba1 = in.nextInt();

                        System.out.println("Podaj operację (+, -, *, /): ");
                        operacja = in.next();

                        System.out.println("Podaj druga liczbę: ");
                        liczba2 = in.nextInt();
                }
                dzielenie = liczba1 / liczba2;
                System.out.println("Wynik dzielenia to: " + dzielenie);
        }

    }
}
