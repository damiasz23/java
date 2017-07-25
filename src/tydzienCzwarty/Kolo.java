package tydzienCzwarty;

/**
 * Created by olaIdamian on 7/25/2017.
 */
public class Kolo extends Figura {

    private double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        if(promien < 0){
            System.out.println("Ujemna wartość");
        }
        this.promien = promien;
    }

    @Override
    public double pole() {
        return Math.PI*Math.pow(promien, 2);
    }

    @Override
    public double obwod() {
        return 2 * Math.PI * promien;
    }
}
