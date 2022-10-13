package hexlet.code.games;

import static java.lang.Math.random;

public class EvenNumber {
    public static boolean gameLogic() {
        final int fromNumber = 1; // от _ диапазон рандомных чисел
        final int toNumber = 100; // до _ диапазон рандомных чисел
        int randomNumber =  fromNumber + (int) (random() * toNumber);
        System.out.println("Question: " + randomNumber);
        return randomNumber % 2 == 0;
    }
}
