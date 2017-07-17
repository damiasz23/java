package pierwszyTydzien;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-05.
 */
public class Liczba {
    public static void main(String[] args) {

        int max;
        int min;

        Scanner inn = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę: ");
        int a = inn.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = inn.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int c = inn.nextInt();

        System.out.println("Twoje liczby to: " + a + " " + b + " " + c);

        if (a > b){
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }

        if (c > max){
            max = c;

        }
        if  (c < min){
            min =c;
        }
        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);



//          Sposób 2
//        if (a < b && c < b){
//            System.out.println(b);
//        }
//        else if (a > b && a > c ){
//            System.out.println(a);
//
//        }
//        else {
//            System.out.println(c);
//
//
//        }if (a < b && a < c){
//            System.out.println(a);
//        }
//        else if (b < c && b < a){
//            System.out.println(b);
//
//        }
//        else {
//            System.out.println(c);
//        }

    }
}
