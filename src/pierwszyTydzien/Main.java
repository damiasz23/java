package pierwszyTydzien;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        double temperature = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj temperature w celcjuszach");
        double temp = in.nextDouble();
        temperature = ((temperature + 1.8 * temp + 32));

        System.out.println("Temperatura w farentihach to: " + temperature );



//        System.out.println("Hello World!");
//
//        int wiek = 12;
//        byte b = (byte) wiek;
//
////1 1 1 1 1 0 1 0
//        System.out.println(128+ 64 +32 +16 +8 +0 +2 +0);
    }
}
