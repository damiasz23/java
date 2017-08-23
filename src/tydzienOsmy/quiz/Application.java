package tydzienOsmy.quiz;

import java.util.List;
import java.util.Scanner;

/**
 * Created by olaIdamian on 8/23/2017.
 */
public class Application {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("---------Witaj w programie Quiz--------\n");
        int option = 0;

        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Nowy Quiz");
        System.out.println("2. Lista wyników");
        System.out.println("0. Wyjscie z programu");

        option = in.nextInt();

        switch (option){
            case 1 :  {
                System.out.println("Nowy Quiz");
                Quiz quiz = new Quiz();
                List<Question> questions = quiz.readAllQuestions();
                for(Question q : questions){
                    System.out.println(q);
                }
                break;
            }
            case 2: {
                System.out.println("Lista wyników");
                List<String> ranking = Quiz.getRanking();
                if(ranking!=null){
                    for (String wynik : ranking){
                        System.out.println(wynik);
                    }
                }
                else{
                    System.out.println("Brak wyników");
                }
                break;
            }
            case 0: {
                System.out.println("Wyjście");
            }
        }

    }
}
