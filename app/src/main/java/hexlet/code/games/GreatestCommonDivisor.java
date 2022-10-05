package hexlet.code.games;

import hexlet.code.App;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void game(Scanner sc, String name) {
        System.out.println("What is the result of the expression?");
        App.gameStep(sc, name, "GCD");
    }

    public static int commonDivisor(int randomNumber1, int randomNumber2) {
        int res = 1;
        for (int i = randomNumber1; i >= 1; i--) {
            if (randomNumber1 % i == 0) {
                res = i;
                if (randomNumber2 % res == 0) {
                    return res;
                }
            }
        }
        return res;
    }

    public static boolean gameLogic(Scanner sc, String name) {
        int randomNumber1 = App.randomNumber(); //0-100
        int randomNumber2 = App.randomNumber(); //0-100

        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        int result = commonDivisor(randomNumber1, randomNumber2);
        if (answer.equals(String.valueOf(result))) {
            System.out.println("Correct!");
            return true;
        }
        App.noCorrectAnswerPrint(answer, String.valueOf(result), name);
        return false;
    }
}
