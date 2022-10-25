package hexlet.code.games;

import static java.lang.Math.random;

public class EvenNumber implements Game {
    private static final int FROM_NUMBER = 1; // от _ диапазон рандомных чисел
    private static final int TO_NUMBER = 100; // до _ диапазон рандомных чисел

    /**
     * <p>Возвращает правильный ответ и значение для вопроса .</p>
     * @return String[]
     */
    @Override
    public String[] getQuestionAndAnswer() {
        String[] gameData = new String[2];
        int randomNumber = FROM_NUMBER + (int) (random() * TO_NUMBER);
        gameData[0] = randomNumber % 2 == 0 ? "yes" : "no";
        gameData[1] = String.valueOf(randomNumber);
        return gameData;
    }

    /**
     * <p>Правила игры.</p>
     * @return String
     */
    @Override
    public String getRulesOfTheGame() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}


