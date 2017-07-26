package tydzienCzwarty.poniedzialek;

import tydzienCzwarty.poniedzialek.Figura;

/**
 * Created by olaIdamian on 7/25/2017.
 */
public class Trapez extends Figura {

    private double a;
    private double b;
    private double c;
    private double d;
    private double h;


    public Trapez(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public Trapez(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double pole() {
        return (a + b)/2 * h;
    }

    @Override
    public double obwod() {
        return a + b + c + d;
    }
}
