package observer;

public abstract class Observer<T> {

    protected T observedObject;

    public abstract void onChange(Object sender, PriceChangeEventArgs e);


}
