package pierwszyTydzien;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-07.
 */
public class Ascii {
    public static void main(String[] args){

        char duze;
        char male;


        Scanner in = new Scanner(System.in);

        System.out.println("Podaj zdanie max do 30 znaków");
        String zdanie = in.nextLine();




            if (zdanie.length()<= 30){
                System.out.println("Wybierz opcje");
                System.out.println("1. Małe na duze. \n2. Duze na male. \n3. Duze na male i male na duze\n4. Palindrom");

                int wybor = in.nextInt();
                String wynik="";

                switch(wybor){

                case 1: {
                    for(int i = 0; i < zdanie.length(); i++){
                        char znak = zdanie.charAt(i);

                        if(znak >= 97 && znak <= 122){
                            znak-=32;
                        }
                        wynik += znak;


                    }
                    System.out.println(wynik);
                    break;
                }

                    case 2:{
                        for(int i = 0; i < zdanie.length(); i++){
                            char znak = zdanie.charAt(i);

                            if(znak >= 65 && znak <= 90){
                                znak+=32;
                            }
                            wynik += znak;


                        }
                        System.out.println(wynik);
                        break;
                    }

                    case 3: {
                        for(int i = 0; i < zdanie.length(); i++){
                            char znak = zdanie.charAt(i);

                            if(znak >= 97 && znak <= 122){
                                znak-=32;
                            }
                            else if (znak >= 65 && znak <= 90){
                                znak+=32;
                            }
                            wynik += znak;
                        }
                        System.out.println(wynik);
                        break;
                    }
                    case 4: {

                    }
            }
        }
        else{
            System.out.println("Podałeś wiecej niż 30 znaków");
        }
    }
}
