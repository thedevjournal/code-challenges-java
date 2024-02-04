package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MakeAbbaTest {

    private MakeAbba fixture;

    @BeforeEach
    void setUp() {
        fixture = new MakeAbba();
    }

    @Test
    void shouldReturnEmptyString_WhenBothAreNull() {

        final String inputA = null;
        final String inputB = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenBothAreEmpty() {

        final String inputA = EMPTY_STRING;
        final String inputB = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNullAndBIsNotNull() {

        final String inputA = null;
        final String inputB = "B";

        final String expected = "BB";

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsEmptyAndBIsNotNull() {

        final String inputA = EMPTY_STRING;
        final String inputB = "B";

        final String expected = "BB";

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnAA_WhenAIsNotNullAndBIsNull() {

        final String inputA = "A";
        final String inputB = null;

        final String expected = "AA";

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNull() {

        final String inputA = "A";
        final String inputB = EMPTY_STRING;

        final String expected = "AA";

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNotNullUpper() {

        final String inputA = "A";
        final String inputB = "B";

        final String expected = "ABBA";

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNotNullLower() {

        final String inputA = "a";
        final String inputB = "b";

        final String expected = "abba";

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNotNullMixed() {

        final String inputA = "A";
        final String inputB = "b";

        final String expected = "AbbA";

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNotNullMultiChar() {

        final String inputA = "Abc";
        final String inputB = "Xyz";

        final String expected = "AbcXyzXyzAbc";

        final String actual = fixture.makeAbba(inputA, inputB);

        assertThat(actual).isEqualTo(expected);
    }
}
