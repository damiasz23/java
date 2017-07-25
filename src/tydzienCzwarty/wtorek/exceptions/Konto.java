package tydzienCzwarty.wtorek.exceptions;


public interface Konto {

    void Wpłata(double kwota);
    double Wyplata(double kwota) throws Exception;
    double getBilans();


}
