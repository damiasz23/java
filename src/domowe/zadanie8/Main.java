package domowe.zadanie8;
import domowe.zadanie8.Figura;

/**
 * Created by olaIdamian on 7/24/2017.
 */
public class Main {

    public static void main(String[] args) {

        Figura kwadrat = new Kwadrat(2);
        System.out.println("Pole kwadratu to: " + kwadrat.pole());
        System.out.println("Obwód kwadratu to: " + kwadrat.obwod());
        System.out.println();

        Figura prostokat = new Prostokat(3,6);
        System.out.println("Pole prostokątu to: " + prostokat.pole());
        System.out.println("Odwód prostokątu to: " + prostokat.obwod());
        System.out.println();

        Figura kolo = new Kolo(3);
        System.out.println("Pole koła to: " + kolo.pole());
        System.out.println("Obwód koła to: " + kolo.obwod());
        System.out.println();

        Figura trapez = new Trapez(2, 5, 4, 6, 4);
        System.out.println("Pole trapezu to: " + trapez.pole());
        System.out.println("Obwód trapezu to: " + trapez.obwod());
        System.out.println();


    }
}
