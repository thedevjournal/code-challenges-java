package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FOUR;
import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InOrderTest {

    private InOrder fixture;

    @BeforeEach
    void setUp() {
        fixture = new InOrder();
    }

    @Test
    void shouldReturnTrue_WhenNumber3IsBiggerThanNumber2AndNumber2IsGreaterThanNumber3AndIgnoreNumber2CheckIsFalse() {

        final int number1 = ONE;
        final int number2 = TWO;
        final int number3 = FOUR;
        final boolean ignoreNumber2GreaterThanNumber1 = false;

        final boolean expected = true;

        final boolean actual = fixture.inOrder(number1, number2, number3, ignoreNumber2GreaterThanNumber1);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumber3IsSmallerThanNumber2AndNumber2IsGreaterThanNumber3AndIgnoreNumber2CheckIsFalse() {

        final int number1 = ONE;
        final int number2 = FOUR;
        final int number3 = TWO;
        final boolean ignoreNumber2GreaterThanNumber1 = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrder(number1, number2, number3, ignoreNumber2GreaterThanNumber1);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumber3IsGreaterThanNumber2AndNumber2IsSmallerThanNumber3AndIgnoreNumber2CheckIsFalse() {

        final int number1 = TWO;
        final int number2 = ONE;
        final int number3 = FOUR;
        final boolean ignoreNumber2GreaterThanNumber1 = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrder(number1, number2, number3, ignoreNumber2GreaterThanNumber1);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumber3IsGreaterThanNumber2AndIgnoreNumber2CheckIsTrue() {

        final int number1 = FOUR;
        final int number2 = TWO;
        final int number3 = FOUR;
        final boolean ignoreNumber2GreaterThanNumber1 = true;

        final boolean expected = true;

        final boolean actual = fixture.inOrder(number1, number2, number3, ignoreNumber2GreaterThanNumber1);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumber3IsSmallerThanNumber2AndIgnoreNumber2CheckIsTrue() {

        final int number1 = TWO;
        final int number2 = FOUR;
        final int number3 = ONE;
        final boolean ignoreNumber2GreaterThanNumber1 = true;

        final boolean expected = false;

        final boolean actual = fixture.inOrder(number1, number2, number3, ignoreNumber2GreaterThanNumber1);

        assertThat(actual).isEqualTo(expected);
    }
}
