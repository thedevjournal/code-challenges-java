package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiddleTwoTest {

    private MiddleTwo fixture;

    @BeforeEach
    void setUp() {
        fixture = new MiddleTwo();
    }

    @Test
    void testcase1() {

        final String input = "string";

        final String expected = "ri";

        final String actual = fixture.middleTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "code";

        final String expected = "od";

        final String actual = fixture.middleTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "Practice";

        final String expected = "ct";

        final String actual = fixture.middleTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.middleTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.middleTwo(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsOddLength() {
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(() -> fixture.middleTwo("a"));
    }

}
