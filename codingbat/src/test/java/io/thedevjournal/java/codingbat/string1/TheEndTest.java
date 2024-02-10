package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TheEndTest {

    private TheEnd fixture;

    @BeforeEach
    void setUp() {
        fixture = new TheEnd();
    }

    @Test
    void testcase1() {

        final String input = "Hello";
        final boolean front = true;

        final String expected = "H";

        final String actual = fixture.theEnd(input, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "Hello";
        final boolean front = false;

        final String expected = "o";

        final String actual = fixture.theEnd(input, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "oh";
        final boolean front = true;

        final String expected = "o";

        final String actual = fixture.theEnd(input, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenInputIsNull() {

        final String input = null;
        final boolean front = true;

        final String expected = EMPTY_STRING;

        final String actual = fixture.theEnd(input, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;
        final boolean front = true;

        final String expected = EMPTY_STRING;

        final String actual = fixture.theEnd(input, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenInputIsSingleCharAndFrontIsTrue() {

        final String input = "a";
        final boolean front = true;

        final String expected = "a";

        final String actual = fixture.theEnd(input, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenInputIsSingleCharAndFrontIsFalse() {

        final String input = "a";
        final boolean front = false;

        final String expected = "a";

        final String actual = fixture.theEnd(input, front);

        assertThat(actual).isEqualTo(expected);
    }
}
