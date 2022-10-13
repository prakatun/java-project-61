package hexlet.code.games;

import java.math.BigInteger;

import static java.lang.Math.random;

public class PrimeNumber {
    public static boolean gameLogic() {
        final int fromNumber = 1; // от _ диапазон рандомных чисел
        final int toNumber = 100; // до _ диапазон рандомных чисел
        int randomNumber =  fromNumber + (int) (random() * toNumber);
        System.out.println("Question: " + randomNumber);
        BigInteger b = BigInteger.valueOf(randomNumber);
        return b.isProbablePrime(randomNumber);
    }
}
