package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IcyHotTest {

    private IcyHot fixture;

    @BeforeEach
    void setUp() {
        fixture = new IcyHot();
    }

    @Test
    void shouldReturnTrue_WhenFirstIsLessThanZeroAndSecondIsGreaterThan100() {

        final int temp1 = -1;
        final int temp2 = 101;

        final boolean expected = true;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstIsLessThanZeroAndSecondIsLessThan100() {

        final int temp1 = -1;
        final int temp2 = 99;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstIsLessThanZeroAndSecondIsEqualTo100() {

        final int temp1 = -1;
        final int temp2 = 100;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstIsEqualToZeroAndSecondIsGreaterThan100() {

        final int temp1 = 0;
        final int temp2 = 101;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstIsEqualToZeroAndSecondIsLessThan100() {

        final int temp1 = 0;
        final int temp2 = 99;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstIsEqualToZeroAndSecondIsEqualTo100() {

        final int temp1 = 0;
        final int temp2 = 100;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstIsGreaterThanZeroAndSecondIsLessThan100() {

        final int temp1 = 0;
        final int temp2 = 99;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstIsGreaterThanZeroAndSecondIsEqualTo100() {

        final int temp1 = 0;
        final int temp2 = 100;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstIsGreaterThanZeroAndSecondIsGreaterThan100() {

        final int temp1 = 1;
        final int temp2 = 101;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenSecondIsLessThan0AndFirstIsGreaterThan100() {

        final int temp1 = 101;
        final int temp2 = -1;

        final boolean expected = true;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenSecondIsLessThan0AndFirstIsEqualTo100() {

        final int temp1 = 100;
        final int temp2 = -1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenSecondIsLessThan0AndFirstIsLessThan100() {

        final int temp1 = 99;
        final int temp2 = -1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenSecondIsEqualTo0AndFirstIsGreaterThan100() {

        final int temp1 = 101;
        final int temp2 = 0;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenSecondIsEqualTo0AndFirstIsEqualTo100() {

        final int temp1 = 100;
        final int temp2 = 0;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenSecondIsEqualTo0AndFirstIsLessThan100() {

        final int temp1 = 99;
        final int temp2 = 0;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenSecondIsGreaterThan0AndFirstIsGreaterThan100() {

        final int temp1 = 101;
        final int temp2 = 1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenSecondIsGreaterThan0AndFirstIsEqualTo100() {

        final int temp1 = 100;
        final int temp2 = 1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenSecondIsGreaterThan0AndFirstIsLessThan100() {
        final int temp1 = 99;
        final int temp2 = 1;

        final boolean expected = false;

        final boolean actual = fixture.icyHot(temp1, temp2);

        assertThat(actual).isEqualTo(expected);
    }
}
