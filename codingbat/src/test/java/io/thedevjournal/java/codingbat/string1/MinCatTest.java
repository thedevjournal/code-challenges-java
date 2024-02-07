package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinCatTest {

    private MinCat fixture;

    @BeforeEach
    void setUp() {
        fixture = new MinCat();
    }

    @Test
    void testcase1() {

        final String inputA = "Hello";
        final String inputB = "Hi";

        final String expected = "loHi";

        final String actual = fixture.minCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String inputA = "Hello";
        final String inputB = "java";

        final String expected = "ellojava";

        final String actual = fixture.minCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String inputA = "java";
        final String inputB = "Hello";

        final String expected = "javaello";

        final String actual = fixture.minCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreNull() {

        final String inputA = null;
        final String inputB = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.minCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreEmpty() {

        final String inputA = EMPTY_STRING;
        final String inputB = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.minCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenOneIsNullAndOtherIsNotNull() {

        final String inputA1 = null;
        final String inputB1 = EMPTY_STRING;
        final String inputA2 = EMPTY_STRING;
        final String inputB2 = null;
        final String inputA3 = null;
        final String inputB3 = "a";
        final String inputA4 = "a";
        final String inputB4 = null;

        final String expected = EMPTY_STRING;

        final String actual1 = fixture.minCat(inputA1, inputB1);
        final String actual2 = fixture.minCat(inputA2, inputB2);
        final String actual3 = fixture.minCat(inputA3, inputB3);
        final String actual4 = fixture.minCat(inputA4, inputB4);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
        assertThat(actual3).isEqualTo(expected);
        assertThat(actual4).isEqualTo(expected);
    }

    @Test
    void shouldReturnConcat_WhenBothAreSameLength() {

        final String inputA = "a";
        final String inputB = "b";

        final String expected = "ab";

        final String actual1 = fixture.minCat(inputA, inputB);

        assertThat(actual1).isEqualTo(expected);
    }
}
