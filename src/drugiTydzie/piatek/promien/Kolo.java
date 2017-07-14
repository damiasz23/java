package drugiTydzie.piatek.promien;

/**
 * Created by olaIdamian on 7/14/2017.
 */
public class Kolo {

    public double promien;

    public double Area(){
        double pole = Math.PI * (promien*promien);
        return pole;
    }

    public double Obwod(){
        double obwod = 2 * Math.PI * promien;
        return obwod;
    }
}
