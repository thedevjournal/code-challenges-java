package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.codingbat.logic1.GreenTicket.LOTTERY_TEN;
import static io.thedevjournal.java.codingbat.logic1.GreenTicket.LOTTERY_TWENTY;
import static io.thedevjournal.java.codingbat.logic1.GreenTicket.LOTTERY_ZERO;
import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreenTicketTest {

    private GreenTicket fixture;

    @BeforeEach
    void setUp() {
        fixture = new GreenTicket();
    }

    @Test
    void shouldReturnLotteryTwenty_WhenAllNumbersAreSame() {

        final int num1 = FIVE;
        final int num2 = FIVE;
        final int num3 = FIVE;

        final int expected = LOTTERY_TWENTY;

        final int actual = fixture.greenTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryTen_WhenNum1AndNum2AreSame() {

        final int num1 = FIVE;
        final int num2 = FIVE;
        final int num3 = TWENTY;

        final int expected = LOTTERY_TEN;

        final int actual = fixture.greenTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryTen_WhenNum2AndNum3AreSame() {

        final int num1 = TWENTY;
        final int num2 = FIVE;
        final int num3 = FIVE;

        final int expected = LOTTERY_TEN;

        final int actual = fixture.greenTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryTen_WhenNum1AndNum3AreSame() {

        final int num1 = FIVE;
        final int num2 = TWENTY;
        final int num3 = FIVE;

        final int expected = LOTTERY_TEN;

        final int actual = fixture.greenTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnLotteryZero_WhenAllNumbersAreDifferent() {

        final int num1 = FIVE;
        final int num2 = TWENTY;
        final int num3 = TEN;

        final int expected = LOTTERY_ZERO;

        final int actual = fixture.greenTicket(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }
}
