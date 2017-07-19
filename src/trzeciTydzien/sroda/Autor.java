package trzeciTydzien.sroda;

/**
 * Created by RENT on 2017-07-19.
 */
public class Autor {

    private String name;
    private String surname;
    private int age;

// chainowanie konstruktorów
    public Autor(String name) {
        this.name = name;
    }

    public Autor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Autor(String name, String surname, int age) {
        this(name, surname);
        this.age = age;
        System.out.println("Imie: " + name + "\nNazwisko: " + surname + "\nWiek: " + age);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Nie może byc ujemny wiek");

        } else {
            this.age = age;
        }
    }
}
