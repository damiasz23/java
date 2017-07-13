import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class Palindrom {
    public static void main(String[] args){

        String original, odwrotnie;
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj zdanie max do 30 znaków");
        original = in.nextLine();

        int length = original.length();


        if (original.length()<= 30) {

            for(int i = 0; i <= original.length(); i--){
                char znak = original.charAt(i);
                System.out.println(znak);


            }

        }
        else{
            System.out.println("Zdanie ma więcej niz 30 znaków");
        }



    }
}