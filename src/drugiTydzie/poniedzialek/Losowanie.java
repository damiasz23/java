package drugiTydzie.poniedzialek;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-10.
 */
public class Losowanie {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[] tablica = new int[20];

        for( int i = 0; i < tablica.length; i ++){
            tablica[i] = random.nextInt(10);

        }
        System.out.println("Podaj liczbe - sprawdze czy taka jest");
        // while zeby pytalo tak dlugo az nie trafisz
        int liczba = in.nextInt();

        boolean czyObca = false;

        for(int i = 0 ; i < tablica.length; i ++){
            if(tablica[i] == liczba){
                czyObca = true;
                break;
            }
        }
       if (czyObca){
           System.out.println("Mam taka liczbe");
       }
       else {
           System.out.println("Nie mam takiej liczby");
       }
    }

    /**
     * Created by RENT on 2017-07-10.
     */
    public static class Zadanie2 {
        public static void main(String[] args) {

            int ciagLiczb;


            Scanner in = new Scanner(System.in);
            System.out.println("Podaj ilość liczb: ");
            ciagLiczb = in.nextInt();

            int[] tablica = new int[ciagLiczb];
            int[] tablicaWynikowa = new int [ciagLiczb]; // tablica do wypisania licz pierwotnych

            for (int i = 0; i < tablica.length ;i ++ ){
                System.out.println("Podaj liczby do pomnożenia");
                tablica[i] = in.nextInt();
                tablica[i] = tablica[i] * tablica[i];

            }
            for (int element : tablica){

                System.out.println("Pierwotna liczba to: " + " Kwadraty liczb to: " +  element);
            }

            }



        }
}
