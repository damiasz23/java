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
            System.out.println("4. Pokaż średnia pensję pracowników");
            System.out.println("5. Pokaż średni wiek pracownika");
            System.out.println("6. Pokaż najwyższą pensję");
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
                    printAllEmploees();
                    break;
                }

                case 4: {
                    printAverageSalary();
                    break;

                }
                case 5: {
                    printAverageAge();
                    break;
                }
                case 6: {
                    printHighestSalary();
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



    public void printAllEmployeesBad(){ //zła metoda, po wybraniu 3 bez wpisania pracowników wyrzuca nullPointException

        myCompany.printEmployeesBad();

    }
    public void printAllEmploees(){
        myCompany.printEmployees();
    }

    public void printAverageSalary(){
        double result = myCompany.countAverageSalary();
        System.out.println("Średnia pensja to: " + result);

    }

    public void printAverageAge(){
        double result = myCompany.countAverageAge();
        System.out.println("Średni wiek pracownika to: " + result);

    }
    public void printHighestSalary(){

        Employee result = myCompany.getEmployeeWithHigestSalary();
        System.out.println("Najwyższa pensja to: " + result.getSalary() + " i otrzymuje ją: " +  result.getName() + " " + result.getSurname());
    }
}
