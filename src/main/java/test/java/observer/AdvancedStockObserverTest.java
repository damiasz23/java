package observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdvancedStockObserverTest {
    @Test
    public void onChange() throws Exception {

        Stock price = new Stock("stock", 90);

        new AdvancedStockObserver(price);
        price.setPrice(100);
        price.setPrice(900);
        price.setPrice(90);
        price.setPrice(70);
        price.setPrice(7);
        price.setPrice(1);
        price.setPrice(100);
        price.setPrice(200);

    }

}