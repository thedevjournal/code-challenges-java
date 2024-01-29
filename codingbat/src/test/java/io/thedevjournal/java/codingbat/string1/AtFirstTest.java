package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AtFirstTest {

    private AtFirst fixture;

    @BeforeEach
    void setUp() {
        fixture = new AtFirst();
    }

    @Test
    void testcase1() {

        final String input = "hello";

        final String expected = "he";

        final String actual = fixture.atFirst(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "hi";

        final String expected = "hi";

        final String actual = fixture.atFirst(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "h";

        final String expected = "h@";

        final String actual = fixture.atFirst(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = "@@";

        final String actual = fixture.atFirst(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = "@@";

        final String actual = fixture.atFirst(input);

        assertThat(actual).isEqualTo(expected);
    }
}
