package drugiTydzie.piatek.firmaZajecia;

/**
 * Created by RENT on 2017-07-14.
 */
public class Company {


    private String name;
    private Employee[] employees;
    private int numerOfEmployees;


    public Company() {
        employees = new Employee[10];
        numerOfEmployees = 0;
    }

    public void printEmployeesBad(){

        for(Employee e : employees) {
            e.describeEmploeey();
        }
    }

    public void printEmployees(){

        if(numerOfEmployees==0) {
            System.out.println("W firmie nie ma jeszcze pracowników, naciśnij 1 aby dodać pracownika.");
        }
        else{
            for(int i = 0; i < numerOfEmployees; i++){
                Employee emp = employees[i];
                emp.describeEmploeey();

            }
        }
    }

    public void addEmployee(Employee nextEmployee){
        employees[numerOfEmployees] = nextEmployee;
        numerOfEmployees++;

    }

    public double countAverageSalary(){
        double sum = 0;
        for(int i = 0; i < numerOfEmployees; i++){
            Employee nextEmp = employees[i];
            sum += nextEmp.getSalary();
        }
        return sum / numerOfEmployees;
    }

    public double countAverageAge(){

        double sum = 0;
        for (int i = 0; i < numerOfEmployees; i++){
            Employee nextEmp = employees[i];
            sum += nextEmp.getAge();
        }
        return sum/numerOfEmployees;
    }

    public Employee getEmployeeWithHigestSalary(){

        Employee maxEmp = null;
        double maxSal = 0;
        for (int i = 0; i < numerOfEmployees; i++){  // wypisujemy wszystkich pracowników
            Employee nextSal = employees[i];
            if(employees[i].getSalary() > maxSal){    //
                maxSal = nextSal.getSalary();
                maxEmp = employees[i];
            }
        }
        return maxEmp;
    }
}
