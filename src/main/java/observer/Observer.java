package observer;

public abstract class Observer<T> {

    private T observedObject;

    public Observer(T observedObject) {
        this.observedObject = observedObject;
    }

    protected abstract void onChange(T sender, PriceChangeEventArgs e);


}
