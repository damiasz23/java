package chor.bank;

import java.util.Scanner;

public class PinPayment extends Payment{

    private final Double MAX_PAYMENT = 500.;


    public PinPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_PAYMENT;
    }

    @Override
    protected boolean handlePayment(Double amount) {
        System.out.println("Enter pin: ");
        Scanner in = new Scanner(System.in);
        int pinFromUser = in.nextInt();
        return account.pay(amount, pinFromUser);

    }
}
