package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PosNegTest {

    private PosNeg fixture;

    @BeforeEach
    void setUp() {
        fixture = new PosNeg();
    }

    @Test
    void shouldReturnTrue_WhenNegativeFlagUnsetAndFirstIsNegative() {

        final boolean expected = true;

        final int value1 = -1;
        final int value2 = 1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNegativeFlagUnsetAndSecondIsNegative() {

        final boolean expected = true;

        final int value1 = 1;
        final int value2 = -1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNegativeFlagUnsetAndBothAreNegative() {

        final boolean expected = false;

        final int value1 = -1;
        final int value2 = -1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNegativeFlagUnsetAndBothArePositive() {

        final boolean expected = false;

        final int value1 = 1;
        final int value2 = 1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNegativeFlagIsSetAndFirstIsNegative() {

        final boolean expected = false;

        final int value1 = -1;
        final int value2 = 1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNegativeFlagIsSetAndSecondIsNegative() {

        final boolean expected = false;

        final int value1 = 1;
        final int value2 = -1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNegativeFlagIsSetAndBothArePositive() {

        final boolean expected = false;

        final int value1 = 1;
        final int value2 = 1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNegativeFlagIsSetAndBothAreNegative() {

        final boolean expected = true;

        final int value1 = -1;
        final int value2 = -1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(value1, value2, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }
}
