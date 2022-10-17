package hexlet.code.games;

import hexlet.code.Game;

import java.util.Scanner;

import static java.lang.Math.random;

public class Calculator implements Game {
    private final String[] answers = new String[2];

    /**
     * <p>Запускает ход игры.</p>
     */
    @Override
    public void runGame() {
        Scanner sc = new Scanner(System.in);
        Character randomOperator = randomOperator();
        int randomNumber1 = randomNumber();
        int randomNumber2 = randomNumber();
        int result;

        System.out.println("Question: " + randomNumber1 + " " + randomOperator + " " + randomNumber2);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        result = switch (randomOperator) {
            case '+' -> randomNumber1 + randomNumber2;
            case '-' -> randomNumber1 - randomNumber2;
            case '*' -> randomNumber1 * randomNumber2;
            default -> throw new RuntimeException("No such operator");
        };
        answers[0] = answer;
        answers[1] = String.valueOf(result);
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
        return "What is the result of the expression?";
    }

    public static Character randomOperator() {
        final int maxNumber = 3; // максимальное рандомное
        int randomNumber = (int) (random() * maxNumber);
        return switch (randomNumber) {
            case 0 -> '-';
            case 1 -> '+';
            case 2 -> '*';
            default ->  throw new RuntimeException("No operator found");
        };
    }

    public static int randomNumber() {
        final int fromNumber = 1; // от _ диапазон рандомных чисел
        final int toNumber = 100; // до _ диапазон рандомных чисел
        return fromNumber + (int) (random() * toNumber);
    }
}
