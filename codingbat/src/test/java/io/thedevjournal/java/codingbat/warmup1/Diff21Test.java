package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Diff21Test {

    private Diff21 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Diff21();
    }

    @Test
    void shouldReturnTwoTimesDiff_WhenNumberIsGreaterThan21() {

        final int number = 22;
        final int expected = 2;

        final int actual = fixture.diff21(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZeroDiff_WhenNumberIsEqualTo21() {

        final int number = 21;
        final int expected = 0;

        final int actual = fixture.diff21(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnDiff_WhenNumberIsLessTo21() {

        final int number = 19;
        final int expected = 2;

        final int actual = fixture.diff21(number);

        assertThat(actual).isEqualTo(expected);
    }
}
