package drugiTydzie.czwartek;

/**
 * Created by RENT on 2017-07-13.
 */
public class Pracownik {

//    utworzenie pola klasy
    public String imie; //pole
    public String nazwisko; //pole
    public int wiek;  //pole
    private float pensja;

   public Pracownik(){
        pensja = 2000;
           }

//    metody klasy Pracownik
    public void Opis(){
        System.out.println("Pracownik");
    }

    public void OpiszPracownika(){
        System.out.println("Imie: " + this.imie + "\nNazwisko: " + this.nazwisko + " \npensja " + pensja );
    }

    public float Podwyzka(float procent){
        float kwota = pensja * procent/100;
        pensja += kwota;
        return pensja;
    }

    public void WpiszPensje(){
//        System.out.println("Pensja po podwyzce to: " + pensja);
    }
}
