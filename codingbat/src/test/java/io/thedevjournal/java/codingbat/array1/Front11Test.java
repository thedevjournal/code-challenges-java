package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Front11Test {

    private Front11 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Front11();
    }

    @Test
    void testcase1() {
        final int[] arrayA = { 1, 2, 3 };
        final int[] arrayB = { 7, 9, 8 };

        final int[] expected = { 1, 7 };

        final int[] actual = fixture.front11(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] arrayA = { 1 };
        final int[] arrayB = { 2 };

        final int[] expected = { 1, 2 };

        final int[] actual = fixture.front11(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] arrayA = { 1, 7 };
        final int[] arrayB = {};

        final int[] expected = { 1 };

        final int[] actual = fixture.front11(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreNull() {
        final int[] arrayA = null;
        final int[] arrayB = null;

        final int[] expected = {};

        final int[] actual = fixture.front11(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreEmpty() {
        final int[] arrayA = {};
        final int[] arrayB = {};

        final int[] expected = {};

        final int[] actual = fixture.front11(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFromB_WhenAIsEmptyAndBIsNonEmpty() {
        final int[] arrayA = {};
        final int[] arrayB = { 1 };

        final int[] expected = { 1 };

        final int[] actual = fixture.front11(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }
}
