package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstHalfTest {

    private FirstHalf fixture;

    @BeforeEach
    void setUp() {
        fixture = new FirstHalf();
    }

    @Test
    void testcase1() {

        final String input = "WooHoo";

        final String expected = "Woo";

        final String actual = fixture.firstHalf(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "HelloThere";

        final String expected = "Hello";

        final String actual = fixture.firstHalf(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "abcdef";

        final String expected = "abc";

        final String actual = fixture.firstHalf(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.firstHalf(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.firstHalf(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenInputIsSingleChar() {

        final String input = "a";

        final String expected = "a";

        final String actual = fixture.firstHalf(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFirstChar_WhenInputIsDoubleChar() {

        final String input = "ab";

        final String expected = "a";

        final String actual = fixture.firstHalf(input);

        assertThat(actual).isEqualTo(expected);
    }
}
