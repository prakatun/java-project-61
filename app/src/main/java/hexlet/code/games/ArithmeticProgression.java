package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.random;

public class ArithmeticProgression {
    public static boolean gameLogic(String name) {
        Scanner sc = new Scanner(System.in);

        final int maxNumber = 5; // максимальное рандомное maxNumber + minNumber
        final int minNumber = 5; // минимальное рандомное(включительно)
        int randomDistance = minNumber + (int) (random() * maxNumber);
        int randomInterval = 1 + (int) (random() * maxNumber + 1);
        int randomIndex = (int) (random() * randomDistance - 1);

        List<Integer> listProgression = generateProgression(randomDistance,
                                                            randomInterval,
                                                            randomIndex);

        String answer = sc.next();

        System.out.println("Your answer: " + answer);
        if (answer.equals(String.valueOf(listProgression.get(randomIndex)))) {
            System.out.println("Correct!");
            return true;
        }
        Engine.noCorrectAnswerPrint(answer, String.valueOf(listProgression.get(randomIndex)), name);
        return false;
    }

    public static List<Integer> generateProgression(int quantityNumber, int interval, int index) {
        int start = randomNumber();
        List<Integer> listProgression = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= quantityNumber; i++) {
            listProgression.add(i, start);
            if (i == index) {
                result.append(" ").append("..");
            } else {
                result.append(" ").append(start);
            }
            start = start + interval;
        }
        System.out.println("Question:" + result);
        return listProgression;
    }

    public static int randomNumber() {
        final int fromNumber = 1; // от _ диапазон рандомных чисел
        final int toNumber = 100; // до _ диапазон рандомных чисел
        return fromNumber + (int) (random() * toNumber);
    }
}
