package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HasTeenTest {

    private HasTeen fixture;

    @BeforeEach
    void setUp() {
        fixture = new HasTeen();
    }

    @Test
    void shouldReturnFalse_WhenNum1IsLessThan13AndNum2AndNum3AreNotInRange() {

        final int num1 = 12;
        final int num2 = 12;
        final int num3 = 12;

        final boolean expected = false;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1IsEqualTo13AndNum2AndNum3AreNotInRange() {

        final int num1 = 13;
        final int num2 = 12;
        final int num3 = 12;

        final boolean expected = true;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1IsGreaterThan13AndLessThan19AndNum2AndNum3AreNotInRange() {

        final int num1 = 15;
        final int num2 = 12;
        final int num3 = 12;

        final boolean expected = true;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1IsEqualTo19AndNum2AndNum3AreNotInRange() {

        final int num1 = 19;
        final int num2 = 12;
        final int num3 = 12;

        final boolean expected = true;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNum1IsGreaterThan19AndNum2AndNum3AreNotInRange() {

        final int num1 = 20;
        final int num2 = 12;
        final int num3 = 12;

        final boolean expected = false;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNum2IsLessThan13AndNum1AndNum3AreNotInRange() {

        final int num1 = 20;
        final int num2 = 12;
        final int num3 = 20;

        final boolean expected = false;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum2IsEqualTo13AndNum1AndNum3AreNotInRange() {

        final int num1 = 20;
        final int num2 = 13;
        final int num3 = 20;

        final boolean expected = true;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum2IsGreaterThan13AndLessThan19AndNum1AndNum3AreNotInRange() {

        final int num1 = 20;
        final int num2 = 15;
        final int num3 = 20;

        final boolean expected = true;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum1IsEqualTo19AndNum1AndNum3AreNotInRange() {

        final int num1 = 20;
        final int num2 = 19;
        final int num3 = 20;

        final boolean expected = true;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNum2IsGreaterThan19AndNum1AndNum3AreNotInRange() {

        final int num1 = 20;
        final int num2 = 20;
        final int num3 = 20;

        final boolean expected = false;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNum3IsLessThan13AndNum1AndNum2AreNotInRange() {

        final int num1 = 20;
        final int num2 = 20;
        final int num3 = 12;

        final boolean expected = false;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum3IsEqualTo13AndNum1AndNum2AreNotInRange() {

        final int num1 = 20;
        final int num2 = 20;
        final int num3 = 13;

        final boolean expected = true;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum3IsGreaterThan13AndLessThan19AndNum1AndNum2AreNotInRange() {

        final int num1 = 20;
        final int num2 = 20;
        final int num3 = 15;

        final boolean expected = true;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNum3IsEqualTo19AndNum1AndNum2AreNotInRange() {

        final int num1 = 20;
        final int num2 = 20;
        final int num3 = 19;

        final boolean expected = true;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNum3IsGreaterThan19AndNum1AndNum2AreNotInRange() {

        final int num1 = 20;
        final int num2 = 20;
        final int num3 = 20;

        final boolean expected = false;

        final boolean actual = fixture.hasTeen(num1, num2, num3);

        assertThat(actual).isEqualTo(expected);
    }
}
