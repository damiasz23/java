package trzeciTydzien.czwartek;

/**
 * Created by RENT on 2017-07-20.
 */
public class BinomialSolver {

    private double a;
    private double b;
    private double c;


    private double x1;
    private double x2;

    private double x = 5;


    public BinomialSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX() {
        return x;
    }

    public void count(){
        double delta = b * b - 4 * a * c;
        if(delta > 0){
            x1 = (- b - Math.sqrt(delta))/(2 * a);
            x2 = (- b + Math.sqrt(delta))/(2 * a);
            System.out.println("Delta wieksza od 0 - wynik pierwszy: " + x1);
            System.out.println("Delta wieksza od 0 - wynik drugi: " + x2);

        }
        else if(delta == 0){
            x1 = - b /2 * a;
            System.out.println("Delta równa 0 - wynik:" + x1);
        }
        else{
            System.out.println("Delta nie może byc mniejsza od 0");

        }
    }
   public double calculate(double x){
       return a * x * x + 2 * x -3;

   }

}
