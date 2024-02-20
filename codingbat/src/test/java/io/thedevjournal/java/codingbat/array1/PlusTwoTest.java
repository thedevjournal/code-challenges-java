package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlusTwoTest {

    private PlusTwo fixture;

    @BeforeEach
    void setUp() {
        fixture = new PlusTwo();
    }

    @Test
    void testcase1() {
        final int[] a = { 1, 2 };
        final int[] b = { 3, 4 };

        final int[] expected = { 1, 2, 3, 4 };

        final int[] actual = fixture.plusTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] a = { 4, 4 };
        final int[] b = { 2, 2 };

        final int[] expected = { 4, 4, 2, 2 };

        final int[] actual = fixture.plusTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] a = { 9, 2 };
        final int[] b = { 3, 4 };

        final int[] expected = { 9, 2, 3, 4 };

        final int[] actual = fixture.plusTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
