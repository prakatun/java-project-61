package hexlet.code.games;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public class ArithmeticProgression implements Game {
    private static final int MAX_NUMBER = 5; // максимальное рандомное maxNumber + minNumber
    private static final int MIN_NUMBER = 5; // минимальное рандомное(включительно)
    private static final int FROM_NUMBER = 1; // от _ диапазон рандомных чисел
    private static final int TO_NUMBER = 100; // до _ диапазон рандомных чисел

    /**
     * <p>Генерирует прогрессию.</p>
     *
     * @param start          первое число.;
     * @param quantityNumber кол-во чисел.;
     * @param interval       интервал.;
     * @return List<Integer> прогрессия.;
     */
    public List<Integer> generateProgression(int start, int quantityNumber, int interval) {
        List<Integer> listProgression = new ArrayList<>();
        int currentValue = start;
        for (int i = 0; i <= quantityNumber; i++) {
            listProgression.add(i, currentValue);
            currentValue = currentValue + interval;
        }
        return listProgression;
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
        int start = randomNumber();
        int randomDistance = MIN_NUMBER + (int) (random() * MAX_NUMBER);
        int randomInterval = 1 + (int) (random() * MAX_NUMBER + 1);
        int randomIndex = (int) (random() * randomDistance - 1);
        StringBuilder result = new StringBuilder();

        List<Integer> listProgression = generateProgression(start, randomDistance, randomInterval);

        for (int i = 0; i < listProgression.size(); i++) {
            if (i == randomIndex) {
                result.append(" ").append("..");
            } else {
                result.append(" ").append(listProgression.get(i));
            }
        }
        gameData[0] = String.valueOf(listProgression.get(randomIndex));
        gameData[1] = String.valueOf(result).trim();
        return gameData;
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
