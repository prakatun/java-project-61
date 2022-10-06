package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

import static java.lang.Math.random;

public class ArithmeticProgression {
    public static boolean game(Scanner sc, String name) {
        System.out.println("What number is missing in the progression?");
        return Engine.gameStep(sc, name, "Progression");
    }

    public static int randomDistance() {
        final int maxNumber = 5; // максимальное рандомное maxNumber + minNumber
        final int minNumber = 5; // минимальное рандомное(включительно)
        return minNumber + (int) (random() * maxNumber);
    }

    public static int randomInterval() {
        final int maxNumber = 6; // максимальное рандомное maxNumber + minNumber (исключительно)
        return 1 + (int) (random() * maxNumber);
    }

    public static int randomIndex() {
        int maxNumber = randomDistance() - 1; // максимальное рандомное(исключительно)
        return (int) (random() * maxNumber);
    }

    public static int progression(int quantityNumber, int interval, int index) {
        int start = Engine.randomNumber();
        int answer = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= quantityNumber; i++) {
            if (i == index) {
                result.append(" ").append("..");
                answer = start;
            } else {
                result.append(" ").append(start);
            }
            start = start + interval;
        }
        System.out.println("Question:" + result);
        return answer;
    }

    public static boolean gameLogic(Scanner sc, String name) {
        int correctAnswer = progression(randomDistance(), randomInterval(), randomIndex());
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        if (answer.equals(String.valueOf(correctAnswer))) {
            System.out.println("Correct!");
            return true;
        }

        Engine.noCorrectAnswerPrint(answer, String.valueOf(correctAnswer), name);
        return false;
    }
}
