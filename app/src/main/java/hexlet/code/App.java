package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greet =
                "Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit";

        System.out.println(greet);
        String selectNumber = sc.next();
        choicePrint(selectNumber);
        if ("1".equals(selectNumber)) {
            Cli.sayHello(sc);
            main(args);
        } else if ("2".equals(selectNumber)) {
            String name = Cli.sayHello(sc);
            CheckForEven.game(sc, name);
            main(args);
        } else if ("0".equals(selectNumber)) {
            sc.close();
        }
        sc.close();
    }

    public static void choicePrint(String choice) {
        System.out.println("Your choice: " + choice);
    }
}
