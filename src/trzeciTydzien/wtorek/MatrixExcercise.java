package trzeciTydzien.wtorek;

import trzeciTydzien.wtorek.Matrix;

/**
 * Created by RENT on 2017-07-18.
 */
public class MatrixExcercise {
    public void start(){
        Matrix matrix1 = new Matrix(3, 3);
        matrix1.initializeMatrix();
        matrix1.printMatrix();

        Matrix matrix2 = new Matrix(3, 3);
        matrix2.initializeMatrix();
        matrix2.printMatrix();

        Matrix wynik = matrix1.addMatrix(matrix2);
        wynik.printMatrix();

        Matrix wynik1 = matrix1.subMatrix(matrix2);
        wynik1.printMatrix();
    }
}
