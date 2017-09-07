package enumy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void example(){

        Car a1 = new Car("Toyota", "Corolla", Kolor.CZEROWNY);
        Car a2 = new Car("Skoda", "Octavia", Kolor.NIEBIESKI);

        if(a1.getColor() == Kolor.CZEROWNY){
            System.out.println("Auto jest czerwona");
        }
        if(a2.getColor()==a1.getColor()){
            System.out.println();

        }


        Kolor[] values = Kolor.values();

        for (Kolor k : values) {
            System.out.println(k.ordinal() + " wartość to " + k.toString());

        }

    }

}