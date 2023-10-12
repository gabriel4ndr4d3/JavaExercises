package com.exercises.calculator;

import com.exercises.IOTest;
import com.exercises.util.ListUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
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

        setInputs(Arrays.asList("a", String.valueOf(a), String.valueOf(b)));

        // when

        Calculator.main(null);

        // then

        List<String> outputs = getOutputs();

        String actual = ListUtil.getLast(outputs);

        assertEquals(expected, actual);
    }

    @Test
    public void testRandomMinus() {

        // given

        double a = rand.nextDouble();
        double b = rand.nextDouble();

        String expected = String.format("Resultado: %.2f", a - b);

        setInputs(Arrays.asList("s", String.valueOf(a), String.valueOf(b)));

        // when

        Calculator.main(null);

        // then

        List<String> outputs = getOutputs();

        String actual = ListUtil.getLast(outputs);

        assertEquals(expected, actual);
    }

    @Test
    public void testRandomTimes() {

        // given

        double a = rand.nextDouble();
        double b = rand.nextDouble();

        String expected = String.format("Resultado: %.2f", a * b);

        setInputs(Arrays.asList("m", String.valueOf(a), String.valueOf(b)));

        // when

        Calculator.main(null);

        // then

        List<String> outputs = getOutputs();

        String actual = ListUtil.getLast(outputs);

        assertEquals(expected, actual);
    }


    @Test
    public void testRandomDiv() {

        // given

        double a = rand.nextDouble();
        double b = rand.nextDouble();

        String expected = String.format("Resultado: %.2f", a / b);

        setInputs(Arrays.asList("d", String.valueOf(a), String.valueOf(b)));

        // when

        Calculator.main(null);

        // then

        List<String> outputs = getOutputs();

        String actual = ListUtil.getLast(outputs);

        assertEquals(expected, actual);
    }

    @Test
    public void testRandomSquareRoot() {

        // given

        double a = rand.nextDouble();

        String expected = String.format("Resultado: %.2f", Math.sqrt(a));

        setInputs(Arrays.asList("r", String.valueOf(a)));

        // when

        Calculator.main(null);

        // then

        List<String> outputs = getOutputs();

        String actual = ListUtil.getLast(outputs);

        assertEquals(expected, actual);
    }
}
