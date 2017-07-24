package domowe.zadanie8;

import java.util.Scanner;

/**
 * Created by olaIdamian on 7/24/2017.
 */
public class Kwadrat extends Figura {


    public Kwadrat(int a) {
        super(a);
    }



    @Override
    public double pole() {
        return getA()*getA();
    }

    @Override
    public double obwod() {
        return getA()*4;
    }
}
