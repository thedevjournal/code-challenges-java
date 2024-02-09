package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SeeColorTest {

    private SeeColor fixture;

    @BeforeEach
    void setUp() {
        fixture = new SeeColor();
    }

    @Test
    void testcase1() {

        final String input = "redxx";

        final String expected = "red";

        final String actual = fixture.seeColor(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "xxred";

        final String expected = EMPTY_STRING;

        final String actual = fixture.seeColor(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "blueTimes";

        final String expected = "blue";

        final String actual = fixture.seeColor(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.seeColor(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.seeColor(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputLengthIsLessThan2() {

        final String str1 = "a";
        final String str2 = "ab";

        final String expected = EMPTY_STRING;

        final String actual1 = fixture.seeColor(str1);
        final String actual2 = fixture.seeColor(str2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
