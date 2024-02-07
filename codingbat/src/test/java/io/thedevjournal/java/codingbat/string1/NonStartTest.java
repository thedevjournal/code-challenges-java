package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NonStartTest {

    private NonStart fixture;

    @BeforeEach
    void setUp() {
        fixture = new NonStart();
    }

    @Test
    void testcase1() {

        final String inputA = "Hello";
        final String inputB = "There";

        final String expected = "ellohere";

        final String actual = fixture.nonStart(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String inputA = "java";
        final String inputB = "code";

        final String expected = "avaode";

        final String actual = fixture.nonStart(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String inputA = "shotl";
        final String inputB = "java";

        final String expected = "hotlava";

        final String actual = fixture.nonStart(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreNull() {

        final String inputA = null;
        final String inputB = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.nonStart(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreEmpty() {

        final String inputA = EMPTY_STRING;
        final String inputB = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.nonStart(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenOneIsEmptyAndOtherIsNull() {

        final String inputA1 = null;
        final String inputA2 = EMPTY_STRING;
        final String inputB1 = null;
        final String inputB2 = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual1 = fixture.nonStart(inputA1, inputB1);
        final String actual2 = fixture.nonStart(inputA2, inputB2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
