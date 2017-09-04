package phone;

import javax.sound.midi.Soundbank;
import java.util.Scanner;



public class Main {

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.printListOfContacts();


        boolean quit = false;
        whatToDo();
        int action = in.nextInt();

        while (!quit) {


            switch (action) {
                case 0: {

                    break;
                }
                case 1: {
                    addNewContact();

                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {


                    break;
                }
                case 5: {

                    break;

                }
                case 6: {

                }
            }


        }

    }


    public static void whatToDo(){

        Scanner in = new Scanner(System.in);
        System.out.println("Co chcesz zrobić? Wybierz liczby od 0-6");
        System.out.println("0. Wyjdz\n" +
                "1. Lista kontaktów\n" +
                "2. Dodaj kontakt\n" +
                "3. Usuń kontakt\n" +
                "4. Edytuj kontakt\n" +
                "5. Znajdz kontakt\n" +
                "6. Wypisz kontakty\n");
    }

    public static void addNewContact(){
        System.out.println("Podaj imie");
        String name = in.next();
        System.out.println("Podaj numer telefonu");
        String phoneNumber = in.next();
        Contact contact = Contact.createContact(name, phoneNumber);



    }




}
