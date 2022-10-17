package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int STEP = 3;

    public static void game(Game game) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(game.getRulesOfTheGame());
        int i = 0;
        while (i < STEP) {
            game.runGame();
            String[] answer = game.getQuestionAndAnswer();
            if (answer[0].equals(answer[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer[0] + "' is wrong answer ;(. Correct answer was '" + answer[1] + "'.\n"
                        + "Let's try again, " + name + "!");
                return;
            }
            i++;
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

