package tydzienOsmy.wordsCounter;

import java.util.Map;

/**
 * Created by olaIdamian on 8/26/2017.
 */
public class Program {
    public static void main(String[] args) {

//        List<String> strings = WordsCounter.readAllLines();
//        for (String lines : strings ) {
//            System.out.println(lines);
//        }

        WordsCounter wc = new WordsCounter();
        Map<String, Integer> stringIntegerMap = wc.wordsCounter();
        for (String key : stringIntegerMap.keySet()) {
            System.out.println("Słowo: " + key + " Razy: " + stringIntegerMap.get(key));
        }

    }
}
