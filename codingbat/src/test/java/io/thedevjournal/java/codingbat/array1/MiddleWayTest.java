package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiddleWayTest {

    private MiddleWay fixture;

    @BeforeEach
    void setUp() {
        fixture = new MiddleWay();
    }

    @Test
    void testcase1() {
        final int[] arrayA = { 1, 2, 3 };
        final int[] arrayB = { 4, 5, 6 };

        final int[] expected = { 2, 5 };

        final int[] actual = fixture.middleWay(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] arrayA = { 7, 7, 7 };
        final int[] arrayB = { 3, 8, 0 };

        final int[] expected = { 7, 8 };

        final int[] actual = fixture.middleWay(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] arrayA = { 5, 2, 9 };
        final int[] arrayB = { 1, 4, 5 };

        final int[] expected = { 2, 4 };

        final int[] actual = fixture.middleWay(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreNull() {
        final int[] arrayA = null;
        final int[] arrayB = null;

        final int[] expected = {};

        final int[] actual = fixture.middleWay(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenBothAreEmpty() {
        final int[] arrayA = {};
        final int[] arrayB = {};

        final int[] expected = {};

        final int[] actual = fixture.middleWay(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenOneIsEmptyAndOtherIsNull() {
        final int[] arrayA1 = null;
        final int[] arrayB1 = {};

        final int[] arrayA2 = {};
        final int[] arrayB2 = null;

        final int[] expected = {};

        final int[] actual1 = fixture.middleWay(arrayA1, arrayB1);
        final int[] actual2 = fixture.middleWay(arrayA2, arrayB2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldThrowException_WhenBothAreInvalidLengths1() {
        final int[] arrayA = { 2, 4 };
        final int[] arrayB = { 1, 2, 3, 4 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(arrayA, arrayB));
    }

    @Test
    void shouldThrowException_WhenBothAreInvalidLengths2() {
        final int[] arrayA = { 1, 2, 3, 4 };
        final int[] arrayB = { 2, 4 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(arrayA, arrayB));
    }

    @Test
    void shouldThrowException_WhenOneIsValidAndOtherIsInvalidLength1() {
        final int[] arrayA = { 1 };
        final int[] arrayB = { 2, 4 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(arrayA, arrayB));
    }

    @Test
    void shouldThrowException_WhenOneIsValidAndOtherIsInvalidLength2() {
        final int[] arrayA = { 2, 4 };
        final int[] arrayB = { 1 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(arrayA, arrayB));
    }

    @Test
    void shouldReturnValidArray_WhenBothAreValidAndSingleLength() {
        final int[] arrayA = { 1 };
        final int[] arrayB = { 2 };

        final int[] expected = { 1, 2 };

        final int[] actual = fixture.middleWay(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValidArray_WhenBothAreValidAndMultipleLength() {
        final int[] arrayA = { 1, 2, 3 };
        final int[] arrayB = { 1, 2, 3, 4, 5 };

        final int[] expected = { 2, 3 };

        final int[] actual = fixture.middleWay(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValidArray_WhenOneIsEmptyAndOtherIsValidLength() {
        final int[] arrayA1 = { 1 };
        final int[] arrayB1 = {};

        final int[] arrayA2 = {};
        final int[] arrayB2 = { 1, 2, 3 };

        final int[] expected1 = { 1 };
        final int[] expected2 = { 2 };

        final int[] actual1 = fixture.middleWay(arrayA1, arrayB1);
        final int[] actual2 = fixture.middleWay(arrayA2, arrayB2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
