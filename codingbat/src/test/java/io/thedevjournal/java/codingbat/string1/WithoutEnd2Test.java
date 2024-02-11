package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WithoutEnd2Test {

    private WithoutEnd2 fixture;

    @BeforeEach
    void setUp() {
        fixture = new WithoutEnd2();
    }

    @Test
    void testcase1() {

        final String input = "Hello";

        final String expected = "ell";

        final String actual = fixture.withoutEnd2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "abc";

        final String expected = "b";

        final String actual = fixture.withoutEnd2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "ab";

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutEnd2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutEnd2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutEnd2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenInputIsSingleChar() {

        final String input = "a";

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutEnd2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenInputIsDoubleChar() {

        final String input = "ab";

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutEnd2(input);

        assertThat(actual).isEqualTo(expected);
    }
}
