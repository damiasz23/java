package drugiTydzie.piatek.firmaZajecia;

/**
 * Created by RENT on 2017-07-14.
 */
public class Employee {

    private String name;
    private String surname;
    private int age;
    private double salary;


    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }



    public String getSurname() {
        return surname;
    }
    public void setSurname(String s) {
        this.surname = s;
    }



    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        if(a < 0) {
            System.out.println("WIek nie może być ujemny");

        }else{
            this.age = a;
        }
    }


    public double getSalary() {
        return salary;
    }
    public void setSalary(double sal) {
        if(sal < 0) {
            System.out.println("Pensja nie może być mniejsz aniż zero");

        }else{
            this.salary = sal;
        }
    }

    public void describeEmploeey(){
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Age: " + this.age);
    }

}
