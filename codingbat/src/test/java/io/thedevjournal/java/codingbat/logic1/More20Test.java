package io.thedevjournal.java.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class More20Test {

    private More20 fixture;

    @BeforeEach
    void setUp() {
        fixture = new More20();
    }

    @Test
    void shoulReturnFalse_WhenNumberIsAMultipleOf20() {

        final int number = 20;

        final boolean expected = false;

        final boolean actual = fixture.more20(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shoulReturnTrue_WhenNumberIsOneGreatherThanMultipleOf20() {

        final int number = 21;

        final boolean expected = true;

        final boolean actual = fixture.more20(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shoulReturnTrue_WhenNumberIsTwoGreatherThanMultipleOf20() {

        final int number = 22;

        final boolean expected = true;

        final boolean actual = fixture.more20(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shoulReturnFalse_WhenNumberIsMoreGreatherThanMultipleOf20() {

        final int number = 23;

        final boolean expected = false;

        final boolean actual = fixture.more20(number);

        assertThat(actual).isEqualTo(expected);
    }
}
