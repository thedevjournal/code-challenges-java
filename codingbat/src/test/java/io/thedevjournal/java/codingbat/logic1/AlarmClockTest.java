package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.codingbat.logic1.AlarmClock.ALARM_10AM;
import static io.thedevjournal.java.codingbat.logic1.AlarmClock.ALARM_7AM;
import static io.thedevjournal.java.codingbat.logic1.AlarmClock.ALARM_OFF;
import static io.thedevjournal.java.common.NumberConstants.FOUR;
import static io.thedevjournal.java.common.NumberConstants.SIX;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlarmClockTest {

    private AlarmClock fixture;

    @BeforeEach
    void setUp() {
        fixture = new AlarmClock();
    }

    @Test
    void shouldReturnOffWhenVacationAndWeekend() {

        final int day1 = SIX;
        final int day2 = 0;
        final boolean vacation = true;

        final String expected = ALARM_OFF;

        final String actual1 = fixture.alarmClock(day1, vacation);
        final String actual2 = fixture.alarmClock(day2, vacation);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnOffWhenVacationAndWeekday() {

        final int day = TWO;
        final boolean vacation = true;

        final String expected = ALARM_10AM;

        final String actual = fixture.alarmClock(day, vacation);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnOffWhenNotVacationAndWeekend() {

        final int day1 = 0;
        final int day2 = SIX;
        final boolean vacation = false;

        final String expected = ALARM_10AM;

        final String actual1 = fixture.alarmClock(day1, vacation);
        final String actual2 = fixture.alarmClock(day2, vacation);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnOffWhenNotVacationAndWeekday() {

        final int day = FOUR;
        final boolean vacation = false;

        final String expected = ALARM_7AM;

        final String actual = fixture.alarmClock(day, vacation);

        assertThat(actual).isEqualTo(expected);
    }
}
