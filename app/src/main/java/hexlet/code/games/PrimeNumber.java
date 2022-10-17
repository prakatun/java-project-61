package hexlet.code.games;

import hexlet.code.Game;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.random;

public class PrimeNumber implements Game {
    private final String[] answers = new String[2];

    /**
     * <p>Запускает ход игры.</p>
     */
    @Override
    public void runGame() {
        Scanner sc = new Scanner(System.in);
        final int fromNumber = 1; // от _ диапазон рандомных чисел
        final int toNumber = 100; // до _ диапазон рандомных чисел
        int randomNumber = fromNumber + (int) (random() * toNumber);
        System.out.println("Question: " + randomNumber);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        BigInteger b = BigInteger.valueOf(randomNumber);
        if (b.isProbablePrime(randomNumber)) {
            answers[0] = "yes";
        } else {
            answers[0] = "no";
        }
        answers[1] = answer;
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
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
