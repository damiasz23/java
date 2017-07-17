package drugiTydzie.piatek.firmaZajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-17.
 */
public class CompanyExcercise {


    private Scanner in;
    private Company myCompany;

    public CompanyExcercise() {
        this.myCompany = new Company();
        in = new Scanner(System.in);
    }


    public void start(){

        boolean exit = false;

        Scanner in = new Scanner(System.in);




        while (exit==false){
            System.out.println("Wybierz opcje: ");
            System.out.println("1. Dodaj nowego pracownika");
            System.out.println("2. Usuń pracownika");
            System.out.println("3. Wypisz pracownika");
            System.out.println("0. Wyjdz z programu");
            int option = in.nextInt();
            switch (option){
                case 1: {
                    addEmployeeToMyCompany(); // lokalna metoda
                    break;
                }

                case 2: {
                    deleteEmployeeFromMyCompany();
                    break;
                }

                case 3: {
                    printAllEmployees();
                    break;
                }

                case 0: {
                    exit = true;
                    break;
                }
                default:{
                    System.out.println("Nie ma takiej opcji - podaj jeszcze raz!!");
                    break;
                }
            }
        }



    }

    public void addEmployeeToMyCompany(){

        Employee nextEmp = new Employee();
        System.out.println("Podaj imie");
        nextEmp.setName(in.next());

        System.out.println("Podaj nazwisko");
        nextEmp.setSurname(in.next());

        System.out.println("Podaj wiek");
        nextEmp.setAge(in.nextInt());

        System.out.println("Podaj pensje");
        nextEmp.setSalary(in.nextInt());

        myCompany.addEmployee(nextEmp);

    }

    public void deleteEmployeeFromMyCompany(){

    }

    public void printAllEmployees(){
        myCompany.printEmployees();

    }

}
