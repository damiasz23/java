package decorator;

public class UsdDollarDecorator implements Decorator{

    private Currency currency;

    public UsdDollarDecorator(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String getName() {
        return currency.getName() + ", it's US dollar";
    }
}
