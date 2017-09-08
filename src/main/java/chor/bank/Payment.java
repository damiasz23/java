package chor.bank;

public abstract class Payment {

/**    tworzymy referencje do Accountu. Jest final zeby
/ przekazać Account w konstruktorze-final-wymusza ze, musi byc
 konstruktor z argumentem Account account.
**/
    protected final Account account;

    public Payment(Account account) {
        this.account = account;
    }

    protected Payment nextPayment;

    public void setNextPayment(Payment nextPayment) {
        this.nextPayment = nextPayment;
    }

    protected abstract Double getMaxAmount();

    public boolean logPayment(Double amount){
        if(amount < getMaxAmount()){
            return handlePayment(amount);
        }
        else if(nextPayment!=null){
            return nextPayment.logPayment(amount);
        }
        return false;
    }

    protected abstract boolean handlePayment(Double amount);

}
