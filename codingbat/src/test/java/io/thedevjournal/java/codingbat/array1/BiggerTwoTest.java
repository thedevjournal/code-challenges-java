package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BiggerTwoTest {

    private BiggerTwo fixture;

    @BeforeEach
    void setUp() {
        fixture = new BiggerTwo();
    }

    @Test
    void testcase1() {
        final int[] arrayA = { 1, 2 };
        final int[] arrayB = { 3, 4 };

        final int[] expected = { 3, 4 };

        final int[] actual = fixture.biggerTwo(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] arrayA = { 3, 4 };
        final int[] arrayB = { 1, 2 };

        final int[] expected = { 3, 4 };

        final int[] actual = fixture.biggerTwo(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] arrayA = { 1, 1 };
        final int[] arrayB = { 1, 2 };

        final int[] expected = { 1, 2 };

        final int[] actual = fixture.biggerTwo(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreNull() {
        final int[] arrayA = null;
        final int[] arrayB = null;

        final int[] expected = {};

        final int[] actual = fixture.biggerTwo(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreEmpty() {
        final int[] arrayA = {};
        final int[] arrayB = {};

        final int[] expected = {};

        final int[] actual = fixture.biggerTwo(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenOneIsNullAndOtherIsEmpty() {
        final int[] arrayA1 = null;
        final int[] arrayB1 = {};

        final int[] arrayA2 = {};
        final int[] arrayB2 = null;

        final int[] expected = {};

        final int[] actual1 = fixture.biggerTwo(arrayA1, arrayB1);
        final int[] actual2 = fixture.biggerTwo(arrayA2, arrayB2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnNonEmpty_WhenOneIsEmptyAndOtherIsNotEmpty() {
        final int[] arrayA1 = { 1 };
        final int[] arrayB1 = {};

        final int[] arrayA2 = {};
        final int[] arrayB2 = { 1 };

        final int[] expected = { 1 };

        final int[] actual1 = fixture.biggerTwo(arrayA1, arrayB1);
        final int[] actual2 = fixture.biggerTwo(arrayA2, arrayB2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnA_WhenSumIsSame() {
        final int[] arrayA = { 1, 1 };
        final int[] arrayB = { 2, 0 };

        final int[] expected = { 1, 1 };

        final int[] actual = fixture.biggerTwo(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }
}
