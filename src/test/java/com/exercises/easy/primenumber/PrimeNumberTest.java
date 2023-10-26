package com.exercises.easy.primenumber;

import com.exercises.IOTest;
import com.exercises.Pair;
import com.exercises.Util;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberTest extends IOTest {

    private final Random rand = new Random();

    /**
     * Zero não é primo.
     * <p>
     * 1. Ele é divisível por outros números além de 1.
     * </p>
     * <p>
     * 2. Ele não é divisível por ele mesmo.
     * </p>
     */
    @Test
    public void testZero() {

        // given

        setInput("0");

        // when

        PrimeNumber.main(null);

        // then

        assertEquals(
                "Não é primo",
                getLastLine(),
                "seu programa falhou para 0"
        );
    }

    /**
     * O 1 não é considerado primo, e existe razões para isso, sugiro pesquisar sobre.
     */
    @Test
    public void testOne() {

        // given

        setInput("1");

        // when

        PrimeNumber.main(null);

        // then

        assertEquals(
                "Não é primo",
                getLastLine(),
                "seu programa falhou para 1"
        );
    }

    @Test
    public void test100RandomNumbers() {

        // given

        List<Pair<Integer, Boolean>> numbers = new ArrayList<>();

        for (int index = 0; index < 100; index++) {

            int number;

            do {
                number = this.rand.nextInt(100);
            } while (Util.contains(numbers, number));

            numbers.add(new Pair<>(number, Util.isPrime(number)));
        }

        for (int index = 0; index < 100; index++) {

            Pair<Integer, Boolean> pair = numbers.get(index);

            setInput(String.valueOf(pair.getFirst()));

            // when

            PrimeNumber.main(null);

            // then

            String expected = pair.getSecond() ? "É primo" : "Não é primo";

            assertEquals(
                    expected,
                    getLastLine(),
                    String.format(
                            "seu programa falhou para %s",
                            pair.getFirst()
                    )
            );
        }
    }

}