package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NTwiceTest {

    private NTwice fixture;

    @BeforeEach
    void setUp() {
        fixture = new NTwice();
    }

    @Test
    void testcase1() {

        final String input = "Hello";
        final int number = 2;

        final String expected = "Helo";

        final String actual = fixture.nTwice(input, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "Chocolate";
        final int number = 3;

        final String expected = "Choate";

        final String actual = fixture.nTwice(input, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "Chocolate";
        final int number = 1;

        final String expected = "Ce";

        final String actual = fixture.nTwice(input, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;
        final int number = 1;

        final String expected = EMPTY_STRING;

        final String actual = fixture.nTwice(input, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;
        final int number = 1;

        final String expected = EMPTY_STRING;

        final String actual = fixture.nTwice(input, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldThrowException_WhenInputLengthIsSmallThanN() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> fixture.nTwice("abc", 5));
    }
}
