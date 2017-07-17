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

    public void printEmployees(){
        for(Employee e : employees){
            e.describeEmploeey();
        }
    }

    public void addEmployee(Employee nextEmployee){
        employees[numerOfEmployees] = nextEmployee;
        numerOfEmployees++;

    }
}
