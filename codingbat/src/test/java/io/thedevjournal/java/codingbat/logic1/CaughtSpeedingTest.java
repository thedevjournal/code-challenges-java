package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.codingbat.logic1.CaughtSpeeding.BIG_TICKET;
import static io.thedevjournal.java.codingbat.logic1.CaughtSpeeding.LIMITS_BIRTHDAY;
import static io.thedevjournal.java.codingbat.logic1.CaughtSpeeding.LIMITS_NOT_BIRTHDAY;
import static io.thedevjournal.java.codingbat.logic1.CaughtSpeeding.NO_TICKET;
import static io.thedevjournal.java.codingbat.logic1.CaughtSpeeding.SMALL_TICKET;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaughtSpeedingTest {

    private CaughtSpeeding fixture;

    @BeforeEach
    void setUp() {
        fixture = new CaughtSpeeding();
    }

    @Test
    void shouldReturnNoTicket_WhenSpeedIsLessThanLowerLimitAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = LIMITS_NOT_BIRTHDAY[0] - 1;

        final int expected = NO_TICKET;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnNoTicket_WhenSpeedIsLessThanLowerLimitAndBirthday() {

        final boolean isBirthday = true;
        final int speed = LIMITS_BIRTHDAY[0] - 1;

        final int expected = NO_TICKET;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSmallTicket_WhenSpeedIsInRangeAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = LIMITS_NOT_BIRTHDAY[0];

        final int expected = SMALL_TICKET;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSmallTicket_WhenSpeedIsInRangeAndBirthday() {

        final boolean isBirthday = true;
        final int speed = LIMITS_BIRTHDAY[0];

        final int expected = SMALL_TICKET;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSmallTicket_WhenSpeedIsInRangeUpperAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = LIMITS_NOT_BIRTHDAY[1];

        final int expected = SMALL_TICKET;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSmallTicket_WhenSpeedIsInRangeUpperAndBirthday() {

        final boolean isBirthday = true;
        final int speed = LIMITS_BIRTHDAY[1];

        final int expected = SMALL_TICKET;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBigTicket_WhenSpeedIsHigherAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = LIMITS_NOT_BIRTHDAY[1] + 1;

        final int expected = BIG_TICKET;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBigTicket_WhenSpeedIsHigherAndBirthday() {

        final boolean isBirthday = true;
        final int speed = LIMITS_BIRTHDAY[1] + 1;

        final int expected = BIG_TICKET;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }
}
