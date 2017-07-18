package trzeciTydzien;

/**
 * Created by RENT on 2017-07-18.
 */
public class MatrixExcercise {
    public void start(){
        Matrix matrix1 = new Matrix();
        matrix1.initializeMatrix();
        matrix1.printMatrix();

        Matrix matrix2 = new Matrix();
        matrix2.initializeMatrix();
        matrix2.printMatrix();

        Matrix wynik = matrix1.addMatrix(matrix2);
    }
}
