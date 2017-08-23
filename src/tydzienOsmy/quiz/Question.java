package tydzienOsmy.quiz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by olaIdamian on 8/23/2017.
 */
public class Question {

    private String title;
    private List<String> answers = new ArrayList<>();
    private String correctAnswers;

    public Question(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(String correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        for (String a: answers) {
            sb.append(a).append("\n");

        }
        return sb.toString();
    }
}
