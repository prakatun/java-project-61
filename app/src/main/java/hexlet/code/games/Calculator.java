package hexlet.code.games;

import hexlet.code.App;

import java.util.Scanner;

import static java.lang.Math.random;

public class Calculator {
    public static void game(Scanner sc, String name, int step) {
        System.out.println("What is the result of the expression?");
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

    public static boolean gameCondition(Scanner sc, String name) {

        Character randomOperator = randomOperator();
        int randomNumber1 = App.randomNumber(); //0-100
        int randomNumber2 = App.randomNumber(); //0-100
        int result;

        System.out.println("Question: " + randomNumber1 + " " + randomOperator + " " + randomNumber2);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        switch (randomOperator) {
            case '+':
                result = randomNumber1 + randomNumber2;
                break;
            case '-':
                result = randomNumber1 - randomNumber2;
                break;
            default:
                result = randomNumber1 * randomNumber2;
        }

        if (answer.equals(String.valueOf(result))) {
            System.out.println("Correct!");
            return true;
        }
        App.noCorrectAnswerPrint(answer, String.valueOf(result), name);
        return false;
    }
}