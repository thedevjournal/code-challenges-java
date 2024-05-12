package io.thedevjournal.java.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrontAgainTest {

    private FrontAgain fixture;

    @BeforeEach
    void setUp() {
        fixture = new FrontAgain();
    }

    @Test
    void testcase1() {

        final String input = "edited";

        final boolean expected = true;

        final boolean actual = fixture.frontAgain(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "edit";

        final boolean expected = false;

        final boolean actual = fixture.frontAgain(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "ed";

        final boolean expected = true;

        final boolean actual = fixture.frontAgain(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenInputIsNull() {

        final String input = null;

        final boolean expected = false;

        final boolean actual = fixture.frontAgain(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenInputIsEmpty() {

        final String input = null;

        final boolean expected = false;

        final boolean actual = fixture.frontAgain(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenInputIsSingleChar() {

        final String input = "a";

        final boolean expected = false;

        final boolean actual = fixture.frontAgain(input);

        assertThat(actual).isEqualTo(expected);
    }
}
