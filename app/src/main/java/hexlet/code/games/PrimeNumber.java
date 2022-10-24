package hexlet.code.games;

import java.math.BigInteger;

import static java.lang.Math.random;

public class PrimeNumber implements Game {
    static final int FROM_NUMBER = 1; // от _ диапазон рандомных чисел
    static final int TO_NUMBER = 100; // до _ диапазон рандомных чисел

    /**
     * <p>Возвращает правильный ответ и значение для вопроса .</p>
     *
     * @return String[]
     */
    @Override
    public String[] getQuestionAndAnswer() {
        String[] question = new String[2];
        int randomNumber = FROM_NUMBER + (int) (random() * TO_NUMBER);

        BigInteger b = BigInteger.valueOf(randomNumber);
        question[0] = b.isProbablePrime(randomNumber) ? "yes" : "no";
        question[1] = String.valueOf(randomNumber);
        return question;
    }

    /**
     * <p>Правила игры.</p>
     *
     * @return String
     */
    @Override
    public String getRulesOfTheGame() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
