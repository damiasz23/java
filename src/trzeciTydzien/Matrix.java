package trzeciTydzien;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-18.
 */
public class Matrix {

    private int[][] macierz;
    private int m;
    private int n;
    private int[][] secondMacierz;


    public Matrix(){
        n = 3;
        m = 3;
        macierz = new int[m][n];
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

    }

    public Matrix addMatrix(Matrix drugaMacierz){

        Matrix wynikowa = new Matrix();

        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < m ; j++){
                wynikowa.getMacierz()[i][j] = this.macierz[i][j] + drugaMacierz.getMacierz()[i][j];
            }
        }
        return wynikowa;


    }
    public void addMatrixToMatrix(Matrix n){


//        for ( int i = 0 ; i < m ; i++ )
//            for ( int j = 0 ; j < n ; j++ )
//                sum[i][d] = first[i][d] + second[i][d];

    }
}

