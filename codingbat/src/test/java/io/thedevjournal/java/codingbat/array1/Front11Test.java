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
        final int[] a = new int[] { 1, 2, 3 };
        final int[] b = new int[] { 7, 9, 8 };

        final int[] expected = new int[] { 1, 7 };

        final int[] actual = fixture.front11(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] a = new int[] { 1 };
        final int[] b = new int[] { 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.front11(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] a = new int[] { 1, 7 };
        final int[] b = new int[] {};

        final int[] expected = new int[] { 1 };

        final int[] actual = fixture.front11(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenBothAreNull() {
        final int[] a = null;
        final int[] b = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.front11(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenBothAreEmpty() {
        final int[] a = new int[] {};
        final int[] b = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.front11(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFromBWhenAIsEmptyAndBIsNonEmpty() {
        final int[] a = new int[] {};
        final int[] b = new int[] { 1 };

        final int[] expected = new int[] { 1 };

        final int[] actual = fixture.front11(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
