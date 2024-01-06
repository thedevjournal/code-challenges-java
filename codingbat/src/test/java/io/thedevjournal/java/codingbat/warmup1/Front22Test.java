package io.thedevjournal.java.codingbat.warmup1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Front22Test {

    private Front22 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Front22();
    }

    @Test
    void shouldPrefixSuffix_WhenStringLengthIsGreaterThan2() {

        final String str = "cat";
        final String expected = "cacatca";
        final String actual = fixture.front22(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldPrefixSuffix_WhenStringLengthIsEqualTo2() {

        final String str = "ca";
        final String expected = "cacaca";
        final String actual = fixture.front22(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldPrefixSuffix_WhenStringLengthIsLessThan2() {

        final String str = "c";
        final String expected = "ccc";
        final String actual = fixture.front22(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldPrefixSuffix_WhenStringLengthIsEmpty() {

        final String str = EMPTY_STRING;
        final String expected = str;
        final String actual = fixture.front22(str);

        assertThat(actual).isEqualTo(expected);
    }
}
