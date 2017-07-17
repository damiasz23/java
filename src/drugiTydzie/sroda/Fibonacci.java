package drugiTydzie.sroda;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-12.
 */
public class Fibonacci {

    public static int Fibonacci(int n){
        int a = 0;
        int b = 1;
        int wynik= 0;

        for (int i = 1;i < n; i++){
            wynik = a + b;
            a = b;
            b = wynik;
        }
        return wynik;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Wpisz wartość: ");
        int n = in.nextInt();
        int wynik = Fibonacci(n);
        System.out.println(wynik);

    }

}
