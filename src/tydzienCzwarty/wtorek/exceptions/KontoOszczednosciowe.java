package tydzienCzwarty.wtorek.exceptions;

/**
 * Created by RENT on 2017-07-25.
 */
public class KontoOszczednosciowe implements Konto {

    private double bilans;

    public KontoOszczednosciowe() {
    }

    public KontoOszczednosciowe(double bilans) {
        this.bilans = bilans;
    }

    @Override
    public void Wpłata(double kwota) {
        if (kwota < 0){
            throw new IllegalArgumentException("Wplacana kwota nie może być ujemna");
        }
        bilans +=kwota;

    }

    @Override
    public double Wyplata(double kwota) throws Exception{
        if(kwota > bilans){
            throw new Exception("Nie masz tyle środków na koncie");
        }
        bilans -= kwota;
        return kwota;
    }

    @Override
    public double getBilans() {
        return bilans;

    }

    protected void setBilans(double bilans) {
        this.bilans = bilans;
    }


}
