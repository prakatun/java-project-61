package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public class ArithmeticProgression implements Game {
    private final String[] question = new String[2];
    static final int MAX_NUMBER = 5; // максимальное рандомное maxNumber + minNumber
    static final int MIN_NUMBER = 5; // минимальное рандомное(включительно)
    static final int FROM_NUMBER = 1; // от _ диапазон рандомных чисел
    static final int TO_NUMBER = 100; // до _ диапазон рандомных чисел

    /**
     * <p>Генерирует прогрессию.</p>
     *
     * @param start          первое число.;
     * @param quantityNumber кол-во чисел.;
     * @param interval       интервал.;
     * @param index          индекс скрытого числа.;
     */
    public void generateProgression(int start, int quantityNumber, int interval, int index) {
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
        question[0] = String.valueOf(listProgression.get(index));
        question[1] = String.valueOf(result);
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
        int start = randomNumber();
        int randomDistance = MIN_NUMBER + (int) (random() * MAX_NUMBER);
        int randomInterval = 1 + (int) (random() * MAX_NUMBER + 1);
        int randomIndex = (int) (random() * randomDistance - 1);

        generateProgression(start, randomDistance, randomInterval, randomIndex);
        return question;
    }

    /**
     * <p>Правила игры.</p>
     *
     * @return String
     */
    @Override
    public String getRulesOfTheGame() {
        return "What number is missing in the progression?";
    }
}
