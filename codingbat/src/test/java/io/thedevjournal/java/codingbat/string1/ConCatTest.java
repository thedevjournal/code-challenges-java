package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConCatTest {

    private ConCat fixture;

    @BeforeEach
    void setUp() {
        fixture = new ConCat();
    }

    @Test
    void testcase1() {

        final String inputA = "abc";
        final String inputB = "cat";

        final String expected = "abcat";

        final String actual = fixture.conCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String inputA = "dog";
        final String inputB = "cat";

        final String expected = "dogcat";

        final String actual = fixture.conCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String inputA = "abc";
        final String inputB = EMPTY_STRING;

        final String expected = "abc";

        final String actual = fixture.conCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenBothAreNull() {

        final String inputA = null;
        final String inputB = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.conCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenBothAreEmpty() {

        final String inputA = EMPTY_STRING;
        final String inputB = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.conCat(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenOneIsNullAndOtherIsEmpty() {

        final String inputA1 = EMPTY_STRING;
        final String inputB1 = null;
        final String inputA2 = null;
        final String inputB2 = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual1 = fixture.conCat(inputA1, inputB1);
        final String actual2 = fixture.conCat(inputA2, inputB2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
