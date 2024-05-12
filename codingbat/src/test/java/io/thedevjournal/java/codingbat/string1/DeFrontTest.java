package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeFrontTest {

    private DeFront fixture;

    @BeforeEach
    void setUp() {
        fixture = new DeFront();
    }

    @Test
    void testcase1() {

        final String input = "Hello";

        final String expected = "llo";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "java";

        final String expected = "va";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "away";

        final String expected = "aay";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsSingleCharA() {

        final String input = "a";

        final String expected = "a";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsSingleCharNotA() {

        final String input = "b";

        final String expected = EMPTY_STRING;

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsDoubleCharAB() {

        final String input = "ab";

        final String expected = "ab";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsDoubleCharANotB() {

        final String input = "ax";

        final String expected = "a";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsDoubleCharNotAB() {

        final String input = "xb";

        final String expected = "b";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsDoubleCharNotANotB() {

        final String input = "xx";

        final String expected = EMPTY_STRING;

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharAB() {

        final String input = "abx";

        final String expected = "abx";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharANotB() {

        final String input = "axx";

        final String expected = "ax";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharNotAB() {

        final String input = "xbx";

        final String expected = "bx";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharNotANotB() {

        final String input = "xxx";

        final String expected = "x";

        final String actual = fixture.deFront(input);

        assertThat(actual).isEqualTo(expected);
    }
}
