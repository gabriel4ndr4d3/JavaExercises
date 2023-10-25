package com.exercises.easy.calculator;

import com.exercises.IOTest;
import com.exercises.easy.calculator.Calculator;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest extends IOTest {

    private final Random rand = new Random();

    @Test
    public void testRandomSum() {

        // given

        double a = rand.nextDouble();
        double b = rand.nextDouble();

        String expected = String.format("Resultado: %.2f", a + b);

        setInput("a", String.valueOf(a), String.valueOf(b));

        // when

        Calculator.main(null);

        // then

        String actual = getLastLine();

        assertEquals(expected, actual);
    }

    @Test
    public void testRandomMinus() {

        // given

        double a = rand.nextDouble();
        double b = rand.nextDouble();

        String expected = String.format("Resultado: %.2f", a - b);

        setInput("s", String.valueOf(a), String.valueOf(b));

        // when

        Calculator.main(null);

        // then

        String actual = getLastLine();

        assertEquals(expected, actual);
    }

    @Test
    public void testRandomTimes() {

        // given

        double a = rand.nextDouble();
        double b = rand.nextDouble();

        String expected = String.format("Resultado: %.2f", a * b);

        setInput("m", String.valueOf(a), String.valueOf(b));

        // when

        Calculator.main(null);

        // then

        String actual = getLastLine();

        assertEquals(expected, actual);
    }


    @Test
    public void testRandomDiv() {

        // given

        double a = rand.nextDouble();
        double b = rand.nextDouble();

        String expected = String.format("Resultado: %.2f", a / b);

        setInput("d", String.valueOf(a), String.valueOf(b));

        // when

        Calculator.main(null);

        // then

        String actual = getLastLine();

        assertEquals(expected, actual);
    }

    @Test
    public void testRandomSquareRoot() {

        // given

        double a = rand.nextDouble();

        String expected = String.format("Resultado: %.2f", Math.sqrt(a));

        setInput("r", String.valueOf(a));

        // when

        Calculator.main(null);

        // then

        String actual = getLastLine();

        assertEquals(expected, actual);
    }
}
