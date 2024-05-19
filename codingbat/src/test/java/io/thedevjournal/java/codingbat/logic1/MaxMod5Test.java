package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.SEVEN;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.NumberConstants.ZERO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxMod5Test {

    private MaxMod5 fixture;

    @BeforeEach
    void setUp() {
        fixture = new MaxMod5();
    }

    @Test
    void shouldReturnZero_WhenBothValuesAreSame() {

        final int num1 = SEVEN;
        final int num2 = SEVEN;

        final int expected = ZERO;

        final int actual = fixture.maxMod5(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxValue_WhenBothNumbersAreDifferentAndNum1IsSmaller() {

        final int num1 = ONE;
        final int num2 = TWO;

        final int expected = TWO;

        final int actual = fixture.maxMod5(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxValue_WhenBothNumbersAreDifferentAndNum2IsSmaller() {

        final int num1 = TWO;
        final int num2 = ONE;

        final int expected = TWO;

        final int actual = fixture.maxMod5(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMinValue_WhenBothNumbersHaveSameRemainderWhenDividedByFive() {

        final int num1 = ONE;
        final int num2 = TEN + ONE;

        final int expected = ONE;

        final int actual = fixture.maxMod5(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
