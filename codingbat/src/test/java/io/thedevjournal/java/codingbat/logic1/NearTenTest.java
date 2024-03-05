package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.EIGHT;
import static io.thedevjournal.java.common.NumberConstants.NINE;
import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.RandomValuesUtil.randomInteger;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.thedevjournal.java.common.NumberConstants;

class NearTenTest {

    private NearTen fixture;


    @BeforeEach
    void setUp() {
        fixture = new NearTen();
    }

    @Test
    void shouldReturnTrue_WhenModByTenReturnsZero() {

        final int number = TEN * randomInteger();

        final boolean expected = true;

        final boolean actual = fixture.nearTen(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenModByTenReturnsOneOrTwo() {

        final int number1 = TEN * randomInteger();
        final int number2 = TEN * randomInteger();

        final boolean expected = true;

        final boolean actual1 = fixture.nearTen(number1 + ONE);
        final boolean actual2 = fixture.nearTen(number2 + TWO);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenModByTenReturnsNineOrEight() {

        final int number1 = TEN * randomInteger();
        final int number2 = TEN * randomInteger();

        final boolean expected = true;

        final boolean actual1 = fixture.nearTen(number1 + NINE);
        final boolean actual2 = fixture.nearTen(number2 + EIGHT);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenModByTenReturnsBetweenThreeAndSeven() {

        final int number1 = TEN * randomInteger();
        final int number2 = TEN * randomInteger();
        final int number3 = TEN * randomInteger();
        final int number4 = TEN * randomInteger();
        final int number5 = TEN * randomInteger();

        final boolean expected = false;

        final boolean actual1 = fixture.nearTen(number1 + NumberConstants.THREE);
        final boolean actual2 = fixture.nearTen(number2 + NumberConstants.FOUR);
        final boolean actual3 = fixture.nearTen(number3 + NumberConstants.FIVE);
        final boolean actual4 = fixture.nearTen(number4 + NumberConstants.SIX);
        final boolean actual5 = fixture.nearTen(number5 + NumberConstants.SEVEN);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
        assertThat(actual3).isEqualTo(expected);
        assertThat(actual4).isEqualTo(expected);
        assertThat(actual5).isEqualTo(expected);
    }
}
