package hexlet.code.games;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.random;

public class PrimeNumber {
    public static boolean gameLogic(String name) {
        Scanner sc = new Scanner(System.in);
        final int fromNumber = 1; // от _ диапазон рандомных чисел
        final int toNumber = 100; // до _ диапазон рандомных чисел
        int randomNumber =  fromNumber + (int) (random() * toNumber);
        System.out.println("Question: " + randomNumber);
        BigInteger b = BigInteger.valueOf(randomNumber);
        return b.isProbablePrime(randomNumber);
    }
}
