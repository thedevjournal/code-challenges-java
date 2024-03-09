package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.EIGHTEEN;
import static io.thedevjournal.java.common.NumberConstants.FIFTEEN;
import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.FORTY;
import static io.thedevjournal.java.common.NumberConstants.FOURTEEN;
import static io.thedevjournal.java.common.NumberConstants.NINETEEN;
import static io.thedevjournal.java.common.NumberConstants.SEVENTEEN;
import static io.thedevjournal.java.common.NumberConstants.SIXTEEN;
import static io.thedevjournal.java.common.NumberConstants.TEEN_END;
import static io.thedevjournal.java.common.NumberConstants.THIRTEEN;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.RandomValuesUtil.randomElement;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeenSumTest {

    static final Integer[] TEENS = new Integer[] { THIRTEEN, FOURTEEN, FIFTEEN, SIXTEEN, SEVENTEEN, EIGHTEEN, NINETEEN };

    private TeenSum fixture;

    @BeforeEach
    void setUp() {
        fixture = new TeenSum();
    }

    @Test
    void shouldReturnTeen_WhenNumber1IsTeen() {

        final int number1 = randomElement(TEENS);
        final int number2 = TWO;

        final int expected = TEEN_END;

        final int actual = fixture.teenSum(number1, number2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTeen_WhenNumber2IsTeen() {

        final int number1 = TWO;
        final int number2 = randomElement(TEENS);

        final int expected = TEEN_END;

        final int actual = fixture.teenSum(number1, number2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSum_WhenBothNumbersAreNotTeenLower() {

        final int number1 = TWO;
        final int number2 = THREE;

        final int expected = FIVE;

        final int actual = fixture.teenSum(number1, number2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSum_WhenBothNumbersAreNotTeenUpper() {

        final int number1 = TWENTY;
        final int number2 = TWENTY;

        final int expected = FORTY;

        final int actual = fixture.teenSum(number1, number2);

        assertThat(actual).isEqualTo(expected);
    }
}
