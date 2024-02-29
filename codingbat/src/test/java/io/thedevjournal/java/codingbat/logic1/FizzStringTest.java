package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.codingbat.logic1.FizzString.BUZZ;
import static io.thedevjournal.java.codingbat.logic1.FizzString.FIZZ;
import static io.thedevjournal.java.codingbat.logic1.FizzString.FIZZBUZZ;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzStringTest {

    private FizzString fixture;

    @BeforeEach
    void setUp() {
        fixture = new FizzString();
    }

    @Test
    void testcase1() {

        final String string = "fig";

        final String expected = FIZZ;

        final String actual = fixture.fizzString(string);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String string = "dib";

        final String expected = BUZZ;

        final String actual = fixture.fizzString(string);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String string = "fib";

        final String expected = FIZZBUZZ;

        final String actual = fixture.fizzString(string);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenStringIsEmptyOrNull() {

        final String string1 = null;
        final String string2 = "";

        final String expected = EMPTY_STRING;

        final String actual1 = fixture.fizzString(string1);
        final String actual2 = fixture.fizzString(string2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnOriginalString_WhenStringDoesNotStartWithFAndEndsWithB() {

        final String string = "string";

        final String expected = "string";

        final String actual = fixture.fizzString(string);

        assertThat(actual).isEqualTo(expected);
    }
}
