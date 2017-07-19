package trzeciTydzien.sroda;

/**
 * Created by RENT on 2017-07-19.
 */
public class MathHelper {


//    przeciążanie metod - najwazniejsze sa sygnatury tj. np sum (int, int), typ zwracany nie nalezy do sygnatury

//      sygnatura sum(int, int)
    public int sum(int a, int b){
        return a + b;
    }
//     sygnatura sum(double, double)
    public double sum(double a, double b){
        return a + b;
    }
//     sygnatura sum(float, float)
    public float sum(float a, float b){
        return a + b;
    }
}
