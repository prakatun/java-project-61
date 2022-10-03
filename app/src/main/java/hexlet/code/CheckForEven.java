package hexlet.code;

import java.util.Scanner;

import static java.lang.Math.random;

public class CheckForEven {
    public static void game(Scanner sc, String name) {

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        final int step = 3; // кол-во шагов в игре
        gameCount(sc, name, step);
    }

    public static void gameCount(Scanner sc, String name, int step) {
        String msgResult;
        for (int i = 1; i <= step; i++) {
            msgResult = gameCondition(sc, name);
            System.out.println(msgResult);
            if (!"Correct!".equals(msgResult)) {
                break;
            }
            if (i == step) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }

    public static String gameCondition(Scanner sc, String name) {
        final int maxNumber = 100; // максимальное рандомное
        int randomNumber = (int) (random() * maxNumber);
        System.out.println("Question: " + randomNumber);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        if ((randomNumber % 2 == 0 && "yes".equals(answer)) || (randomNumber % 2 != 0 && "no".equals(answer))) {
            return "Correct!";
        } else {
            String correctanswer = "yes".equals(answer) ? "no" : "yes";
            return "'" + answer + "' is wrong answer ;(. Correct answer was '" + correctanswer + "'.\n"
                    + "Let's try again, " + name + "!";
        }
    }
}
