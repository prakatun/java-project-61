package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.CheckForEven;
import hexlet.code.games.Cli;

import java.util.Scanner;

import static java.lang.Math.random;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int step = 3; //кол-во шагов в играх
        String greet =
                "Please enter the game number and press Enter.\n"
                        + "1 - Greet\n"
                        + "2 - Even\n"
                        + "3 - Calc\n"
                        + "0 - Exit";
        System.out.println(greet);
        String selectNumber = sc.next();
        System.out.println("Your choice: " + selectNumber);
        if ("1".equals(selectNumber)) {
            Cli.sayHello(sc);
            main(args);
        } else if ("2".equals(selectNumber)) {
            String name = Cli.sayHello(sc);
            CheckForEven.game(sc, name, step);
            main(args);
        } else if ("3".equals(selectNumber)) {
            String name = Cli.sayHello(sc);
            Calculator.game(sc, name, step);
            main(args);
        } else if ("0".equals(selectNumber)) {
            sc.close();
        }
        sc.close();
    }

    public static void noCorrectAnswerPrint(String answer, String correctanswer, String name) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctanswer + "'.\n"
                + "Let's try again, " + name + "!");
    }

    public static int randomNumber() {
        final int maxNumber = 10; // максимальное рандомное
        return (int) (random() * maxNumber);
    }
}
