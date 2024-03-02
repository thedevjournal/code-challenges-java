package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LastDigitTest {

    private LastDigit fixture;

    @BeforeEach
    void setUp() {
        fixture = new LastDigit();
    }

    @Test
    void shouldReturnTrue_WhenLastDigitsMatchNum1AndNum2() {

        final int num1 = TEN + TWO;
        final int num2 = TEN + TWO;
        final int num3 = TEN + ONE;

        final boolean expected = true;

        final boolean actual = fixture.lastDigit(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenLastDigitsMatchNum2AndNum3() {

        final int num1 = TEN + ONE;
        final int num2 = TEN + TWO;
        final int num3 = TEN + TWO;

        final boolean expected = true;

        final boolean actual = fixture.lastDigit(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenLastDigitsMatchNum1AndNum3() {

        final int num1 = TEN + TWO;
        final int num2 = TEN + ONE;
        final int num3 = TEN + TWO;

        final boolean expected = true;

        final boolean actual = fixture.lastDigit(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenLastDigitsDoNotMatch() {

        final int num1 = TEN + ONE;
        final int num2 = TEN + TWO;
        final int num3 = TEN + THREE;

        final boolean expected = false;

        final boolean actual = fixture.lastDigit(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }
}
