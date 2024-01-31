package com.exercises.easy.schedule;

import com.exercises.IOTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScheduleTest extends IOTest {

    private static final Pattern CONTACT_PATTERN = Pattern.compile("\\[\\d+](.+)-(.+)-(.+)");

    @Test
    public void addAndListContactsTest() {

        // given

        setInput(
                "1",
                "John Doe",
                "johndoe@email.com",
                "123456789",
                "1",
                "Jane Doe",
                "janedoe@email.com",
                "987654321",
                "3",
                "0"
        );

        // when

        Schedule.main(null);

        // then

        List<String> outputs = new ArrayList<>();

        for (String output : getOutputs()) {
            if (CONTACT_PATTERN.matcher(output).matches()) {
                outputs.add(output);
            }
        }

        assertEquals(
                Arrays.asList(
                        "[0] John Doe - johndoe@email.com - 123456789",
                        "[1] Jane Doe - janedoe@email.com - 987654321"
                ),
                outputs
        );
    }
}