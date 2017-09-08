package chor.bank;

import java.util.Scanner;

public class TwoFactorPayment extends Payment {

    private final Double MAX_PAYMENT = 5000.;

    public TwoFactorPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_PAYMENT;
    }

    @Override
    protected boolean handlePayment(Double amount) {
        System.out.println("Enter pin");
        Scanner in = new Scanner(System.in);
        int pin = in.nextInt();
        if(account.validate(pin)){
            System.out.println("Enter tocken");
            int tocken = in.nextInt();
            return account.pay(amount, pin, tocken);
        }
        return false;
    }
}
