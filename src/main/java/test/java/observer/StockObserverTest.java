package observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockObserverTest {
    @Test
    public void test() throws Exception {
        Stock orlen = new Stock("Orlen", 10);

        new StockObserver(orlen);
        new AdvancedStockObserver(orlen);
        orlen.setPrice(20);
        orlen.setPrice(30);
        orlen.setPrice(50);
        orlen.setPrice(100);
        orlen.setPrice(101);
        orlen.setPrice(200);
        orlen.setPrice(150);
        orlen.setPrice(120);





    }

}