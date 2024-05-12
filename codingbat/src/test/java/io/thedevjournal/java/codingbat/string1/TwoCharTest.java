package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoCharTest {

    private TwoChar fixture;

    @BeforeEach
    void setUp() {
        fixture = new TwoChar();
    }

    @Test
    void testcase1() {

        final String input = "java";
        final int index = 0;

        final String expected = "ja";

        final String actual = fixture.twoChar(input, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "java";
        final int index = 2;

        final String expected = "va";

        final String actual = fixture.twoChar(input, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "java";
        final int index = 3;

        final String expected = "ja";

        final String actual = fixture.twoChar(input, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;
        final int index = 0;

        final String expected = EMPTY_STRING;

        final String actual = fixture.twoChar(input, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;
        final int index = 0;

        final String expected = EMPTY_STRING;

        final String actual = fixture.twoChar(input, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenIndexIsLessThanZero() {

        final String input = "abc";
        final int index = -1;

        final String expected = "ab";

        final String actual = fixture.twoChar(input, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsLessThan2() {

        final String input = "a";
        final int index = 0;

        final String expected = EMPTY_STRING;

        final String actual = fixture.twoChar(input, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenIndexIsOutOfRange() {

        final String input = "abcd";
        final int index = 6;

        final String expected = "ab";

        final String actual = fixture.twoChar(input, index);

        assertThat(actual).isEqualTo(expected);
    }
}
