package io.thedevjournal.java.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnswerCellTest {

    private AnswerCell fixture;

    @BeforeEach
    void setUp() {
        fixture = new AnswerCell();
    }

    @Test
    void shouldReturnFalse_WhenAsleep() {

        final boolean isAsleep = true;
        final boolean isMorning = false;
        final boolean isMom = false;

        final boolean expected = false;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNotAsleepAndMorningAndNotMom() {

        final boolean isAsleep = false;
        final boolean isMorning = true;
        final boolean isMom = false;

        final boolean expected = false;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNotAsleepAndMorningAndMom() {

        final boolean isAsleep = false;
        final boolean isMorning = true;
        final boolean isMom = true;

        final boolean expected = true;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNotAsleepAndNotMorningAndMom() {

        final boolean isAsleep = false;
        final boolean isMorning = false;
        final boolean isMom = true;

        final boolean expected = true;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNotAsleepAndNotMorningAndNotMom() {

        final boolean isAsleep = false;
        final boolean isMorning = false;
        final boolean isMom = false;

        final boolean expected = true;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual).isEqualTo(expected);
    }
}
