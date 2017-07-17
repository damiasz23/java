package pierwszyTydzien;

import java.util.Scanner;
public class Cwiczenia {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj swój wiek");
//        int wiek = in.nextInt();
//
//
//        if (wiek >= 18){
//                System.out.println("Jesteś pełnoletni");
//        }
//        else if (wiek == 32){
//            System.out.println("Jesteś ramolem");
//        }
//        else {
//            System.out.println("Jesteś niepełnoletni");
//        }

        double BMI;
        Scanner inn = new Scanner(System.in);
        System.out.println("Podaj swoja wagę w kg");
        double waga = inn.nextDouble();
        System.out.println("Podaj swój wzrost w cm");
        double wzrost = inn.nextDouble();
        wzrost = wzrost /100;
        BMI= waga/(wzrost*wzrost);

        double granica = 24.9 - BMI;


        //System.out.println(BMI);

        if (BMI <= 18.5) {
            System.out.println("Masz niedowage");
        }
        else if (BMI >= 24.9){
            System.out.println("Masz nadwage");
        }
        else if (BMI <= 18.5 && BMI >= 24.9){
            System.out.println("Jest ok2");
        }
//        else {
//            System.out.println("Jest ok");
//
//        }
        System.out.println("Twoje BMI to: " + BMI);


        System.out.println("Do granicy BMI brakuje Ci: " + granica );
    }
}
