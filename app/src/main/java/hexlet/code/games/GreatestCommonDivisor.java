package hexlet.code.games;

import hexlet.code.Game;

import java.util.Scanner;

import static java.lang.Math.random;

public class GreatestCommonDivisor implements Game {
    private final String[] answers = new String[2];

    /**
     * <p>Запускает ход игры.</p>
     */
    public void runGame() {
        Scanner sc = new Scanner(System.in);
        int randomNumber1 = randomNumber();
        int randomNumber2 = randomNumber();

        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        int result = greatestDivisor(randomNumber1, randomNumber2);
        answers[0] = answer;
        answers[1] = String.valueOf(result);
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
        final int toNumber = 10; // до _ диапазон рандомных чисел
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
        return "Find the greatest common divisor of given numbers.";
    }
}
