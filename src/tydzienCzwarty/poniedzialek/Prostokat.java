package tydzienCzwarty.poniedzialek;

import tydzienCzwarty.poniedzialek.Figura;

/**
 * Created by olaIdamian on 7/25/2017.
 */
public class Prostokat extends Figura {

    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a < 0){
            System.out.println("Ujemna wartość");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b < 0){
            System.out.println("Ujemna wartość");
        }
        this.b = b;
    }

    @Override
    public double pole() {
        return a * b;
    }

    @Override
    public double obwod() {
        return 2 * a + 2 * b;
    }
}
