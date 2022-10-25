package hexlet.code.games;

import static java.lang.Math.random;

public class GreatestCommonDivisor implements Game {
    private static final int FROM_NUMBER = 1; // от _ диапазон рандомных чисел
    private static final int TO_NUMBER = 10; // до _ диапазон рандомных чисел

    public static int greatestDivisor(int randomNumber1, int randomNumber2) {
        for (int i = Math.min(randomNumber1, randomNumber2); i >= 1; i--) {
            if (randomNumber1 % i == 0 && randomNumber2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int randomNumber() {
        return FROM_NUMBER + (int) (random() * TO_NUMBER);
    }

    /**
     * <p>Возвращает правильный ответ и значение для вопроса .</p>
     *
     * @return String[]
     */
    @Override
    public String[] getQuestionAndAnswer() {
        String[] gameData = new String[2];
        int randomNumber1 = randomNumber();
        int randomNumber2 = randomNumber();

        int result = greatestDivisor(randomNumber1, randomNumber2);
        gameData[0] = String.valueOf(result);
        gameData[1] = randomNumber1 + " " + randomNumber2;
        return gameData;
    }

    /**
     * <p>Правила игры.</p>
     *
     * @return String
     */
    @Override
    public String getRulesOfTheGame() {
        return "Find the greatest common divisor of given numbers.";
    }
}
