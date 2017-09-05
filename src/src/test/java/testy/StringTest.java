package testy;

import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertNotNull;
import static org.assertj.core.api.Assertions.assertThat;


public class StringTest {

    @Test
    public void test(){
        String napis = "Ala";

        assertEquals("Ala", napis);
        assertThat(napis).isEqualTo("Ala");
    }

    @Test
    public void dateTest(){
        Date date = new Date();
        date.getTime();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(1980, 10, 10);
        Date birtday = calendar1.getTime();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 10, 9);
        Date result = calendar.getTime();

        assertThat(birtday).isBefore(result);
    }
    @Test
    public void listTest(){
        List<Object> objects = new ArrayList<>();
        objects.add(new Object());

        assertNotNull(objects);
//        JUNIT
        assertFalse(objects.isEmpty());
//         assertJ
        assertThat(objects).isNotNull();
    }

    @Test
    public void mapTest(){
        Map<String, String> mapString = new HashMap<>();

        mapString.put("1020", "PKO BP");

        assertThat(mapString).containsKeys("1020")
                .containsValues("PKO BP");



    }
}
