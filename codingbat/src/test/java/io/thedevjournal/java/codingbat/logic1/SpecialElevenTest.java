package io.thedevjournal.java.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpecialElevenTest {

    private SpecialEleven fixture;

    @BeforeEach
    void setUp() {
        fixture = new SpecialEleven();
    }

    @Test
    void shouldReturnTrue_WhenNumberIsAMultipleOf11() {

        final int number = 22;

        final boolean expected = true;

        final boolean actual = fixture.specialEleven(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIs1MoreThanMultipleOf11() {

        final int number = 23;

        final boolean expected = true;

        final boolean actual = fixture.specialEleven(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIsNotASpecialNumber() {

        final int number = 24;

        final boolean expected = false;

        final boolean actual = fixture.specialEleven(number);

        assertThat(actual).isEqualTo(expected);
    }
}
