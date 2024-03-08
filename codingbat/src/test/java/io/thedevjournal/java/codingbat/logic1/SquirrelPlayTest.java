package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.HUNDRED;
import static io.thedevjournal.java.common.NumberConstants.NINETY;
import static io.thedevjournal.java.common.NumberConstants.SIXTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquirrelPlayTest {

    private SquirrelPlay fixture;

    @BeforeEach
    void setUp() {
        fixture = new SquirrelPlay();
    }

    @Test
    void shouldReturnFalse_WhenTemperatureIsLessThanLowerLimitAndIsNotSummer() {

        final int temperature = SIXTY - 1;
        final boolean isSummer = false;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temperature, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenTemperatureIsLessThanLowerLimitAndIsSummer() {

        final int temperature = SIXTY - 1;
        final boolean isSummer = true;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temperature, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenTemperatureIsInRangeAndIsNotSummer() {

        final int temperature = SIXTY;
        final boolean isSummer = false;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temperature, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenTemperatureIsInRangeAndIsSummer() {

        final int temperature = SIXTY;
        final boolean isSummer = true;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temperature, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenTemperatureEqualToUpperLimitAndIsNotSummer() {

        final int temperature = NINETY;
        final boolean isSummer = false;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temperature, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenTemperatureEqualToUpperLimitAndIsSummer() {

        final int temperature = HUNDRED;
        final boolean isSummer = true;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temperature, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenTemperatureGreaterThanUpperLimitAndIsNotSummer() {

        final int temperature = HUNDRED - 1;
        final boolean isSummer = false;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temperature, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenTemperatureGreaterThanUpperLimitAndIsSummer() {

        final int temperature = HUNDRED + 1;
        final boolean isSummer = false;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temperature, isSummer);

        assertThat(actual).isEqualTo(expected);
    }
}
