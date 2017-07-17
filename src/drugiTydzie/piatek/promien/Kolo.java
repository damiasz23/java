package drugiTydzie.piatek.promien;

/**
 * Created by olaIdamian on 7/14/2017.
 */
public class Kolo {

    private double promien;


    public double getPromien(){
        return this.promien;
    }

    public void setPromien(double r){
        if(r <0 ){
            System.out.println("Promień nie może być ujemny");
        }
        else {
            this.promien = r;
        }
    }


    public double Area(){
        double pole = Math.PI * Math.pow(promien, 2);
        return pole;
    }

    public double Obwod(){
        double obwod = 2 * Math.PI * promien;
        return obwod;
    }
}
