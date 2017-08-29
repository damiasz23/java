package domowe.zadanie8;

/**
 * Created by olaIdamian on 8/28/2017.
 */
public class BankAccount {


    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Genas", "Kapała", 5000);

        bankAccount.withdraw(550, false);
        System.out.println(bankAccount.balance);

    }

    private String name = null;
    private String surname = null;
    private double balance = 0;




    public BankAccount(String name, String surname, double balance) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
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

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        this.balance +=amount;
        return this.balance;
    }

    public double withdraw(double amount, boolean branch){
        if(branch){
            if(amount > balance) {
                System.out.println("Nie masz tyle hajsu ziomeczku");
                return this.getBalance();
            }
            this.balance -=amount;
        }
        else if (amount > 500){

            System.out.println("Nie możesz wypłacić więcej niż 500 zł");
            return this.balance;
        }
        else {
            return this.balance -= amount;
        }
        return this.balance;
    }
}
