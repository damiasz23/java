package commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String name;
    private String surneme;
    private int age;
    private double salary;
    private Address address;

    public Employee(String name, String surneme, int i, double salary) {
        this.name = name;
        this.age = age;
        this.surneme = surneme;
        this.salary = salary;
    }
}
