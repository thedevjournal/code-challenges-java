package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LastCharsTest {

    private LastChars fixture;

    @BeforeEach
    void setUp() {
        fixture = new LastChars();
    }

    @Test
    void testcase1() {

        final String inputA = "last";
        final String inputB = "chars";

        final String expected = "ls";

        final String actual = fixture.lastChars(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String inputA = "yo";
        final String inputB = "java";

        final String expected = "ya";

        final String actual = fixture.lastChars(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String inputA = "hi";
        final String inputB = EMPTY_STRING;

        final String expected = "h@";

        final String actual = fixture.lastChars(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnDoubleAt_WhenBothAreNull() {

        final String inputA = null;
        final String inputB = null;

        final String expected = "@@";

        final String actual = fixture.lastChars(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnDoubleAt_WhenBothAreEmpty() {

        final String inputA = EMPTY_STRING;
        final String inputB = EMPTY_STRING;

        final String expected = "@@";

        final String actual = fixture.lastChars(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnDoubleAt_WhenOneIsNullAndOtherIsEmpty() {

        final String inputA1 = EMPTY_STRING;
        final String inputB1 = null;
        final String inputA2 = null;
        final String inputB2 = EMPTY_STRING;

        final String expected = "@@";

        final String actual1 = fixture.lastChars(inputA1, inputB1);
        final String actual2 = fixture.lastChars(inputA2, inputB2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

}
