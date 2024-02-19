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
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[] { 4, 5, 6 };

        int[] expected = new int[] { 2, 5 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        int[] a = new int[] { 7, 7, 7 };
        int[] b = new int[] { 3, 8, 0 };

        int[] expected = new int[] { 7, 8 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        int[] a = new int[] { 5, 2, 9 };
        int[] b = new int[] { 1, 4, 5 };

        int[] expected = new int[] { 2, 4 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenBothAreNull() {
        int[] a = null;
        int[] b = null;

        int[] expected = new int[] {};

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenBothAreEmpty() {
        int[] a = new int[] {};
        int[] b = new int[] {};

        int[] expected = new int[] {};

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenOneIsEmptyAndOtherIsNull() {
        int[] a1 = null;
        int[] b1 = new int[] {};

        int[] a2 = new int[] {};
        int[] b2 = null;

        int[] expected = new int[] {};

        int[] actual1 = fixture.middleWay(a1, b1);
        int[] actual2 = fixture.middleWay(a2, b2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldThrowExceptionWhenBothAreInvalidLengths1() {
        int[] a = new int[] { 2, 4 };
        int[] b = new int[] { 1, 2, 3, 4 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(a, b));
    }

    @Test
    void shouldThrowExceptionWhenBothAreInvalidLengths2() {
        int[] a = new int[] { 1, 2, 3, 4 };
        int[] b = new int[] { 2, 4 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(a, b));
    }

    @Test
    void shouldThrowExceptionWhenOneIsValidAndOtherIsInvalidLength1() {
        int[] a = new int[] { 1 };
        int[] b = new int[] { 2, 4 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(a, b));
    }

    @Test
    void shouldThrowExceptionWhenOneIsValidAndOtherIsInvalidLength2() {
        int[] a = new int[] { 2, 4 };
        int[] b = new int[] { 1 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(a, b));
    }

    @Test
    void shouldReturnValidArrayWhenBothAreValidAndSingleLength() {
        int[] a = new int[] { 1 };
        int[] b = new int[] { 2 };

        int[] expected = new int[] { 1, 2 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValidArrayWhenBothAreValidAndMultipleLength() {
        int[] a = new int[] { 1, 2, 3 };
        int[] b = new int[] { 1, 2, 3, 4, 5 };

        int[] expected = new int[] { 2, 3 };

        int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValidArrayWhenOneIsEmptyAndOtherIsValidLength() {
        int[] a1 = new int[] { 1 };
        int[] b1 = new int[] {};

        int[] a2 = new int[] {};
        int[] b2 = new int[] { 1, 2, 3 };

        int[] expected1 = new int[] { 1 };
        int[] expected2 = new int[] { 2 };

        int[] actual1 = fixture.middleWay(a1, b1);
        int[] actual2 = fixture.middleWay(a2, b2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
