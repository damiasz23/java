package drugiTydzie.piatek.promien;


import drugiTydzie.piatek.promien.Kolo;

import java.util.Scanner;

/**
 * Created by olaIdamian on 7/14/2017.
 */
public class Main1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj promiń koła: ");
        double promien = in.nextDouble();

        Kolo kolo = new Kolo();
        kolo.promien = promien;
        kolo.Obwod();

        kolo.Area();
        System.out.println(" Pole koła o promieniu: " + promien + " wynisi: " + kolo.Area());

        kolo.Obwod();
        System.out.println(" Obwód koła o promieniu: " + promien + " wynisi: " + kolo.Obwod());


    }
}
