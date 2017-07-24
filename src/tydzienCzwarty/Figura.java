package tydzienCzwarty;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-24.
 */
public abstract class Figura {

    private double pole;
    private double obwod;

    public double getPole() {
        return pole;
    }

    public abstract double pole();
    public abstract double obwod();


    public void setPole(double pole) {
        if(pole < 0){
            System.out.println("Pole nie może byc ujemne");
        }
        this.pole = pole;
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double obwod) {
        if(obwod < 0 ){
            System.out.println("Obwód nie może byc ujemny");
        }
        this.obwod = obwod;
    }



}
