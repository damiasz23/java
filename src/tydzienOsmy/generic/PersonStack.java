package tydzienOsmy.generic;

/**
 * Created by olaIdamian on 8/25/2017.
 */
public class PersonStack<T extends Person & Workable> {
    T myType;



    public void foo(){
        myType.introduce();
        myType.canWork();
    }
}
