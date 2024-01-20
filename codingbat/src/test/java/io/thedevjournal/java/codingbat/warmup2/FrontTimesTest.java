package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrontTimesTest {

    private FrontTimes fixture;

    @BeforeEach
    void setUp() {
        fixture = new FrontTimes();
    }

    @Test
    void shouldReturnEmptyString_WhenStringIsNull() {

        final String str = null;
        final int number = 5;

        final String expected = EMPTY_STRING;

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenStringIsEmpty() {

        final String str = EMPTY_STRING;
        final int number = 5;

        final String expected = EMPTY_STRING;

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFrontString_WhenStringIsNotEmptyAndHasLengthLessThan3() {

        final String str = "a";
        final int number = 3;

        final String expected = "aaa";

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFrontString_WhenStringIsNotEmptyAndHasLengthGreaterThan3() {

        final String str = "abcd";
        final int number = 2;

        final String expected = "abcabc";

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFrontString_WhenStringIsNotEmptyAndNumberIsZero() {

        final String str = "abcd";
        final int number = 0;

        final String expected = EMPTY_STRING;

        final String actual = fixture.frontTimes(str, number);

        assertThat(actual).isEqualTo(expected);
    }
}
