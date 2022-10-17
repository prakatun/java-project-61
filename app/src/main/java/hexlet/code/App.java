package hexlet.code;

import static hexlet.code.Engine.game;

import hexlet.code.games.Calculator;
import hexlet.code.games.ArithmeticProgression;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.GreatestCommonDivisor;
import hexlet.code.games.EvenNumber;

import java.util.Scanner;


public class App {
    private static final String EXIT = "0";
    private static final String HELLO = "1";
    private static final String EVEN = "2";
    private static final String CALC = "3";
    private static final String GCD = "4";
    private static final String PROGRESSION = "5";
    private static final String PRIME = "6";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greet =
                """
                        Please enter the game number and press Enter.
                        1 - Greet
                        2 - Even
                        3 - Calc
                        4 - GCD
                        5 - Progression
                        6 - Prime
                        0 - Exit""";

        System.out.println(greet);
        String selectNumber = sc.next();
        System.out.println("Your choice: " + selectNumber);
        switch (selectNumber) {
            case HELLO -> Cli.sayHello();
            case EVEN -> game(new EvenNumber());
            case CALC -> game(new Calculator());
            case GCD -> game(new GreatestCommonDivisor());
            case PROGRESSION -> game(new ArithmeticProgression());
            case PRIME -> game(new PrimeNumber());
            case EXIT -> sc.close();
            default -> throw new RuntimeException("No game found");
        }
        sc.close();
    }
}
