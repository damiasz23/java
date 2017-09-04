package math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class FactorialTest {
    private int input;
    private int expected;


    public FactorialTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = {{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}};
        return Arrays.asList(data);

    }

    @Test
    public void silnia() throws Exception {
        int result = Factorial.silnia(input);


        assertEquals(expected, result);
    }
}