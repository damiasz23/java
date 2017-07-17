package drugiTydzie.poniedzialek;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class Tablice2D2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int[][] macierz = new int[x][y];

        System.out.println("Podaj elementy macierzy:");

        for (int i = 0; i < macierz.length; i++) { // (int i = 0; i < x; i++)
            for (int j = 0; j < macierz[i].length; j++) { // (int j = 0; j < y; j++)
                macierz[i][j] = in.nextInt();


            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }

    }
}



