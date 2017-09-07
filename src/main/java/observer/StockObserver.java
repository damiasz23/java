package observer;

import jdk.nashorn.internal.objects.annotations.Setter;

public class StockObserver extends  Observer<Stock>{

    public StockObserver(Stock stock) {
        super(stock);
        stock.attachObserver(this);
    }

    @Override
    public void onChange(Stock sender, PriceChangeEventArgs e) {
        System.out.println("Cena się zmieniła: Stara cena to: " + e.getOldPrice() + ", Nowa cena to: " + e.getNewPrice());
    }
}
