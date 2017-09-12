package commons;

import org.junit.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceTest {

    @Test
    public void test(){

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> reduce = integerStream.reduce((integer, integer2) -> integer + integer2);
        System.out.println(reduce.get());

        Integer integer = reduce.orElse(0);



    }
}
