package observer;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Stock {

    private List<Observer<Stock>> observers = new ArrayList<>();

    public void attachObserver(Observer<Stock> observer){
        observers.add(observer);

    }

    private String name;
    private double price;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        if(price == this.price){
            return;
        }
        double oldPrice = this.price;
        this.price = price;
        PriceChangeEventArgs eventArgs = new PriceChangeEventArgs(oldPrice, price);
        for (Observer o: observers) {
            o.onChange(this, eventArgs);
        }
    }
}
