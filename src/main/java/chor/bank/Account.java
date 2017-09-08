package chor.bank;


import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
public class Account {

    private static final int PIN_LENGTH = 4;
    private static final int TOCKEN_LENGTH = 6;
    private Double balance;
    @Setter
    private String accountName;
    @Setter
    private String ownerName;

    private final int pin;
    private final int tocken;

    public Account(Double balance, int pin, int tocken) {
        this.balance = balance;
        this.pin = pin;
        this.tocken = tocken;
    }

    public boolean pay(double amount){
        if(this.balance >= amount){
            this.balance -=amount;
            return true;
        }
        return false;
    }
    public boolean pay(Double amount, int pin){
        if(validate(pin)){
            return pay(amount);
        }
        return false;
    }

    public boolean pay(Double amount, int pin, int tocken){
        if(Integer.toString(tocken).length()== TOCKEN_LENGTH){
            return this.tocken==tocken;
        }
        return false;
    }


    protected boolean validate(int pin){
        if(Integer.toString(pin).length()== PIN_LENGTH){
            return this.pin==pin;
        }
        return false;
    }
}
