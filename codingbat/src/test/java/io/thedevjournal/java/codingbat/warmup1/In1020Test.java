package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class In1020Test {

    private In1020 fixture;

    @BeforeEach
    void setUp() {
        fixture = new In1020();
    }

    @Test
    void shouldReturnFalse_WhenNum1IsLessThan10AndNum2IsLessThan10() {

        final int num1 = 5;
        final int num2 = 5;

        final boolean expected = false;

        final boolean actual = fixture.in1020(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1IsLessThan10AndNum2IsInRange() {

        final int num1 = 5;
        final int num2 = 10;

        final boolean expected = true;

        final boolean actual = fixture.in1020(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNum1IsLessThan10AndNum2IsGreaterThan20() {

        final int num1 = 5;
        final int num2 = 21;

        final boolean expected = false;

        final boolean actual = fixture.in1020(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1IsInRangeAndNum2IsLessThan10() {

        final int num1 = 10;
        final int num2 = 5;

        final boolean expected = true;

        final boolean actual = fixture.in1020(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1IsInRangeAndNum2IsInRange() {

        final int num1 = 15;
        final int num2 = 15;

        final boolean expected = true;

        final boolean actual = fixture.in1020(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1IsInRangeAndNum2IsGreaterThan20() {

        final int num1 = 20;
        final int num2 = 21;

        final boolean expected = true;

        final boolean actual = fixture.in1020(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNum1IsGreaterThan20AndNum2IsLessThan10() {

        final int num1 = 21;
        final int num2 = 5;

        final boolean expected = false;

        final boolean actual = fixture.in1020(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1IsGreaterThan20AndNum2IsInRange() {

        final int num1 = 15;
        final int num2 = 20;

        final boolean expected = true;

        final boolean actual = fixture.in1020(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNum1IsGreaterThan20AndNum2IsGreaterThan20() {

        final int num1 = 21;
        final int num2 = 21;

        final boolean expected = false;

        final boolean actual = fixture.in1020(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
