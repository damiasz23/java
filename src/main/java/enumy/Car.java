package enumy;

public class Car {
    private String kind;
    private String model;
    private Kolor color;


    public Car() {
    }

    public Car(String kind, String model, Kolor color) {
        this.kind = kind;
        this.model = model;
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Kolor getColor() {
        return color;
    }

    public void setColor(Kolor color) {
        this.color = color;
    }



}
