package pl.sda.poznan;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    @Test
    public void deposit() throws Exception {

        BankAccount bankAccount = new BankAccount("Damian", "Gawlak", 1300);

        double deposit = bankAccount.deposit(200);
        assertEquals(200, 200, 1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void deposit_minus_amount(){
        BankAccount bankAccount = new BankAccount("Geniu", "Kowalski", 600);
        bankAccount.deposit(-500);
    }
}