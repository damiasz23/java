/**
 * Created by RENT on 2017-07-07.
 */
import java.util.Scanner;
public class Silnia {
    public static void main(String[] args){


            int silnia;
            Scanner in = new Scanner(System.in);
            System.out.println("Wproawdz liczbę naturalną: ");
            int n = in.nextInt();


            int iloczyn = 1;
            for (int i=1; i<=n; i++) {
                iloczyn *= i;



            }
            System.out.println("Silnia liczby: " + n + " to " + iloczyn);
        }

    }




