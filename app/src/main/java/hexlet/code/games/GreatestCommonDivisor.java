package hexlet.code.games;

import hexlet.code.App;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void game(Scanner sc, String name) {
        System.out.println("Find the greatest common divisor of given numbers.");
        App.gameStep(sc, name, "GCD");
    }

    public static int greatestDivisor(int randomNumber1, int randomNumber2) {
        int minDivisor = 1;
        for (int i = randomNumber1; i >= 1; i--) {
            int result = commonDivisor(randomNumber1, randomNumber2, i);
            if (minDivisor != result) {
                return result;
            }
        }
        return minDivisor;
    }

    public static int commonDivisor(int randomNumber1, int randomNumber2, int i) {
        if (randomNumber1 % i == 0) {
            if (randomNumber2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static boolean gameLogic(Scanner sc, String name) {
        int randomNumber1 = App.randomNumber(); //0-100
        int randomNumber2 = App.randomNumber(); //0-100

        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        int result = greatestDivisor(randomNumber1, randomNumber2);
        if (answer.equals(String.valueOf(result))) {
            System.out.println("Correct!");
            return true;
        }
        App.noCorrectAnswerPrint(answer, String.valueOf(result), name);
        return false;
    }
}
