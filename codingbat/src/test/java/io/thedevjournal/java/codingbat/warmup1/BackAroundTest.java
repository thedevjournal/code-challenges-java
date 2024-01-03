package io.thedevjournal.java.codingbat.warmup1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BackAroundTest {

    private BackAround fixture;

    @BeforeEach
    void setUp() {
        fixture = new BackAround();
    }

    @Test
    void shouldBackAround_WhenMultiCharString() {

        final String str = "cat";
        final String expected = "tcatt";
        final String actual = fixture.backAround(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldBackAround_WhenSingleCharString() {

        final String str = "a";
        final String expected = "aaa";
        final String actual = fixture.backAround(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldBackAround_WhenEmptyString() {

        final String str = EMPTY_STRING;
        final String expected = EMPTY_STRING;
        final String actual = fixture.backAround(str);

        assertThat(actual).isEqualTo(expected);
    }
}
