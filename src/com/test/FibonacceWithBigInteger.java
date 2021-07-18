package com.test;
import java.math.BigInteger;

public class FibonacceWithBigInteger {
    private static BigInteger previuos = new BigInteger(String.valueOf(0));
    private static BigInteger current = new BigInteger(String.valueOf(1));


    public static void main(String[] args) {
        for (long i = 0; i < 15; i++) {
            fib();
        }

    }

    static void fib() {
        if (previuos.equals(new BigInteger(String.valueOf(0))))
            System.out.println(previuos + " ");

        BigInteger res = previuos.add(current);
        previuos = current;
        current = res;
        System.out.println(previuos + " ");
    }
}