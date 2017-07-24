package domowe.zadanie8;

/**
 * Created by olaIdamian on 7/24/2017.
 */
public class Trapez extends Figura {

    public Trapez(int a, double b, double c, double d,double wysokosc) {
        super(a, b, c, d, wysokosc);
    }

    @Override
    public double pole() {
        return (getA() + getB())/2 * getWysokosc();
    }

    @Override
    public double obwod() {
        return getA() + getB() + getC() + getD();
    }
}
