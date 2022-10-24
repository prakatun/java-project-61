package hexlet.code.games;

import static java.lang.Math.random;

public class Calculator implements Game {
    static final int FROM_NUMBER = 1; // от _ диапазон рандомных чисел
    static final int TO_NUMBER = 100; // до _ диапазон рандомных чисел

    /**
     * <p>Возвращает правильный ответ и значение для вопроса .</p>
     *
     * @return String[]
     */
    @Override
    public String[] getQuestionAndAnswer() {
        Character randomOperator = randomOperator();
        String[] question = new String[2];
        int randomNumber1 = randomNumber();
        int randomNumber2 = randomNumber();
        int result;

        result = switch (randomOperator) {
            case '+' -> randomNumber1 + randomNumber2;
            case '-' -> randomNumber1 - randomNumber2;
            case '*' -> randomNumber1 * randomNumber2;
            default -> throw new RuntimeException("No such operator");
        };
        question[0] = String.valueOf(result);
        question[1] = randomNumber1 + " " + randomOperator + " " + randomNumber2;
        return question;
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
        final int maxNumber = 3; // максимальное рандомное
        int randomNumber = (int) (random() * maxNumber);
        Character[] operator = {'-', '+', '*'};
        return operator[randomNumber];
    }

    public static int randomNumber() {
        return FROM_NUMBER + (int) (random() * TO_NUMBER);
    }
}
