package chor.bank;

public class Program {

    public static void main(String[] args) {

        Account account = new Account(7000., 1234, 345678);
        Payment pinPayment = new PinPayment(account);
        Payment payPassPayment = new PayPassPayment(account);
        Payment twoFactorPayment = new TwoFactorPayment(account);

        pinPayment.setNextPayment(payPassPayment);
        payPassPayment.setNextPayment(twoFactorPayment);

//        boolean b = payPassPayment.logPayment(3000.);
//        System.out.println(b);

        boolean a = pinPayment.logPayment(2000.);

        account.pay(245);
        System.out.println(account.getBalance());
    }
}
