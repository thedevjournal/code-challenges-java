package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SleepInTest {

    private SleepIn fixture;

    @BeforeEach
    void setUp() {
        fixture = new SleepIn();
    }

    @Test
    void shouldNotBeSleeping_WhenWeekdayAndNotVacation() {

        final boolean expectedSleeping = false;

        final boolean isWeekday = true;
        final boolean isVacation = false;

        final boolean actualSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(actualSleeping).isEqualTo(expectedSleeping);
    }

    @Test
    void shouldBeSleeping_WhenNotWeekdayAndNotVacation() {

        final boolean expectedSleeping = true;

        final boolean isWeekday = false;
        final boolean isVacation = false;

        final boolean actualSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(actualSleeping).isEqualTo(expectedSleeping);
    }

    @Test
    void shouldBeSleeping_WhenNotWeekdayButVacation() {

        final boolean expectedSleeping = true;

        final boolean isWeekday = false;
        final boolean isVacation = true;

        final boolean actualSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(actualSleeping).isEqualTo(expectedSleeping);
    }

    @Test
    void shouldBeSleeping_WhenWeekdayOrVacation() {

        final boolean expectedSleeping = true;

        final boolean isWeekday = true;
        final boolean isVacation = true;

        final boolean actualSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(actualSleeping).isEqualTo(expectedSleeping);
    }
}
