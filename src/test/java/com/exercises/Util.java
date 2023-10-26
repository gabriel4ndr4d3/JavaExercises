package com.exercises;

import java.util.List;

public class Util {

    /**
     * Não copie esse método na resolução do exercício.
     */
    public static Boolean isPrime(int number) {

        if (number == 1) {
            return false;
        }

        if (number == 0) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean contains(List<Pair<Integer, Boolean>> numbers, int number) {
        return numbers.stream().anyMatch(it -> it.getFirst().equals(number));
    }
}
