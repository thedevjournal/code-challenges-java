package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HasBadTest {

    private HasBad fixture;

    @BeforeEach
    void setUp() {
        fixture = new HasBad();
    }

    @Test
    void testcase1() {

        final String input = "badxx";

        final boolean expected = true;

        final boolean actual = fixture.hasBad(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "xbadxx";

        final boolean expected = true;

        final boolean actual = fixture.hasBad(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "xxbadxx";

        final boolean expected = false;

        final boolean actual = fixture.hasBad(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenInputIsNull() {

        final String input = null;

        final boolean expected = false;

        final boolean actual = fixture.hasBad(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final boolean expected = false;

        final boolean actual = fixture.hasBad(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenInputLengthIsLess3() {

        final String input = "ab";

        final boolean expected = false;

        final boolean actual = fixture.hasBad(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenInputLengthIsEqualTo3AndNotBad() {

        final String input = "abc";

        final boolean expected = false;

        final boolean actual = fixture.hasBad(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenInputLengthIsEqualTo3AndIsBad() {

        final String input = "bad";

        final boolean expected = true;

        final boolean actual = fixture.hasBad(input);

        assertThat(actual).isEqualTo(expected);
    }
}
