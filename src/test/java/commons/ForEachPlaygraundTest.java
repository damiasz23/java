package commons;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ForEachPlaygraundTest {

    @Test
    public void mapTest(){
        List<Employee> employees = new ArrayList<>();

        Address DamianAddress = new Address("30", "Batorego", "Poznan", "60-687" );
        Employee Damian = new Employee("Damian", "Gawlak", 32, 5000, DamianAddress);

        Address OlaAddress = new Address("55", "Dabrowskiego", "Wrocław", "87-677" );
        Employee Ola = new Employee("Ola", "Massiel", 45, 8000, OlaAddress);


        employees.add(Damian);
        employees.add(Ola);

        employees.stream().map(employee -> employee.getAddress())
                .filter(address -> address.getCity().startsWith("P"))
                .collect(Collectors.toList())
                .forEach(address -> System.out.println(address.getCity()));
    }

    @Test
    public void anotherMapExample(){
        List<String> list = Arrays.asList("Damian", "Andrzej", "Jan", "Ola");

        List<String> collect = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);

    }
    @Test
    public void mapingTest(){
        List<Employee> employees = new ArrayList<>();

        Address DamianAddress = new Address("30", "Batorego", "Poznan", "60-687" );
        Employee Damian = new Employee("Damian", "Gawlak", 32, 5000, DamianAddress);

        Address OlaAddress = new Address("55", "Dabrowskiego", "Wrocław", "87-677" );
        Employee Ola = new Employee("Ola", "Massiel", 45, 8000, OlaAddress);


        employees.add(Damian);
        employees.add(Ola);

        Map<Double, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getSalary()));
        System.out.println(collect);

        Map<String, List<Employee>> stringListMap = employees.stream().collect(Collectors.groupingBy(e -> e.getAddress().getCity()));


        Map<Boolean, List<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(e -> e.getSalary() > 3500));


        Map<Integer, List<Employee>> collect2 = employees.stream().collect(Collectors.groupingBy(e -> e.getAge()));



    }

}