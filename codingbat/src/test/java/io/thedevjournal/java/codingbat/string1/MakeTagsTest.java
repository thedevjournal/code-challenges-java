package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MakeTagsTest {

    private MakeTags fixture;

    @BeforeEach
    void setUp() {
        fixture = new MakeTags();
    }

    @Test
    void testcase1() {

        final String tag = "i";
        final String word = "Yay";

        final String expected = "<i>Yay</i>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String tag = "i";
        final String word = "Hello";

        final String expected = "<i>Hello</i>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String tag = "cite";
        final String word = "Yay";

        final String expected = "<cite>Yay</cite>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreNull() {

        final String tag = null;
        final String word = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreEmpty() {

        final String tag = null;
        final String word = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenTagIsNullAndWordIsNotNull() {

        final String tag = null;
        final String word = "Hi";

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenTagIsEmptyAndWordIsNotNull() {

        final String tag = EMPTY_STRING;
        final String word = "Hi";

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenTagIsNotEmptyAndWordIsNull() {

        final String tag = "i";
        final String word = null;

        final String expected = "<i></i>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenTagIsNotEmptyAndWordIsEmpty() {

        final String tag = "i";
        final String word = EMPTY_STRING;

        final String expected = "<i></i>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }
}
