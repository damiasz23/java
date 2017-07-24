package domowe.zadanie8;

/**
 * Created by olaIdamian on 7/24/2017.
 */
public class Prostokat extends Figura {



    public Prostokat(int a, double b) {
        super(a, b);
    }

    @Override
    public double pole() {
        return getA()*getB();
    }

    @Override
    public double obwod() {
        return (2 * getA()) + (2 * getB());
    }
}
