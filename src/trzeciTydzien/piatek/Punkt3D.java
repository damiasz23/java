package trzeciTydzien.piatek;

/**
 * Created by RENT on 2017-07-21.
 */
public class Punkt3D extends Punkt2D{

    private int z;


    public Punkt3D(int x, int y, int z){
        super(x, y);
        this.z = z;

    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

//    @Override
//    public void opiszPunkty(){
//        super.opiszPunkty();
//        System.out.println("Współrzędne: \nx: " + getX() + " \ny: " + getY() + " \nz: " + z);


    @Override
    public String opiszPunkty() {
        String opis = super.opiszPunkty();
        return opis + " a trzecia współrzędna to: " + z;


    }
}

