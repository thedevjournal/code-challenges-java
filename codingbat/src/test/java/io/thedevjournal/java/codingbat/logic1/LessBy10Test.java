package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LessBy10Test {

    private LessBy10 fixture;

    @BeforeEach
    void setUp() {
        fixture = new LessBy10();
    }

    @Test
    void shouldReturnTrue_WhenNum1AndNum2DifferenceIsGreaterThan10() {

        final int num1 = ONE;
        final int num2 = ONE + TEN;
        final int num3 = TWO;

        final boolean expected = true;

        final boolean actual = fixture.lessBy10(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum2AndNum3DifferenceIsGreaterThan10() {

        final int num1 = TWO;
        final int num2 = ONE + TEN;
        final int num3 = ONE;

        final boolean expected = true;

        final boolean actual = fixture.lessBy10(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1AndNum3DifferenceIsGreaterThan10() {

        final int num1 = ONE;
        final int num2 = TWO;
        final int num3 = ONE + TEN;

        final boolean expected = true;

        final boolean actual = fixture.lessBy10(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNoDifferenceIsGreaterThan10() {

        final int num1 = ONE;
        final int num2 = TWO;
        final int num3 = TEN - ONE;

        final boolean expected = false;

        final boolean actual = fixture.lessBy10(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }
}
