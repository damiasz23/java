package tydzienCzwarty;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-24.
 */
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
            int wybor = in.nextInt();
            System.out.println("Co obliczamy?");
            System.out.println("P - Pole");
            System.out.println("O - Obwód");
            int obliczenia = 1;
        }
    }
}
