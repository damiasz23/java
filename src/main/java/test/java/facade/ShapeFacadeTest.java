package facade;

import facade.shapeexample.ShapeFacade;
import org.junit.Test;

public class ShapeFacadeTest {

    @Test
    public void test() throws Exception {

        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawAll();
    }

}