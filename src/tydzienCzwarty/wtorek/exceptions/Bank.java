package tydzienCzwarty.wtorek.exceptions;

/**
 * Created by RENT on 2017-07-25.
 */
public class Bank {
    public static void main(String[] args) {

        KontoOszczednosciowe ko = new KontoOszczednosciowe();
        try {
            ko.Wyplata(400);
        } catch (Exception e) {
            System.out.println("Błąd \n" + e.getMessage());
        }

        MaleKonto mk = new MaleKonto(1500);
        try {
            mk.Wyplata(800);
        } catch (Exception e) {
            System.out.println("Małe konto, kwota większa od limitu \n" + e.getMessage());
        }
    }
}
