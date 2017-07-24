package domowe.zadanie8;

import java.util.Scanner;

/**
 * Created by olaIdamian on 7/24/2017.
 */
public abstract class Figura {


    private int a;
    private double b ;
    private double c;
    private double d;
    private double promien;
    private double wysokosc;


    public Figura(int a) {
        this.a = a;

    }


    public Figura(int a, double b) {
        this.a = a;
        this.b = b;
    }

    public Figura(double promien){
        this.promien = promien;
    }

    public Figura(int a, double b, double c, double d,double wysokosc) {
        this(a, b);
        this.c = c;
        this.d = d;
        this.wysokosc = wysokosc;
    }



    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
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

    public abstract double pole();

    public abstract double obwod();
}

