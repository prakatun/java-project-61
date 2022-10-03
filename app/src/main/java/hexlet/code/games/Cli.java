package hexlet.code.games;

import java.util.Scanner;

public class Cli {
    public static String sayHello(Scanner sc) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? :");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
