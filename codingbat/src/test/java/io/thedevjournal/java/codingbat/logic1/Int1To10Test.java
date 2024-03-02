package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Int1To10Test {

    private Int1To10 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Int1To10();
    }

    @Test
    void shouldReturnFalse_WhenNumberIs0WithoutOutsideMode() {

        final int number = 0;
        final boolean outsideMode = false;

        final boolean expected = false;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIs1WithoutOutsideMode() {

        final int number = 1;
        final boolean outsideMode = false;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIs5WithoutOutsideMode() {

        final int number = FIVE;
        final boolean outsideMode = false;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIs10WithoutOutsideMode() {

        final int number = TEN;
        final boolean outsideMode = false;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIs11WithoutOutsideMode() {

        final int number = TEN + 1;
        final boolean outsideMode = false;

        final boolean expected = false;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIs0WithOutsideMode() {

        final int number = 0;
        final boolean outsideMode = true;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIs1WithOutsideMode() {

        final int number = 1;
        final boolean outsideMode = true;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumberIs5WithOutsideMode() {

        final int number = FIVE;
        final boolean outsideMode = true;

        final boolean expected = false;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIs10WithOutsideMode() {

        final int number = TEN;
        final boolean outsideMode = true;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumberIs11WithOutsideMode() {

        final int number = TEN + 1;
        final boolean outsideMode = true;

        final boolean expected = true;

        final boolean actual = fixture.in1To10(number, outsideMode);

        assertThat(actual).isEqualTo(expected);
    }
}
