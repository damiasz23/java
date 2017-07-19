package trzeciTydzien.wtorek;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-18.
 */
public class Matrix {

    private int[][] macierz;
    private int m;
    private int n;
    private int[][] secondMacierz;


    public Matrix(int n, int m){
        this.n = n;
        this.m = m;
        this.macierz = new int[m][n];
        if(n < 0 && m < 0){
            System.out.println("Wymiary macierzy nie moga być ujemne");
        }

    }



    public int[][] getMacierz() {
        return macierz;
    }

    public void setMacierz(int[][] macierz) {
        this.macierz = macierz;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getSecondMacierz() {
        return secondMacierz;
    }

    public void setSecondMacierz(int[][] secondMacierz) {
        this.secondMacierz = secondMacierz;
    }

    public void initializeMatrix(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj element macierzy");
        for(int i = 0; i< m ;i++) {
            for (int j = 0; j < n; j++) {
                macierz[i][j]= in.nextInt();
            }
        }
    }

    public void printMatrix(){
        for(int i = 0; i< m ;i++){
            for(int j =0;j < n; j++){
                System.out.print(macierz[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

    }

    public Matrix addMatrix(Matrix drugaMacierz){

        Matrix wynikowa = new Matrix(3, 3);

        if(this.m == drugaMacierz.getM() && this.n == drugaMacierz.getN()) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    wynikowa.getMacierz()[i][j] = this.macierz[i][j] + drugaMacierz.macierz[i][j]; //na obiekcie "wynikowa" chcemy dostac sie do pól, uzywamy do tego gettera "getMacierz".
                }
            }
            return wynikowa;
        }
        else{
            return wynikowa;
        }


    }
    public Matrix subMatrix(Matrix trzeciaMacierz){
        Matrix wynikowa = new Matrix(3, 3);

        for (int i = 0 ; i < m ; i++) {
            for (int j = 0; j < m; j++) {
                wynikowa.getMacierz()[i][j] = this.macierz[i][j] - trzeciaMacierz.macierz[i][j];

            }
        }
            return wynikowa;
    }

}

