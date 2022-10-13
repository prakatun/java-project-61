package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static java.lang.Math.random;

public class Calculator {
    public static boolean gameLogic(String name) {
        Scanner sc = new Scanner(System.in);
        Character randomOperator = randomOperator();
        int randomNumber1 = randomNumber();
        int randomNumber2 = randomNumber();
        int result;

        System.out.println("Question: " + randomNumber1 + " " + randomOperator + " " + randomNumber2);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        result = switch (randomOperator) {
            case '+' -> randomNumber1 + randomNumber2;
            case '-' -> randomNumber1 - randomNumber2;
            case '*' -> randomNumber1 * randomNumber2;
            default -> throw new RuntimeException("No such operator");
        };

        if (answer.equals(String.valueOf(result))) {
            System.out.println("Correct!");
            return true;
        }
        Engine.noCorrectAnswerPrint(answer, String.valueOf(result), name);
        return false;
    }

    public static Character randomOperator() {
        final int maxNumber = 3; // максимальное рандомное
        int randomNumber = (int) (random() * maxNumber);
        return switch (randomNumber) {
            case 0 -> '-';
            case 1 -> '+';
            default -> '*';
        };
    }

    public static int randomNumber() {
        final int fromNumber = 1; // от _ диапазон рандомных чисел
        final int toNumber = 100; // до _ диапазон рандомных чисел
        return fromNumber + (int) (random() * toNumber);
    }
}
