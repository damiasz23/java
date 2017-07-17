package drugiTydzie.piatek.firmaZajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-17.
 */
public class CompanyExcercise {


    private Company myCompany;

    public CompanyExcercise(Company myCompany) {
        this.myCompany = new Company();
    }

    public void start(){

        Scanner in = new Scanner(System.in);


        System.out.println("CWybierz opcje: ");
        System.out.println("0. Wyjdz z programu");
        System.out.println("1. Dodaj nowego pracownika");
        System.out.println("2. Usuń pracownika");
        System.out.println("3. Wypisz pracownika");
        int option = in.nextInt();

        switch (option){
            case 1: {
                Employee nextEmp = new Employee();
                System.out.println("Podaj imie");
                nextEmp.setName(in.next());

                System.out.println("Podaj nazwisko");
                nextEmp.setSurname(in.next());

                System.out.println("Podaj wiek");
                nextEmp.setAge(in.nextInt());

                System.out.println("Podaj pensje");
                nextEmp.setSalary(in.nextInt());


                break;
            }

            case 2: {

                break;
            }

            case 3: {

                break;

            }

            case 0: {

                break;
            }
        }

    }
}
