package hexlet.code.games;

import hexlet.code.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.random;

public class ArithmeticProgression implements Game {
    private final String[] answers = new String[2];

    /**
     * <p>Запускает ход игры.</p>
     */
    @Override
    public void runGame() {
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
        answers[0] = answer;
        answers[1] = String.valueOf(listProgression.get(randomIndex));
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

    /**
     * <p>Возвращает ответ пользователя и правильный ответ.</p>
     * @return String[]
     */
    @Override
    public String[] getQuestionAndAnswer() {
        return answers;
    }

    /**
     * <p>Правила игры.</p>
     * @return String
     */
    @Override
    public String getRulesOfTheGame() {
        return "What number is missing in the progression?";
    }
}
