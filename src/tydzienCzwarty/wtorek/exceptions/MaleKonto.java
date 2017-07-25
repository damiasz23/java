package tydzienCzwarty.wtorek.exceptions;

/**
 * Created by RENT on 2017-07-25.
 */
public class MaleKonto extends KontoOszczednosciowe {

    private double limit;



    public MaleKonto(double bilans) {
        super(bilans);
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public double Wyplata(double kwota) throws Exception {
        if (kwota > limit) {
            throw new Exception("Nie masz tyle środków");
        }
        return super.Wyplata(kwota);
    }
}
