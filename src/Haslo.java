import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class Haslo {
    public static void main(String[] args){

        Scanner in= new Scanner(System.in);

        System.out.println("Wpisz haslo");
        String haslo = in.next();
        System.out.println("Wpisz ponownie");
        String hasloPonownie = in.next();


        if (haslo.equals(hasloPonownie)) {
            System.out.println("Haslo ok");

        }
        else {
            System.out.println("Haslo nie ok");
        }
    }
}
