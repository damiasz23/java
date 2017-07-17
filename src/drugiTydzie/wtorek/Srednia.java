package drugiTydzie.wtorek;

/**
 * Created by RENT on 2017-07-11.
 */
public class Srednia {

    public static int SredniaTablicy(int[] tablica){
        int srednia = 0;
        int suma = 0;
        for (int i =0;i < tablica.length; i++){
            suma +=tablica[i];
            srednia = suma/tablica.length;
        }
        return srednia;
    }
    public static void main(String[] args) {

        int[] tablica = new int[]{1, 2, 3, 5, 7, 9, 10};

        double srednia = SredniaTablicy(tablica);
        System.out.println("Srednia liczb z tablicy " + srednia);

    }
}
