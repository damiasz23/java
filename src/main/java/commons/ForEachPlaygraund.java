package commons;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachPlaygraund {
    private List<Employee> employeeList = new ArrayList<>();
    public ForEachPlaygraund() {
        Employee Piotr = new Employee("Piotr", "Mucha", 15, 2342);
        Employee Adam = new Employee("Adam", "Xksinski", 17, 2590);
        Employee Pawel = new Employee("Pawel", "Wronowski", 26, 3000);
        Employee Matuesz = new Employee("Mateusz", "Wronowski", 22, 3900);
        employeeList.add(Piotr);
        employeeList.add(Adam);
        employeeList.add(Pawel);
        employeeList.add(Matuesz);
    }
    public void printAll() {
        employeeList.forEach(System.out::println);
        employeeList.forEach(employee -> System.out.println(employee));
    }
    //Wypisz wszystkich z wysoką wypłatą
    public void printAllWithHightSallary() {
        employeeList.forEach(emp -> {
            if (emp.getSalary() > 2000)
                System.out.println(emp);
        });
    }
    // z użyciem forEach zliczyc pracowników z wypatą > 2k
    public void printNumber() {
        final int[] count = {0};
        employeeList.forEach(emp -> {
            if (emp.getSalary() > 2000)
                count[0]++;
        });
    }
    public long streamsFilter(){
        long count = employeeList.stream().filter(employee -> employee.getSalary() > 2500).count();
        return count;
    }
    public List<Employee> getEmployeeListWithSalary(double salary){
        List<Employee> result = employeeList.stream()
                .filter(employee -> employee.getSalary() > salary)
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
        return result;
    }
}

