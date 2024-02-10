package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Without2Test {

    private Without2 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Without2();
    }

    @Test
    void testcase1() {

        final String input = "HelloHe";

        final String expected = "lloHe";

        final String actual = fixture.without2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "HelloHi";

        final String expected = "HelloHi";

        final String actual = fixture.without2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "Hi";

        final String expected = EMPTY_STRING;

        final String actual = fixture.without2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.without2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.without2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenInputIsSingleChar() {

        final String input = "a";

        final String expected = "a";

        final String actual = fixture.without2(input);

        assertThat(actual).isEqualTo(expected);
    }
}
