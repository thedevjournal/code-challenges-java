package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FOUR;
import static io.thedevjournal.java.common.NumberConstants.NINE;
import static io.thedevjournal.java.common.NumberConstants.SEVEN;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortaSumTest {

    private SortaSum fixture;

    @BeforeEach
    void setUp() {
        fixture = new SortaSum();
    }

    @Test
    void shouldReturnSum_WhenSumIsLessThan10() {

        final int num1 = THREE;
        final int num2 = FOUR;

        final int expected = SEVEN;

        final int actual = fixture.sortaSum(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn20_WhenSumIsEqualTo10() {

        final int num1 = THREE;
        final int num2 = SEVEN;

        final int expected = TWENTY;

        final int actual = fixture.sortaSum(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn20_WhenSumIsGreaterThan10AndLessThan19() {

        final int num1 = NINE;
        final int num2 = FOUR;

        final int expected = TWENTY;

        final int actual = fixture.sortaSum(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn20_WhenSumIsEqualTo19() {

        final int num1 = NINE;
        final int num2 = TEN;

        final int expected = TWENTY;

        final int actual = fixture.sortaSum(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn20_WhenSumIsGreaterThan19() {

        final int num1 = TEN;
        final int num2 = TEN;

        final int expected = TWENTY;

        final int actual = fixture.sortaSum(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn20_WhenSumIsGreaterThan20() {

        final int num1 = TEN;
        final int num2 = TEN + 1;

        final int expected = TWENTY + 1;

        final int actual = fixture.sortaSum(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
