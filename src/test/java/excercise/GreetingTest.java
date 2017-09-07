package excercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreetingTest {
    private Greeting greeting;


    @Before
    public void initialize(){
        greeting = new Greeting();
    }
    @Test
    public void greet()  {
//        Greeting greeting = new Greeting();

        String result = greeting.greet("Jan");

        assertEquals("Hello, Jan", result);

    }

    @Test
    public void greetWhenNull()  {
//        Greeting greeting = new Greeting();

        String result = greeting.greet(null);

        assertEquals("Hello, my friend", result);

    }

    @Test
    public void whenGreatSigns()  {

//        Greeting greeting = new Greeting();

        String result = greeting.greet("JAN");

        assertEquals("HELLO JAN" , result);
    }

    @Test
    public void tabName()  {

        String result = greeting.greet("Jan", "Ala");

        assertEquals("Hello, Jan and Ala", result);

    }

    @Test
    public void multiplyNames() {
        String result = greeting.greet("Piotr", "Anna", "Paulina");
        assertEquals("Hello, Piotr, Anna and Paulina", result);
    }

    @Test
    public void moreNames() throws Exception {
        String result = greeting.greet("Geniu", "Zdzichu");
        assertEquals("Hello, Geniu and Zdzichu", result);
    }
}