package phone;

import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingletonTest {
    @Test
    public void getIstance() throws Exception {

        MobilePhone istance = LazySingleton.getIstance();
        MobilePhone mPhone = LazySingleton.getIstance();


        assertNotNull(istance);


        assertSame(istance, mPhone);


    }

}