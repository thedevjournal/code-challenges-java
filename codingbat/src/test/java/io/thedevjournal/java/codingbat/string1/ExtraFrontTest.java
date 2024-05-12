package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExtraFrontTest {

    private ExtraFront fixture;

    @BeforeEach
    void setUp() {
        fixture = new ExtraFront();
    }

    @Test
    void testcase1() {

        final String input = "Hello";

        final String expected = "HeHeHe";

        final String actual = fixture.extraFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "ab";

        final String expected = "ababab";

        final String actual = fixture.extraFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "H";

        final String expected = "HHH";

        final String actual = fixture.extraFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.extraFront(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.extraFront(input);

        assertThat(actual).isEqualTo(expected);
    }
}
