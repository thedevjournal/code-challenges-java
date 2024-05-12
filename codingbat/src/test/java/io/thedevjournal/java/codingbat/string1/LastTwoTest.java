package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LastTwoTest {

    private LastTwo fixture;

    @BeforeEach
    void setUp() {
        fixture = new LastTwo();
    }

    @Test
    void testcase1() {

        final String input = "coding";

        final String expected = "codign";

        final String actual = fixture.lastTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "cat";

        final String expected = "cta";

        final String actual = fixture.lastTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "ab";

        final String expected = "ba";

        final String actual = fixture.lastTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.lastTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.lastTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenInputIsSingleChar() {

        final String input = "a";

        final String expected = "a";

        final String actual = fixture.lastTwo(input);

        assertThat(actual).isEqualTo(expected);
    }
}
