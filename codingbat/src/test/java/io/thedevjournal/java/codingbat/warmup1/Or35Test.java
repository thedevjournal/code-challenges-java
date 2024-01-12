package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Or35Test {

    private Or35 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Or35();
    }

    @Test
    void shouldReturnTrue_WhenMultipleOf3() {

        final boolean expected = true;

        final int number = 6;

        final boolean actual = fixture.or35(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenMultipleOf5() {

        final boolean expected = true;

        final int number = 10;

        final boolean actual = fixture.or35(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenMultipleOf3And5() {

        final boolean expected = true;

        final int number = 15;

        final boolean actual = fixture.or35(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNoMultiple() {

        final boolean expected = false;

        final int number = 7;

        final boolean actual = fixture.or35(number);

        assertThat(actual).isEqualTo(expected);
    }
}
