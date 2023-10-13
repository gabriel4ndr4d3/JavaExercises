package com.exercises;

import com.exercises.util.ListUtil;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public abstract class IOTest {

    private ByteArrayOutputStream outContent;

    @BeforeEach
    public final void setup() {

        Locale.setDefault(Locale.ENGLISH);

        outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
    }

    protected List<String> getOutputs() {
        String output = outContent.toString();

        return Arrays.asList(output.split(System.lineSeparator()));
    }

    protected void setInput(String... input) {
        String joined = String.join(System.lineSeparator(), Arrays.asList(input));

        System.setIn(new ByteArrayInputStream(joined.getBytes()));
    }

    protected String getLastLine() {
        List<String> outputs = getOutputs();

        return ListUtil.getLast(outputs);
    }
}