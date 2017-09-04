package pl.sda.poznan;

public class BankAccount {

    private String name = null;
    private String surname = null;
    private double balanse =0;

    private int checking = 1;
    private int savings = 2;

    public BankAccount(String name, String surname, double balanse) {
        this.name = name;
        this.surname = surname;
        this.balanse = balanse;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getBalanse() {
        return balanse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException();
        }
        else {
            this.balanse += amount;
            return this.balanse;
        }
    }
    public double withdraw(double amount, boolean branch){
        if(branch){
            if(amount > 500){
                System.out.println("Nie można wypłacić więcej niż 500 zł");
                return getBalanse();
            }
        }
        else if(amount > balanse){
            System.out.println("Nie masz tyle hajsu ziomeczku");
            return this.balanse;
        }
       else {
            this.balanse -= amount;
        }
        return balanse;
    }
}
