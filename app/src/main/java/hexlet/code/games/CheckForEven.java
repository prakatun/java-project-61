package hexlet.code.games;

import hexlet.code.App;

import java.util.Scanner;

public class CheckForEven {
    public static void game(Scanner sc, String name, int step) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        gameCount(sc, name, step);
    }

    public static void gameCount(Scanner sc, String name, int step) {
        int i = 0;
        while (gameCondition(sc, name)) {
            i++;
            if (i == step) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }

    public static boolean gameCondition(Scanner sc, String name) {
        int randomNumber = App.randomNumber();
        System.out.println("Question: " + randomNumber);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        if ((randomNumber % 2 == 0 && "yes".equals(answer)) || (randomNumber % 2 != 0 && "no".equals(answer))) {
            System.out.println("Correct!");
            return true;
        }
        String correctanswer = "yes".equals(answer) ? "no" : "yes";
        App.noCorrectAnswerPrint(answer, correctanswer, name);
        return false;
    }
}
