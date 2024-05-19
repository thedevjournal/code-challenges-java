package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StartWordTest {

    private StartWord fixture;

    @BeforeEach
    void setUp() {
        fixture = new StartWord();
    }

    @Test
    void testcase1() {

        final String input = "hippo";
        final String word = "hi";

        final String expected = "hi";

        final String actual = fixture.startWord(input, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "hippo";
        final String word = "xip";

        final String expected = "hip";

        final String actual = fixture.startWord(input, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "hippo";
        final String word = "i";

        final String expected = "h";

        final String actual = fixture.startWord(input, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreNull() {

        final String input = null;
        final String word = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.startWord(input, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreEmpty() {

        final String input = EMPTY_STRING;
        final String word = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.startWord(input, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenOneIsNullAndOtherIsEmpty() {

        final String str1 = null;
        final String word1 = EMPTY_STRING;
        final String str2 = EMPTY_STRING;
        final String word2 = null;

        final String expected = EMPTY_STRING;

        final String actual1 = fixture.startWord(str1, word1);
        final String actual2 = fixture.startWord(str2, word2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputLengthIsGreaterThanEqualTo1AndWordIsEmpty() {

        final String str1 = "h";
        final String word1 = EMPTY_STRING;
        final String str2 = "hh";
        final String word2 = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual1 = fixture.startWord(str1, word1);
        final String actual2 = fixture.startWord(str2, word2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputLengthIsLessThanWordLength() {

        final String input = "h";
        final String word = "ix";

        final String expected = EMPTY_STRING;

        final String actual = fixture.startWord(input, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputLengthIsEqualToWordLength() {

        final String input = "h";
        final String word = "i";

        final String expected = "h";

        final String actual = fixture.startWord(input, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputAndWordAreCompletelyDifferent() {

        final String input = "hello";
        final String word = "ab";

        final String expected = "";

        final String actual = fixture.startWord(input, word);

        assertThat(actual).isEqualTo(expected);
    }
}
