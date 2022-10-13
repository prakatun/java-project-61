package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static java.lang.Math.random;

public class GreatestCommonDivisor {
    public static boolean gameLogic(String name) {
        Scanner sc = new Scanner(System.in);
        int randomNumber1 = randomNumber();
        int randomNumber2 = randomNumber();

        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        int result = greatestDivisor(randomNumber1, randomNumber2);
        if (answer.equals(String.valueOf(result))) {
            System.out.println("Correct!");
            return true;
        }
        Engine.noCorrectAnswerPrint(answer, String.valueOf(result), name);
        return false;
    }

    public static int greatestDivisor(int randomNumber1, int randomNumber2) {
        int minDivisor = 1;
        for (int i = randomNumber1; i >= 1; i--) {
            if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                return i;
            }
        }
        return minDivisor;
    }

    public static int randomNumber() {
        final int fromNumber = 1; // от _ диапазон рандомных чисел
        final int toNumber = 100; // до _ диапазон рандомных чисел
        return fromNumber + (int) (random() * toNumber);
    }
}
