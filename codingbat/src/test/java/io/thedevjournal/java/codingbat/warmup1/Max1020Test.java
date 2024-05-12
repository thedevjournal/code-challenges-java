package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Max1020Test {

    private Max1020 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Max1020();
    }

    @Test
    void shouldReturnMaxAs0_WhenAIsLessThan10AndBIsLessThan10() {

        final int value1 = 9;
        final int value2 = 9;

        final int expected = 0;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsLessThan10AndBIsEqualTo10() {

        final int value1 = 9;
        final int value2 = 10;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsLessThan10AndBIsGreaterThan10() {

        final int value1 = 9;
        final int value2 = 19;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsLessThan10AndBIsEqualTo20() {

        final int value1 = 9;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsLessThan10AndBIsGreaterThan20() {

        final int value1 = 9;
        final int value2 = 21;

        final int expected = 0;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsA_WhenAIsEqualTo10AndBIsLessThan10() {

        final int value1 = 10;
        final int value2 = 9;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsEqualTo10AndBIsEqualTo10() {

        final int value1 = 10;
        final int value2 = 10;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsEqualTo10AndBIsGreaterThan10() {

        final int value1 = 10;
        final int value2 = 19;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsEqualTo10AndBIsEqualTo20() {

        final int value1 = 10;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsA_WhenAIsEqualTo10AndBIsGreaterThan20() {

        final int value1 = 10;
        final int value2 = 21;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsA_WhenAIsGreaterThan10AndBIsLessThan10() {

        final int value1 = 19;
        final int value2 = 9;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsA_WhenAIsGreaterThan10AndBIsEqualTo10() {

        final int value1 = 19;
        final int value2 = 10;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsGreaterThan10AndBIsGreaterThan10() {

        final int value1 = 19;
        final int value2 = 19;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsGreaterThan10AndBIsEqualTo20() {

        final int value1 = 19;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsA_WhenAIsGreaterThan10AndBIsGreaterThan20() {

        final int value1 = 19;
        final int value2 = 21;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsA_WhenAIsEqualTo20AndBIsLessThan10() {

        final int value1 = 20;
        final int value2 = 9;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsA_WhenAIsEqualTo20AndBIsEqualTo10() {

        final int value1 = 20;
        final int value2 = 10;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsEqualTo20AndBIsGreaterThan10() {

        final int value1 = 20;
        final int value2 = 19;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsEqualTo20AndBIsEqualTo20() {

        final int value1 = 20;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsA_WhenAIsEqualTo20AndBIsGreaterThan20() {

        final int value1 = 20;
        final int value2 = 21;

        final int expected = value1;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAs0_WhenAIsGreaterThan20AndBIsLessThan10() {

        final int value1 = 21;
        final int value2 = 9;

        final int expected = 0;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsGreaterThan20AndBIsEqualTo10() {

        final int value1 = 21;
        final int value2 = 10;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsGreaterThan20AndBIsGreaterThan10() {

        final int value1 = 21;
        final int value2 = 19;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAsB_WhenAIsGreaterThan20AndBIsEqualTo20() {

        final int value1 = 21;
        final int value2 = 20;

        final int expected = value2;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnMaxAs0_WhenAIsGreaterThan20AndBIsGreaterThan20() {

        final int value1 = 21;
        final int value2 = 21;

        final int expected = 0;

        final int actual = fixture.max1020(value1, value2);

        assertThat(actual).isEqualTo(expected);
    }
}
