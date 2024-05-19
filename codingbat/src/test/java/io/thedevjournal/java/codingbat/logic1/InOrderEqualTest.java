package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.FOUR;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InOrderEqualTest {

    private InOrderEqual fixture;

    @BeforeEach
    void setUp() {
        fixture = new InOrderEqual();
    }

    @Test
    void shouldReturnTrue_WhenNumbersAreStringIncreasingOrderAndEqualOkIsFalse() {

        final int num1 = THREE;
        final int num2 = FOUR;
        final int num3 = FIVE;
        final boolean equalOk = false;

        final boolean expected = true;

        final boolean actual = fixture.inOrderEqual(num1, num2, num3, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumber1IsOutOfOrderAndEqualOkIsFalse() {

        final int num1 = FIVE;
        final int num2 = THREE;
        final int num3 = FOUR;
        final boolean equalOk = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(num1, num2, num3, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumber2IsOutOfOrderAndEqualOkIsFalse() {

        final int num1 = THREE;
        final int num2 = FIVE;
        final int num3 = FOUR;
        final boolean equalOk = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(num1, num2, num3, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumber3IsOutOfOrderAndEqualOkIsFalse() {

        final int num1 = FOUR;
        final int num2 = FIVE;
        final int num3 = THREE;
        final boolean equalOk = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(num1, num2, num3, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumbersAreStringIncreasingOrderAndEqualOkIsTrue() {

        final int num1 = THREE;
        final int num2 = THREE;
        final int num3 = THREE;
        final boolean equalOk = true;

        final boolean expected = true;

        final boolean actual = fixture.inOrderEqual(num1, num2, num3, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumber1IsOutOfOrderAndEqualOkIsTrue() {

        final int num1 = FIVE;
        final int num2 = THREE;
        final int num3 = FOUR;
        final boolean equalOk = true;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(num1, num2, num3, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumber2IsOutOfOrderAndEqualOkIsTrue() {

        final int num1 = THREE;
        final int num2 = FIVE;
        final int num3 = FOUR;
        final boolean equalOk = true;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(num1, num2, num3, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumber3IsOutOfOrderAndEqualOkIsTrue() {

        final int num1 = FOUR;
        final int num2 = FIVE;
        final int num3 = THREE;
        final boolean equalOk = true;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(num1, num2, num3, equalOk);

        assertThat(actual).isEqualTo(expected);
    }
}
