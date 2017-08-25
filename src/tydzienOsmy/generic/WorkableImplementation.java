package tydzienOsmy.generic;

/**
 * Created by olaIdamian on 8/25/2017.
 */
public class WorkableImplementation implements Workable{

    @Override
    public boolean canWork(Person p) {
        return p.getAge() > 18;
    }
}
