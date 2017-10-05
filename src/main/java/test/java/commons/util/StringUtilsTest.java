package commons.util;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void getLetters() throws Exception {

        List<String> strings = Arrays.asList("Damian", "Wojtek", "Blażej");

        Stream<Stream<String>> streamStream = strings.stream().map(StringUtils::getLetters);
        Stream<String> stringStream = strings.stream().flatMap(StringUtils::getLetters);

        List<String> collect = stringStream.collect(Collectors.toList());
        collect.forEach(s -> System.out.println(s));


    }

    private static String pathToFile ="C:\\Users\\RENT\\IdeaProjects\\sda\\Test2\\src\\test\\java\\commons\\util\\text.txt";
    @Test
    public void streams() throws IOException {
        String text = new String(Files.readAllBytes(Paths.get(pathToFile)));

        Stream<String> split = Stream.of(text.split(" "));

        Map<String, Long> collect = split.map(s -> s.toUpperCase()).collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        System.out.println(collect);

    }

}