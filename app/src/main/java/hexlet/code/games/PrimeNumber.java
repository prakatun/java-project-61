package hexlet.code.games;

import hexlet.code.App;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {

    public static void game(Scanner sc, String name) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        App.gameStep(sc, name, "Prime");
    }

    public static boolean gameLogic(Scanner sc, String name) {
        int randomNumber = App.randomNumber();
        System.out.println("Question: " + randomNumber);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);

        BigInteger b = BigInteger.valueOf(randomNumber);
        boolean result = b.isProbablePrime(randomNumber);

        if ((result && "yes".equals(answer)) || (!result && "no".equals(answer))) {
            System.out.println("Correct!");
            return true;
        }
        String correctAnswer = "yes".equals(answer) ? "no" : "yes";
        App.noCorrectAnswerPrint(answer, correctAnswer, name);
        return false;
    }
}
