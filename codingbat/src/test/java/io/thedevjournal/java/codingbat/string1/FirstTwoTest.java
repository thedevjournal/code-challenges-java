package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstTwoTest {

    private FirstTwo fixture;

    @BeforeEach
    void setUp() {
        fixture = new FirstTwo();
    }

    @Test
    void testcase1() {

        final String input = "Hello";

        final String expected = "He";

        final String actual = fixture.firstTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "abcdefg";

        final String expected = "ab";

        final String actual = fixture.firstTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "ab";

        final String expected = "ab";

        final String actual = fixture.firstTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.firstTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.firstTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnString_WhenInputLengthIsEqualTo1() {

        final String input = "a";

        final String expected = "a";

        final String actual = fixture.firstTwo(input);

        assertThat(actual).isEqualTo(expected);
    }
}
