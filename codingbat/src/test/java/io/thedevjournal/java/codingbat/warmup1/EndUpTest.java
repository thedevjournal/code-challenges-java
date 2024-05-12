package io.thedevjournal.java.codingbat.warmup1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EndUpTest {

    private EndUp fixture;

    @BeforeEach
    void setUp() {
        fixture = new EndUp();
    }

    @Test
    void shouldReturnEmptyString_WhenStringIsEmpty() {

        final String str = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.endUp(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnAllUpperCaseString_WhenStringLengthIsLessThanEqualTo3() {

        final String str = "abc";

        final String expected = "ABC";

        final String actual = fixture.endUp(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLast3UpperCaseString_WhenStringLengthIsGreaterThan3() {

        final String str = "abcd";

        final String expected = "aBCD";

        final String actual = fixture.endUp(str);

        assertThat(actual).isEqualTo(expected);
    }
}
