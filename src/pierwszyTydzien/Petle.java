package pierwszyTydzien;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-06.
 */
public class Petle {
    public static void main(String[] args) {

//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("-----------------------------");
//
//        int licznik = 1;
//
//        while (licznik <= 100) {
//            System.out.println(licznik);
//            licznik++;
//        }
//
//        System.out.println("--------------------------------");
//
//        for (int i = 1; i <= 500; i++) {
//            if ((i % 7 == 0)) {
//                System.out.println("Liczby podzielen przez 7: " + i);
//            }
//
//        }
//        System.out.println("------------------------------------");

//        String tekst = "Długość             Stringa";
//        System.out.println("Długość Stringa to: " + tekst.length());

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj napis: ");
        String napis = in.nextLine();

        int licznik1 = 0;
        for (int i = 0; i < napis.length(); i++) {
            char znak = napis.charAt(i);

            if (znak == ' ') {
                //System.out.println("Napotkano spacje");
                continue;

            }
            licznik1++;

           // System.out.println("Długość napisu to: " + licznik1);

        }
        System.out.println("Długość napisu to: " + licznik1);
    }
}




