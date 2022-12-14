package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    private static final int COUNT_ROUND = 3;

    public static void game(Game game) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(game.getRulesOfTheGame());
        int i = 0;
        while (i < COUNT_ROUND) {
            String[] gameData = game.getQuestionAndAnswer();

            System.out.println("Question: " + gameData[1]);
            String answer = sc.next();
            System.out.println("Your answer: " + answer);

            if (answer.equals(gameData[0])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + gameData[0] + "'.\n"
                        + "Let's try again, " + name + "!");
                return;
            }
            i++;
        }
        System.out.println("Congratulations, " + name + "!");
    }
}

