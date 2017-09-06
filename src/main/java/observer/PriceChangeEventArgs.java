package observer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PriceChangeEventArgs {

    private double oldPrice;
    private double newPrice;

    public PriceChangeEventArgs(double oldPrice, double newPrice) {
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }
}
