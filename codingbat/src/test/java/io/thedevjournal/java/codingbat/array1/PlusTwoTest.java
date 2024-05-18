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
        final int[] arrayA = { 1, 2 };
        final int[] arrayB = { 3, 4 };

        final int[] expected = { 1, 2, 3, 4 };

        final int[] actual = fixture.plusTwo(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] arrayA = { 4, 4 };
        final int[] arrayB = { 2, 2 };

        final int[] expected = { 4, 4, 2, 2 };

        final int[] actual = fixture.plusTwo(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] arrayA = { 9, 2 };
        final int[] arrayB = { 3, 4 };

        final int[] expected = { 9, 2, 3, 4 };

        final int[] actual = fixture.plusTwo(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }
}
