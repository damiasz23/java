package mojeDomowe;

/**
 * Created by olaIdamian on 7/12/2017.
 */
public class Metoda {

    public static int Mnozenie(int[] tablica){

        int wynik = 1;// przy mnozeniu zmienna nie moze byc 0!!!!!!!!!

        for(int i =0; i < tablica.length; i++){
            wynik*=tablica[i];
        }
        return wynik;

    }
    public static void main(String[] args) {


        int[] tablica = new int[]{2, 4, 6, 8};
        int iloczyn = Mnozenie(tablica);
        System.out.println(iloczyn);

        int suma = 1;
        int[] tablica1 = new int[]{3,6,9};
        for (int i =0; i < tablica1.length; i++){
            suma*=tablica1[i];
        }
        System.out.println(suma);

    }
}
