package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Engine.game;

public class App {
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
            case "1" -> Cli.sayHello();
            case "2" -> game("Even");
            case "3" -> game("Calc");
            case "4" -> game("GCD");
            case "5" -> game("Progression");
            case "6" -> game("Prime");
            case "0 " -> sc.close();
            default -> main(args);
        }
    }
}
