package hexlet.code;

import java.util.Scanner;

import static java.lang.Math.random;

public class CheckForEven {
    public static void game(Scanner sc, String name) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        final int step = 3; //кол-во шагов в игре
        int i = 0;
        while (gameCondition(sc, name)) {
            i++;
            if (i == step) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
    }

    public static int gameRandomNumber() {
        final int maxNumber = 100; // максимальное рандомное
        int randomnumber = (int) (random() * maxNumber);
        System.out.println("Question: " + randomnumber);
        return randomnumber;
    }

    public static String gamePrintNumber(Scanner sc) {
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        return answer;
    }

    public static boolean gameCondition(Scanner sc, String name) {
        int randomNumber = gameRandomNumber();
        String answer = gamePrintNumber(sc);
        if ((randomNumber % 2 == 0 && "yes".equals(answer)) || (randomNumber % 2 != 0 && "no".equals(answer))) {
            System.out.println("Correct!");
            return true;
        } else {
            String correctanswer = "yes".equals(answer) ? "no" : "yes";
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctanswer + "'.\n"
                    + "Let's try again, " + name + "!");
        }
        return false;
    }
}
