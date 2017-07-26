package tydzienCzwarty.poniedzialek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Figura[] figury = new Figura[10];

        boolean wyjscie = false;

        int liczbaFigur = 0;

        while (wyjscie == false){

            Figura figura = null;

            System.out.println("Jaka figura?");
            System.out.println("1. Kwadrat");
            System.out.println("2. Prostokąt");
            System.out.println("3. Koło");
            System.out.println("4. Trapez");
            System.out.println("0. Exit");
            int wybor = in.nextInt();
            System.out.println("Co obliczamy?");
            System.out.println("p - Pole");
            System.out.println("o - Obwód");
            String obliczenia = in.next();
            char obl= obliczenia.charAt(0);


            switch (wybor){
                case 1:{
                    System.out.println("Podaj bok kwadratu");
                    double bok = in.nextDouble();
                    Figura kwadrat = new Kwadrat(bok);
                    switch (obl) {
                        case 'p': {
                            System.out.println("Pole kwadratu to: " + kwadrat.pole());
                            break;
                        }
                        case 'o': {
                            System.out.println("Obwód kwadratu to: " + kwadrat.obwod());
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("Podaj pierwszy bok prostokąta");
                    double bokA = in.nextDouble();
                    System.out.println("Podaj drugi bok prostokąta");
                    double bokB = in.nextDouble();
                    Figura prostokat = new Prostokat(bokA, bokB);

                    switch (obl){
                        case 'p':{
                            System.out.println("Pole prostokąta to: " + prostokat.pole());
                            break;
                        }
                        case 'o':{
                            System.out.println("Obwód prostokąta to: " + prostokat.obwod());
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Podaj promień koła");
                    double promien = in.nextDouble();
                    Figura kolo = new Kolo(promien);
                    switch (obl){
                        case 'p':{
                            System.out.println("Pole koła to: " + kolo.pole());
                            break;
                        }
                        case 'o':{
                            System.out.println("Obwód koła to: " + kolo.obwod());
                            break;
                        }
                    }
                    break;
                }
                case 4:{
                    switch (obl) {
                        case 'p': {
                            System.out.println("Podaj pierwszy bok trapezu");
                            double bokA = in.nextDouble();
                            System.out.println("Podaj drugi bok trapezu");
                            double bokB = in.nextDouble();
                            System.out.println("Podaj wysokość trapezu");
                            double wysokosc = in.nextDouble();
                            Figura trapez = new Trapez(bokA, bokB, wysokosc);
                            System.out.println("Pole trapezu to: " + trapez.pole());
                            break;
                        }
                        case 'o':{
                            System.out.println("Podaj pierwszy bok trapezu");
                            double bokA = in.nextDouble();
                            System.out.println("Podaj drugi bok trapezu");
                            double bokB = in.nextDouble();
                            System.out.println("Podaj trzeci bok trapezu");
                            double bokC = in.nextDouble();
                            System.out.println("Podaj czwarty bok trapezu");
                            double bokD = in.nextDouble();
                            Figura trapez = new Trapez(bokA, bokB, bokC, bokD);
                            System.out.println("Obwód trapezu to: " + trapez.obwod());
                            break;
                        }
                    }
                    break;
                }
                case 0:{
                    System.out.println("Wyjście z programy");
                    wyjscie = true;
                    break;
                }
            }
        }
    }
}
