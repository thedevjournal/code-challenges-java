package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.codingbat.logic1.BlueTicket.LOTTERY_FIVE;
import static io.thedevjournal.java.codingbat.logic1.BlueTicket.LOTTERY_TEN;
import static io.thedevjournal.java.codingbat.logic1.BlueTicket.LOTTERY_ZERO;
import static io.thedevjournal.java.common.NumberConstants.ELEVEN;
import static io.thedevjournal.java.common.NumberConstants.FIFTEEN;
import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.FOUR;
import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.SEVEN;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.ZERO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlueTicketTest {

    private BlueTicket fixture;

    @BeforeEach
    void setUp() {
        fixture = new BlueTicket();
    }

    @Test
    void shouldReturnLotteryTen_WhenNum1AndNum2SumIsTen() {

        final int num1 = THREE;
        final int num2 = SEVEN;
        final int num3 = FIVE;

        final int expected = LOTTERY_TEN;

        final int actual = fixture.blueTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryTen_WhenNum2AndNum3SumIsTen() {

        final int num1 = FIVE;
        final int num2 = SEVEN;
        final int num3 = THREE;

        final int expected = LOTTERY_TEN;

        final int actual = fixture.blueTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryTen_WhenNum1AndNum3SumIsTen() {

        final int num1 = SEVEN;
        final int num2 = FIVE;
        final int num3 = THREE;

        final int expected = LOTTERY_TEN;

        final int actual = fixture.blueTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryFive_WhenNum1AndNum2SumIsExactlyTenMoreThanSum2() {

        final int num1 = FIFTEEN;
        final int num2 = ZERO;
        final int num3 = FIVE;

        final int expected = LOTTERY_FIVE;

        final int actual = fixture.blueTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryFive_WhenNum1AndNum2SumIsExactlyTenMoreThanSum3() {

        final int num1 = FOUR;
        final int num2 = ELEVEN;
        final int num3 = ONE;

        final int expected = LOTTERY_FIVE;

        final int actual = fixture.blueTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryZero_WhenAllSumsAreDifferent() {

        final int num1 = ZERO;
        final int num2 = SEVEN;
        final int num3 = FIVE;

        final int expected = LOTTERY_ZERO;

        final int actual = fixture.blueTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }
}
