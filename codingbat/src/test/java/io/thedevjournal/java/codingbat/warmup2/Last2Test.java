package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Last2Test {

    private Last2 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Last2();
    }

    @Test
    void scenario1() {

        final String str = "hixxhi";

        final int expected = 1;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scenario2() {

        final String str = "xaxxaxaxx";

        final int expected = 1;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scenario3() {

        final String str = "axxxaaxx";

        final int expected = 2;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn0_WhenStringIsNull() {

        final String str = null;

        final int expected = 0;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn0_WhenStringIsEmpty() {

        final String str = EMPTY_STRING;

        final int expected = 0;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn0_WhenStringIsSingleString() {

        final String str = "x";

        final int expected = 0;

        final int actual = fixture.last2(str);

        assertThat(actual).isEqualTo(expected);
    }
}
