package tydzienOsmy.quiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by olaIdamian on 8/23/2017.
 */
public class Quiz {
    private static final String PATH_TO_RESULT = "./src/tydzienOsmy/quiz/wyniki.txt";
    public static final String PATH_TO_QUESTIONS = "./src/tydzienOsmy/quiz/pytania.txt";

    public static List<String> getRanking() {

        List<String> result = null;
        try {
            result = Files.readAllLines(Paths.get(PATH_TO_RESULT));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<Question> readAllQuestions() {
        List<String> questionsFromFile = null;
        List<Question> questionList = new ArrayList<>();

        try {
            questionsFromFile = Files.readAllLines(Paths.get(PATH_TO_QUESTIONS));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < questionsFromFile.size(); i += 6) {
            Question question = new Question();
            question.setTitle(questionsFromFile.get(i));

            question.getAnswers().add(questionsFromFile.get(i + 1));
            question.getAnswers().add(questionsFromFile.get(i + 2));
            question.getAnswers().add(questionsFromFile.get(i + 3));
            question.getAnswers().add(questionsFromFile.get(i + 4));
            question.setCorrectAnswers(questionsFromFile.get(i + 5));
            questionList.add(question);


        }
        return questionList;
    }
}


