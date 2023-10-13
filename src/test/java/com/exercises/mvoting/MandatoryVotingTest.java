package com.exercises.mvoting;

import com.exercises.IOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MandatoryVotingTest extends IOTest {

    @Test
    public void testUnder16YearsOld() {

        // given

        setInput("15");

        // when

        MandatoryVoting.main(null);

        // then

        assertEquals(VotingType.DOES_NOT_VOTE.getText(), getLastLine());
    }

    @Test
    public void test16YearsOld() {

        // given

        setInput("16");

        // when

        MandatoryVoting.main(null);

        // then

        assertEquals(VotingType.OPTIONAL.getText(), getLastLine());
    }

    @Test
    public void test18YearsOld() {

        // given

        setInput("18");

        // when

        MandatoryVoting.main(null);

        // then

        assertEquals(VotingType.MANDATORY.getText(), getLastLine());
    }

    @Test
    public void test70YearsOld() {

        // given

        setInput("70");

        // when

        MandatoryVoting.main(null);

        // then

        assertEquals(VotingType.OPTIONAL.getText(), getLastLine());
    }

    enum VotingType {
        MANDATORY("Obrigatório"),
        OPTIONAL("Opcional"),
        DOES_NOT_VOTE("Não vota");

        private final String text;

        VotingType(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}