package tydzienCzwarty.wtorek.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by RENT on 2017-07-25.
 */
public class Program {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int[] tab = new int[]{1, 2, 3, 4, 5};

        System.out.println("Podaj który index chcesz wyświetlić");
//        int num = in.nextInt();

        try {
            int num = in.nextInt();
            System.out.println(tab[num]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("WYJATEK pierwszy");
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("WYJATEK wpisałeć literę");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Ogólny błąd" + e.getMessage());
        }
        finally {
            System.out.println("Jestem w finally");
        }
        System.out.println("Koniec programu");
    }
}
