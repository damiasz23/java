package drugiTydzie.czwartek.czwartek1;

/**
 * Created by RENT on 2017-07-13.
 */
public class Point {

    public int x;
    public int y;

    public double distanceFromOrigin(){
        double odleglosc = Math.sqrt((x*x)+(y*y));
        return odleglosc;
    }

    public void Dupa(){
        System.out.println("Pierwsza odległość to: " + this.x + "Druga odległość to: " + this.y);
    }

}
