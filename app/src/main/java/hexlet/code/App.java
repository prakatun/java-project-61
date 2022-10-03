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
        choicePrint(selectNumber);
        String name = "";

        switch (selectNumber) {
            case "1":
                Cli.sayHello(sc);
                main(args);
                break;
            case "2":
                name = Cli.sayHello(sc);
                CheckForEven.game(sc, name, step);
                main(args);
                break;
            case "3":
                name = Cli.sayHello(sc);
                Calculator.game(sc, name, step);
                main(args);
                break;
            case "0":
                System.out.println("Exit");
                sc.close();
                break;
            default:
                sc.close();
        }

    }

    public static void choicePrint(String choice) {
        System.out.println("Your choice: " + choice);
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
