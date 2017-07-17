package drugiTydzie.poniedzialek;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class Tablice2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[][] macierz = new int[3][3];

        System.out.println("Podaj elementy macierzy:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                macierz[i][j] = in.nextInt();


            }
        }


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

    }
}

