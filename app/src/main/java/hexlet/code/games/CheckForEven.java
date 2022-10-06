package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class CheckForEven {
    public static void game(Scanner sc, String name) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Engine.gameStep(sc, name, "Even");
    }

    public static boolean gameLogic(Scanner sc, String name) {
        int randomNumber = Engine.randomNumber();
        System.out.println("Question: " + randomNumber);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        if ((randomNumber % 2 == 0 && "yes".equals(answer)) || (randomNumber % 2 != 0 && "no".equals(answer))) {
            System.out.println("Correct!");
            return true;
        }
        String correctAnswer = "yes".equals(answer) ? "no" : "yes";
        Engine.noCorrectAnswerPrint(answer, correctAnswer, name);
        return false;
    }
}
