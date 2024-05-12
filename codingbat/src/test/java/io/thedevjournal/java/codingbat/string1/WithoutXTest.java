package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WithoutXTest {

    private WithoutX fixture;

    @BeforeEach
    void setUp() {
        fixture = new WithoutX();
    }

    @Test
    void testcase1() {

        final String input = "xHix";

        final String expected = "Hi";

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "xHi";

        final String expected = "Hi";

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "Hxix";

        final String expected = "Hxi";

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsSingleCharNotX() {

        final String input = "a";

        final String expected = "a";

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsSingleCharX() {

        final String input = "x";

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharLeftX() {

        final String input = "xxAbxcD";

        final String expected = "xAbxcD";

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharRightX() {

        final String input = "AbxcDxx";

        final String expected = "AbxcDx";

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharLeftRightX() {

        final String input = "xxAbxcDxx";

        final String expected = "xAbxcDx";

        final String actual = fixture.withoutX(input);

        assertThat(actual).isEqualTo(expected);
    }
}
