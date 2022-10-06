package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberMenu = "";
        while (!"0".equals(numberMenu)) {
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
            numberMenu = selectNumber;
            Engine.selectGame(sc, selectNumber);
        }
        sc.close();
    }
}

