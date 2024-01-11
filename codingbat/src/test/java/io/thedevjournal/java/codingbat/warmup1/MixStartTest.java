package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MixStartTest {

    private MixStart fixture;

    @BeforeEach
    void setUp() {
        fixture = new MixStart();
    }

    @Test
    void shouldReturnFalse_WhenStringLengthIsLessThan3() {

        final String str = "ab";

        final boolean expected = false;

        final boolean actual = fixture.mixStart(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenStringContainsIxAt2ndAnd3rdPosition() {

        final String str = "abcd";

        final boolean expected = false;

        final boolean actual = fixture.mixStart(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenStringContainsIxAt2ndAnd3rdPosition() {

        final String str = "aixd";

        final boolean expected = true;

        final boolean actual = fixture.mixStart(str);

        assertThat(actual).isEqualTo(expected);
    }
}
