package hexlet.code;

import java.util.Scanner;

import static java.lang.Math.random;

public class CheckForEven {
    public static void game(Scanner sc, String name) {
        String msgResult;
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        final int step = 3; // шагов цикла
        final int maxNumber = 100; // максимальное рандомное
        for (int i = 1; i <= step; i++) {
            int randomNumber = (int) (random() * maxNumber);
            System.out.println("Question: " + randomNumber);
            String answer = sc.next();
            System.out.println("Your answer: " + answer);

            if ((randomNumber % 2 == 0 && "yes".equals(answer)) || (randomNumber % 2 != 0 && "no".equals(answer))) {
                msgResult = "Correct!";
            } else {
                String correctAnswer;
                if ("yes".equals(answer)) {
                    correctAnswer = "no";
                } else {
                    correctAnswer = "yes";
                }
                msgResult = "'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                        + "Let's try again, " + name + "!";
            }

            System.out.println(msgResult);

            if (!"Correct!".equals(msgResult)) {
                break;
            }

            if (i == step) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
