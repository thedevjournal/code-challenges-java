package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EndsLyTest {

    private EndsLy fixture;

    @BeforeEach
    void setUp() {
        fixture = new EndsLy();
    }

    @Test
    void testcase1() {

        final String input = "oddly";

        final boolean expected = true;

        final boolean actual = fixture.endsLy(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "y";

        final boolean expected = false;

        final boolean actual = fixture.endsLy(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "oddy";

        final boolean expected = false;

        final boolean actual = fixture.endsLy(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenInputIsNull() {

        final String input = null;

        final boolean expected = false;

        final boolean actual = fixture.endsLy(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final boolean expected = false;

        final boolean actual = fixture.endsLy(input);

        assertThat(actual).isEqualTo(expected);
    }
}
