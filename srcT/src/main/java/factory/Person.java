package factory;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;


@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private Data birthday;

    public Person(String name, String surname, Data birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }
}
