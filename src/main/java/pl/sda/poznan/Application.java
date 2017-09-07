package pl.sda.poznan;

public class Application {
    public static void main(String[] args) {


        BankAccount ba = new BankAccount("Damian",  "Gawlak", 1000);

        System.out.println(ba.withdraw(600, true));
    }
}
