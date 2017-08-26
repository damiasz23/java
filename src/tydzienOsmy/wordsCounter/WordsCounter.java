package tydzienOsmy.wordsCounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by olaIdamian on 8/26/2017.
 */
public class WordsCounter {

    private static final String PATH_TO_FILE = "C:\\DAMIAN OGÓLNE\\WinPenDrive\\KursSDA\\Test2.3\\src\\tydzienOsmy\\wordsCounter\\plik.txt";
    public static List<String> readAllLines() {

        List<String> lista = null;
        try {
            lista = Files.readAllLines(Paths.get(PATH_TO_FILE));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static List<String> splitAllWords() {
        List<String> lines = readAllLines();
        List<String> singleWords = new ArrayList<>();

        for (String line : lines) {
            String[] split = line.replace(",", "").replace(".", "").split(" ");
            for (String splitWords : split) {
                singleWords.add(splitWords);
            }
//            ALBO
//            singleWords.addAll(Arrays.asList(line));
        }
        return singleWords;
    }

    public  Map<String, Integer> wordsCounter (){
        Map<String, Integer> myMap = new HashMap<>();
        List<String> allWords = splitAllWords();


        for (String word : allWords) {
            if(myMap.containsKey(word)){
                Integer value = myMap.get(word);
                value++;
                myMap.put(word, value);
            }
            else {
                myMap.put(word, 1);

            }
        }


        return myMap;
    }



}
