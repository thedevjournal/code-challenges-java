package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WithoutEndTest {

    private WithoutEnd fixture;

    @BeforeEach
    void setUp() {
        fixture = new WithoutEnd();
    }

    @Test
    void testcase1() {

        final String input = "Hello";

        final String expected = "ell";

        final String actual = fixture.withoutEnd(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "java";

        final String expected = "av";

        final String actual = fixture.withoutEnd(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "coding";

        final String expected = "odin";

        final String actual = fixture.withoutEnd(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutEnd(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutEnd(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsSingleChar() {

        final String input = "a";

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutEnd(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsDoubleChar() {

        final String input = "ab";

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutEnd(input);

        assertThat(actual).isEqualTo(expected);
    }
}
