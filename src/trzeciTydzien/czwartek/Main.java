package trzeciTydzien.czwartek;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-20.
 */
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj pierwszy współczynniki");
        double a = in.nextDouble();
        System.out.println("Podaj drugi współczynniki");
        double b = in.nextDouble();
        System.out.println("Podaj trzeci współczynniki");
        double c = in.nextDouble();

        BinomialSolver bio = new BinomialSolver(a, b, c);
        bio.count();

//        double x1 = bio.getX1();
//        double x2 = bio.getX2();

        System.out.println("Podaj wartość x: ");
        double x = in.nextDouble();
        System.out.println(bio.calculate(x));

    }
}
