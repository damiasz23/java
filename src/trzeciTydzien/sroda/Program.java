package trzeciTydzien.sroda;

/**
 * Created by RENT on 2017-07-19.
 */
public class Program {
    public static void main(String[] args) {

        Student studentInformatyki = new Student();

        Student studentGeologii = new Student("Damian", "Gawlak");

        Student studentPrawa = new Student(23);

        Autor dzonas = new Autor("Damian", "Gawlak", 32);

        MathHelper matma = new MathHelper();
        int wynik = matma.sum(5, 10);
        int sum = matma.sum(23, 43);
    }

}
