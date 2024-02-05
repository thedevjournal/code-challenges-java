package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MakeOutWordTest {

    private static final String YAY = "Yay";

    private MakeOutWord fixture;

    @BeforeEach
    void setUp() {
        this.fixture = new MakeOutWord();
    }

    @Test
    void testcase1() {

        final String out = "<<>>";
        final String word = YAY;

        final String expected = "<<Yay>>";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String out = "<<>>";
        final String word = "WooHoo";

        final String expected = "<<WooHoo>>";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String out = "[[]]";
        final String word = "word";

        final String expected = "[[word]]";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenWordIsNull() {

        final String out = "[[]]";
        final String word = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenWordIsEmpty() {

        final String out = "[[]]";
        final String word = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenOutIsNull() {

        final String out = null;
        final String word = YAY;

        final String expected = YAY;

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenOutIsEmpty() {

        final String out = EMPTY_STRING;
        final String word = YAY;

        final String expected = YAY;

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }
}
