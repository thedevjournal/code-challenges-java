package io.thedevjournal.java.codingbat.warmup1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Front3Test {

    private Front3 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Front3();
    }

    @Test
    void shouldReturnCorrectString_WhenStringLengthIsLessThan3() {

        final String expected = "aaa";
        final String str = "a";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCorrectString_WhenStringLengthIsGreaterThan3() {

        final String expected = "ChoChoCho";
        final String str = "Chocolate";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCorrectString_WhenStringLengthIsEqualTo3() {

        final String expected = "JavJavJav";
        final String str = "Jav";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCorrectString_WhenStringIsBlank() {

        final String expected = EMPTY_STRING;
        final String str = EMPTY_STRING;
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }
}
