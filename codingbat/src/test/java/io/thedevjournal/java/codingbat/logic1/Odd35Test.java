package io.thedevjournal.java.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Odd35Test {

    private Odd35 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Odd35();
    }

    @Test
    void shouldReturnTrue_WhenNumberIsDivisibleBy3ButNotDivisibleBy5() {

        final int number = 3;

        final boolean expected = true;

        final boolean actual = fixture.old35(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIsNotDivisibleBy3ButDivisibleBy5() {

        final int number = 5;

        final boolean expected = true;

        final boolean actual = fixture.old35(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumberIsDivisibleBy3AndDivisibleBy5() {

        final int number = 15;

        final boolean expected = false;

        final boolean actual = fixture.old35(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumberIsNotDivisibleBy3AndNotDivisibleBy5() {

        final int number = 7;

        final boolean expected = false;

        final boolean actual = fixture.old35(number);

        assertThat(actual).isEqualTo(expected);
    }
}
