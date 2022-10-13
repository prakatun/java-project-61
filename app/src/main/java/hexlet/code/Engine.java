package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.ArithmeticProgression;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.EvenNumber;

public class Engine {
    static final int STEP = 3;

    public static boolean game(String gameName) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? :");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        printRulesOfTheGame(gameName);
        int i = 0;
        boolean resultGames = true;
        while (i <= STEP && resultGames) {
            if (i == STEP) {
                System.out.println("Congratulations, " + name + "!");
                return false;
            }
            resultGames = resultGames(gameName, name);
            i++;
        }
        return resultGames;
    }

    public static boolean resultGames(String gameName, String name) {
        Scanner sc = new Scanner(System.in);
        boolean gameLogic;
        String answer;
        String correctAnswer;
        if ("Even".equals(gameName)) {
            gameLogic = EvenNumber.gameLogic();
            answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (("no".equals(answer) && !gameLogic) || ("yes".equals(answer) && gameLogic)) {
                System.out.println("Correct!");
                return true;
            }
            correctAnswer = "yes".equals(answer) ? "no" : "yes";
            noCorrectAnswerPrint(answer, correctAnswer, name);
        } else if ("Calc".equals(gameName)) {
            return Calculator.gameLogic(name);
        } else if ("GCD".equals(gameName)) {
            return GreatestCommonDivisor.gameLogic(name);
        } else if ("Progression".equals(gameName)) {
            return ArithmeticProgression.gameLogic(name);
        } else if ("Prime".equals(gameName)) {
            gameLogic = PrimeNumber.gameLogic(name);
            answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (("no".equals(answer) && !gameLogic) || ("yes".equals(answer) && gameLogic)) {
                System.out.println("Correct!");
                return true;
            }
            correctAnswer = "yes".equals(answer) ? "no" : "yes";
            noCorrectAnswerPrint(answer, correctAnswer, name);
        }
        return false;
    }


    public static void noCorrectAnswerPrint(String answer, String correctAnswer, String name) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.\n"
                + "Let's try again, " + name + "!");
    }

    public static void printRulesOfTheGame(String gameName) {
        String rules = "";
        if ("Even".equals(gameName)) {
            rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        } else if ("Calc".equals(gameName)) {
            rules = "What is the result of the expression?";
        } else if ("GCD".equals(gameName)) {
            rules = "Find the greatest common divisor of given numbers.";
        } else if ("Progression".equals(gameName)) {
            rules = "What number is missing in the progression?";
        } else if ("Prime".equals(gameName)) {
            rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        }
        System.out.println(rules);
    }
}

