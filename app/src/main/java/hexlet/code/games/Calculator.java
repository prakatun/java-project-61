package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static java.lang.Math.random;

public class Calculator {
    public static boolean game(Scanner sc, String name) {
        System.out.println("What is the result of the expression?");
        return Engine.gameStep(sc, name, "Calc");
    }

    public static Character randomOperator() {
        final int maxNumber = 3; // максимальное рандомное
        int randomNumber = (int) (random() * maxNumber);
        if (randomNumber == 0) {
            return '-';
        } else if (randomNumber == 1) {
            return '+';
        }
        return '*';
    }

    public static boolean gameLogic(Scanner sc, String name) {

        Character randomOperator = randomOperator();
        int randomNumber1 = Engine.randomNumber();
        int randomNumber2 = Engine.randomNumber();
        int result;

        System.out.println("Question: " + randomNumber1 + " " + randomOperator + " " + randomNumber2);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        result = switch (randomOperator) {
            case '+' -> randomNumber1 + randomNumber2;
            case '-' -> randomNumber1 - randomNumber2;
            default -> randomNumber1 * randomNumber2;
        };

        if (answer.equals(String.valueOf(result))) {
            System.out.println("Correct!");
            return true;
        }
        Engine.noCorrectAnswerPrint(answer, String.valueOf(result), name);
        return false;
    }
}
