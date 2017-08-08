import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class Palindrom {
    public static void main(String[] args){

        String original;
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj zdanie max do 30 znaków");
        original = in.nextLine();

        if (original.length()<= 30) {
            for(int i = original.length()-1; i >=0; i--){
                char znak = original.charAt(i);
                System.out.print(znak);
            }
        }
        else{
            System.out.println("Zdanie ma więcej niz 30 znaków");
        }
    }
}