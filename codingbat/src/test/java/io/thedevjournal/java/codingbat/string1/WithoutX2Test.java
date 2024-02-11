package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WithoutX2Test {

    private WithoutX2 fixture;

    @BeforeEach
    void setUp() {
        fixture = new WithoutX2();
    }

    @Test
    void testcase1() {

        final String input = "xHi";

        final String expected = "Hi";

        final String actual = fixture.withoutX2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "Hxi";

        final String expected = "Hi";

        final String actual = fixture.withoutX2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "Hi";

        final String expected = "Hi";

        final String actual = fixture.withoutX2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutX2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutX2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsSingleCharAndNoX() {

        final String input = "a";

        final String expected = "a";

        final String actual = fixture.withoutX2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsSingleCharAndX() {

        final String input = "x";

        final String expected = EMPTY_STRING;

        final String actual = fixture.withoutX2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharAndNoX() {

        final String input1 = "ab";
        final String input2 = "abc";
        final String input3 = "abcd";

        final String expected1 = "ab";
        final String expected2 = "abc";
        final String expected3 = "abcd";

        final String actual1 = fixture.withoutX2(input1);
        final String actual2 = fixture.withoutX2(input2);
        final String actual3 = fixture.withoutX2(input3);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharAndSingleX() {

        final String input1 = "xb";
        final String input2 = "xbc";
        final String input3 = "xbcd";
        final String input4 = "ax";
        final String input5 = "axc";
        final String input6 = "axcd";

        final String expected1 = "b";
        final String expected2 = "bc";
        final String expected3 = "bcd";
        final String expected4 = "a";
        final String expected5 = "ac";
        final String expected6 = "acd";

        final String actual1 = fixture.withoutX2(input1);
        final String actual2 = fixture.withoutX2(input2);
        final String actual3 = fixture.withoutX2(input3);
        final String actual4 = fixture.withoutX2(input4);
        final String actual5 = fixture.withoutX2(input5);
        final String actual6 = fixture.withoutX2(input6);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
        assertThat(actual4).isEqualTo(expected4);
        assertThat(actual5).isEqualTo(expected5);
        assertThat(actual6).isEqualTo(expected6);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsMultiCharAndBothX() {

        final String input1 = "xx";
        final String input2 = "xxc";
        final String input3 = "xxcd";

        final String expected1 = EMPTY_STRING;
        final String expected2 = "c";
        final String expected3 = "cd";

        final String actual1 = fixture.withoutX2(input1);
        final String actual2 = fixture.withoutX2(input2);
        final String actual3 = fixture.withoutX2(input3);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
    }
}
