package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.codingbat.logic1.RedTicket.LOTTERY_FIVE;
import static io.thedevjournal.java.codingbat.logic1.RedTicket.LOTTERY_ONE;
import static io.thedevjournal.java.codingbat.logic1.RedTicket.LOTTERY_TEN;
import static io.thedevjournal.java.codingbat.logic1.RedTicket.LOTTERY_ZERO;
import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.NumberConstants.ZERO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RedTicketTest {

    private RedTicket fixture;

    @BeforeEach
    void setUp() {
        fixture = new RedTicket();
    }

    @Test
    void shouldReturnLotteryTen_WhenAllValuesAreTwo() {

        final int num1 = TWO;
        final int num2 = TWO;
        final int num3 = TWO;

        final int expected = LOTTERY_TEN;

        final int actual = fixture.redTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryFive_WhenAllValuesAreOnes() {

        final int num1 = ONE;
        final int num2 = ONE;
        final int num3 = ONE;

        final int expected = LOTTERY_FIVE;

        final int actual = fixture.redTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryFive_WhenAllValuesAreZeros() {

        final int num1 = ZERO;
        final int num2 = ZERO;
        final int num3 = ZERO;

        final int expected = LOTTERY_FIVE;

        final int actual = fixture.redTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryOne_WhenAllNumbersAreDifferent() {

        final int num1 = ZERO;
        final int num2 = ONE;
        final int num3 = TWO;

        final int expected = LOTTERY_ONE;

        final int actual = fixture.redTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryOne_WhenNum1IsEqualToNum2() {

        final int num1 = ZERO;
        final int num2 = ZERO;
        final int num3 = TWO;

        final int expected = LOTTERY_ZERO;

        final int actual = fixture.redTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryOne_WhenNum1IsEqualToNum3() {

        final int num1 = ZERO;
        final int num2 = TWO;
        final int num3 = ZERO;

        final int expected = LOTTERY_ZERO;

        final int actual = fixture.redTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }
}
