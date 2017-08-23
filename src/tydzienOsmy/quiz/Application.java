package tydzienOsmy.quiz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

/**
 * Created by olaIdamian on 8/23/2017.
 */
public class Application {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int option = -1;
        while (option != 0) {
            System.out.println("---------Witaj w programie Quiz--------\n");


            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Nowy Quiz");
            System.out.println("2. Lista wyników");
            System.out.println("0. Wyjscie z programu");

            option = in.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Pytania: ");
                    Quiz quiz = new Quiz();
                    List<Question> questions = quiz.readAllQuestions();


                    System.out.println("Podaj swój nick");
                    String nick = in.next();

                    int correctAnswersCounter = 0;
                    for (int i =0  ;i <questions.size() ;i++) {
                        System.out.println("Pytanie nr: " + (i +1));
                        Question que = questions.get(i);
                        System.out.println(que);


                        System.out.println("Podaj odpowiedz");
                        String answer = in.next();

                        if(que.getCorrectAnswers().equals(answer)){
                            System.out.println("-----Dobrze!!!-----");
                            correctAnswersCounter++;
                        }
                        else {
                            System.out.println("-----Żle-----");
                        }
                    }
                    System.out.println();
                    System.out.println("Twój wynik to: " + correctAnswersCounter + "/" + questions.size() + "\n");

                    String score = "Nick: " + nick + "  " + "Ilość punktów: " + correctAnswersCounter + "\n";

                    Path pathToResult = Paths.get("./src/tydzienOsmy/quiz/wyniki.txt");
                    try {
                        Files.write(pathToResult, score.getBytes(), Files.exists(pathToResult) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case 2: {
                    System.out.println("Lista wyników");
                    List<String> ranking = Quiz.getRanking();
                    if (ranking != null) {
                        for (String wynik : ranking) {
                            System.out.println(wynik);
                        }
                    } else {
                        System.out.println("Brak wyników");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Twoja odpowiedz to: ");
                }
                case 0: {
                    System.out.println("Wyjście");
                }
            }

        }
    }
}