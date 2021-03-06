package math;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FactorialTestParam {

    @Parameterized.Parameter
    public int input;
    @Parameterized.Parameter(1)
    public int expected;

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
