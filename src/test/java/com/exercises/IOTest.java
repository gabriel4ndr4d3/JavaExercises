package com.exercises;

import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public abstract class IOTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public final void setup() {

        Locale.setDefault(Locale.ENGLISH);

        System.setOut(new PrintStream(outContent));
    }

    protected List<String> getOutputs() {
        String output = outContent.toString();
        return Arrays.asList(output.split("\r\n"));
    }

    protected void setInputs(List<String> inputs) {
        String input = String.join("\n", inputs);
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
}