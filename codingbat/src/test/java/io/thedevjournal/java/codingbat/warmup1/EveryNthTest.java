package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EveryNthTest {

    private EveryNth fixture;

    @BeforeEach
    void setUp() {
        fixture = new EveryNth();
    }

    @Test
    void shouldReturnFirstChar_WhenStringLengthIsLessThanN() {

        final String str = "ab";

        final int number = 3;

        final String expected = "a";

        final String actual = fixture.everyNth(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSingleChar_WhenStringLengthIsGreaterThanNAndSingleHit() {

        final String str = "abc";

        final int number = 2;

        final String expected = "ac";

        final String actual = fixture.everyNth(str, number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSingleChar_WhenStringLengthIsGreaterThanNAndMultipleHit() {

        final String str = "abcdefg";

        final int number = 2;

        final String expected = "aceg";

        final String actual = fixture.everyNth(str, number);

        assertThat(actual).isEqualTo(expected);
    }
}
