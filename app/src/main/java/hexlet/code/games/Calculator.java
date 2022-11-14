package hexlet.code.games;

import static java.lang.Math.random;

public class Calculator implements Game {
    private static final int FROM_NUMBER = 1; // от _ диапазон рандомных чисел
    private static final int TO_NUMBER = 100; // до _ диапазон рандомных чисел

    /**
     * <p>Возвращает правильный ответ и значение для вопроса .</p>
     *
     * @return String[]
     */
    @Override
    public String[] getQuestionAndAnswer() {
        Character randomOperator = randomOperator();
        String[] gameData = new String[2];
        int randomNumber1 = randomNumber();
        int randomNumber2 = randomNumber();

        int result = switch (randomOperator) {
            case '+' -> randomNumber1 + randomNumber2;
            case '-' -> randomNumber1 - randomNumber2;
            case '*' -> randomNumber1 * randomNumber2;
            default -> throw new RuntimeException("No such operator");
        };
        gameData[0] = String.valueOf(result);
        gameData[1] = randomNumber1 + " " + randomOperator + " " + randomNumber2;
        return gameData;
    }

    /**
     * <p>Правила игры.</p>
     *
     * @return String
     */
    @Override
    public String getRulesOfTheGame() {
        return "What is the result of the expression?";
    }

    public static Character randomOperator() {
        Character[] operator = {'-', '+', '*'};
        final int maxNumber = operator.length; // максимальное рандомное
        int randomNumber = (int) (random() * maxNumber);
        return operator[randomNumber];
    }

    public static int randomNumber() {
        return FROM_NUMBER + (int) (random() * TO_NUMBER);
    }
}
