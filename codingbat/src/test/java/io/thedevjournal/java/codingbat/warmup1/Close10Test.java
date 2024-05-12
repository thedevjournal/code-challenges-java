package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Close10Test {

    private Close10 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Close10();
    }

    @Test
    void shouldReturnNum1_WhenNum1IsClose() {

        final int value1 = 8;
        final int value2 = 13;

        final int expected = value1;

        final int actual = fixture.close10(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnNum2_WhenNum2IsClose() {

        final int value1 = 13;
        final int value2 = 8;

        final int expected = value2;

        final int actual = fixture.close10(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturn0_WhenBothAreEquallyClose() {

        final int value1 = 7;
        final int value2 = 13;

        final int expected = 0;

        final int actual = fixture.close10(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }
}
