package domowe.zadanie8;

/**
 * Created by olaIdamian on 7/24/2017.
 */
public class Kolo extends Figura {

    public Kolo(double promien) {
        super(promien);
    }

    @Override
    public double pole() {
        return Math.PI * getPromien()*getPromien();
    }


    @Override
    public double obwod() {
        return 2 * Math.PI * getPromien();
    }
}
