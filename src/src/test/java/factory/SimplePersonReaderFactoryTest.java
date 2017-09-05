package factory;

import factory.simplefactory.SimplePersonReaderFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimplePersonReaderFactoryTest {
    @Test
    public void createReader() throws Exception {

        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();

        String dummyPath = "plik.txt";

        PersonFileReader fileReader = factory.createReader(dummyPath);

        assertEquals(TxtPersonFileReader.class, fileReader.getClass());

        assertTrue(fileReader instanceof TxtPersonFileReader);

    }

    @Test
    public void jsonReaderTest(){

        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();

        String path = "*.json";

        PersonFileReader fileReader = factory.createReader(path);

        assertTrue(fileReader instanceof JsonPersonFileReader);
    }

    @Test
    public void txtReaderTest(){

        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();

        String path = "*.txt";

        PersonFileReader fileReader = factory.createReader(path);

        assertTrue(fileReader instanceof TxtPersonFileReader);

//        List<Person> people = fileReader.readAll();
    }

}