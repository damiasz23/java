package tydzienCzwarty;

/**
 * Created by RENT on 2017-07-24.
 */
public class Kwadrat extends Figura {

    private double a;



    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a < 0){
            System.out.println("Bok nie może być ujemny");
        }
        this.a = a;
    }

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double pole() {
        return a * a;
    }

    @Override
    public double obwod() {
        return 4 * a;
    }
}
