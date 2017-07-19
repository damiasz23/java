package trzeciTydzien.sroda;

/**
 * Created by RENT on 2017-07-19.
 */
public class Student {
//    pola
    private int index;
    private int yearOfStudy;
    private int age;

    private String name;
    private String surname;


// kostruktory

    public Student(){
        System.out.println("Pierwszy konstruktor");

    }

    public Student(int age){
        this.age = age;
        System.out.println(age);

    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println(name + " " + surname);
    }


//    metody
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        if (yearOfStudy < 0) {
            System.out.println("Rok studiuów nie może być ujemny");

        } else {
            this.yearOfStudy = yearOfStudy;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Wiek studenta nie może być ujemny");

        } else {
            this.age = age;
        }
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

}
