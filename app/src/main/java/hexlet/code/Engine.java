package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.CheckForEven;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.ArithmeticProgression;
import hexlet.code.games.PrimeNumber;

import static java.lang.Math.random;

public class Engine {
    static final int STEP = 3; //кол-во шагов в играх
    static final int FROM_NUMBER = 1; // от _ диапазон рандомных чисел
    static final int TO_NUMBER = 99; // до _ диапазон рандомных чисел

    public static void selectGame(Scanner sc, String selectNumber) {
        if ("1".equals(selectNumber)) {
            Cli.sayHello(sc);
        } else if ("2".equals(selectNumber)) {
            String name = Cli.sayHello(sc);
            CheckForEven.game(sc, name);
        } else if ("3".equals(selectNumber)) {
            String name = Cli.sayHello(sc);
            Calculator.game(sc, name);
        } else if ("4".equals(selectNumber)) {
            String name = Cli.sayHello(sc);
            GreatestCommonDivisor.game(sc, name);
        } else if ("5".equals(selectNumber)) {
            String name = Cli.sayHello(sc);
            ArithmeticProgression.game(sc, name);
        } else if ("6".equals(selectNumber)) {
            String name = Cli.sayHello(sc);
            PrimeNumber.game(sc, name);
        }
    }

    public static boolean resultGames(Scanner sc, String name, String gameName) {
        boolean gameLogic = false;
        if ("Calc".equals(gameName)) {
            gameLogic = Calculator.gameLogic(sc, name);
        } else if ("Even".equals(gameName)) {
            gameLogic = CheckForEven.gameLogic(sc, name);
        } else if ("GCD".equals(gameName)) {
            gameLogic = GreatestCommonDivisor.gameLogic(sc, name);
        } else if ("Progression".equals(gameName)) {
            gameLogic = ArithmeticProgression.gameLogic(sc, name);
        } else if ("Prime".equals(gameName)) {
            gameLogic = PrimeNumber.gameLogic(sc, name);
        }
        return gameLogic;
    }

    public static void gameStep(Scanner sc, String name, String gameName) {

        int i = 0;
        boolean resultGames = true;
        while (i <= STEP && resultGames) {
            if (i == STEP) {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
            resultGames = resultGames(sc, name, gameName);
            i++;
        }
    }

    public static void noCorrectAnswerPrint(String answer, String correctanswer, String name) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctanswer + "'.\n"
                + "Let's try again, " + name + "!");
    }

    public static int randomNumber() {
        return FROM_NUMBER + (int) (random() * TO_NUMBER);
    }

}
