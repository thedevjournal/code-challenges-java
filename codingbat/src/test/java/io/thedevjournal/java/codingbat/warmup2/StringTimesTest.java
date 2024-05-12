package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringTimesTest {

    private StringTimes fixture;

    @BeforeEach
    void setUp() {
        fixture = new StringTimes();
    }

    @Test
    void shouldReturnEmptyString_WhenInputStringIsEmpty() {

        final String str = EMPTY_STRING;
        final int number = 1;

        final String expected = EMPTY_STRING;

        final String actual = fixture.stringTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnStringCount1_WhenInputStringIsNonEmptyAndCountIs1() {

        final String str = "Hi";
        final int number = 1;

        final String expected = str;

        final String actual = fixture.stringTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnStringCountMultiple_WhenInputStringIsNonEmptyAndCountIsGreaterThan1() {

        final String str = "Ab";
        final int number1 = 2;
        final int number2 = 3;

        final String expected1 = "AbAb";
        final String expected2 = "AbAbAb";

        final String actual1 = fixture.stringTimes(str, number1);
        final String actual2 = fixture.stringTimes(str, number2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
