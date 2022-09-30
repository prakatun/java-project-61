package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greet =
                "Please enter the game number and press Enter.\n"
                        + "1 - Greet\n"
                        + "2 - Even\n "
                        + "0 - Exit";

        System.out.println(greet);
        String selectNumber = sc.next();
        if ("1".equals(selectNumber)) {
            System.out.println("Your choice: 1");
            Cli.sayHello(sc);
            main(args);
        } else if ("2".equals(selectNumber)) {
            System.out.println("Your choice: 2");
            String name = Cli.sayHello(sc);
            CheckForEven.game(sc, name);
            main(args);
        } else if ("0".equals(selectNumber)) {
            System.out.println("Your choice: 0\n"
                    + "Exit");
            sc.close();
        } else {
            System.out.println("Please enter a valid game number.");
            main(args);
        }
        sc.close();
    }
}
