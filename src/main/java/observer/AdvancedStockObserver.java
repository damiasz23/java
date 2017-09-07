package observer;

public class AdvancedStockObserver extends Observer<Stock> {


    public AdvancedStockObserver(Stock observedObject) {
        super(observedObject);
        observedObject.attachObserver(this);
    }

    @Override
    public void onChange(Stock sender, PriceChangeEventArgs e) {
        double diff = 0;
        if(e.getNewPrice()> e.getOldPrice()){
            diff = (e.getNewPrice()-e.getOldPrice());
            diff = Math.abs(diff/e.getNewPrice()*100);
            System.out.println("Stara cena to: " + e.getOldPrice() + ", nowa cena to: " + e.getNewPrice() + ", a cena wzrosła o: " + diff + "%");
        }
        else if(e.getOldPrice() > e.getNewPrice()){
            diff = e.getOldPrice()-e.getNewPrice();
            diff = Math.abs(diff/e.getOldPrice()*100);
            System.out.println("Stara cena to: " + e.getOldPrice() + ", nowa cena to: " + e.getNewPrice() + ", a cena spadła o: " + diff + "%");

        }


    }
}
