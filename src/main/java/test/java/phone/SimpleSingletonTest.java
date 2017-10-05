package phone;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSingletonTest {
    @Test
    public void getIstance() throws Exception {

        MobilePhone mobilePhone = SimpleSingleton.getIstance();
        MobilePhone mobPhon = SimpleSingleton.getIstance();
        MobilePhone mb = SimpleSingleton.getIstance();

        assertNotNull(mobilePhone);
        assertNotNull(mobPhon);


        assertSame(mb, mobilePhone);
        assertSame(mobilePhone, mobPhon);
        assertEquals(mobilePhone, mobPhon);
    }

}