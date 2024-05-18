package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Make2Test {

    private Make2 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Make2();
    }

    @Test
    void testcase1() {
        final int[] arrayA = { 4, 5 };
        final int[] arrayB = { 1, 2, 3 };

        final int[] expected = { 4, 5 };

        final int[] actual = fixture.make2(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] arrayA = { 4 };
        final int[] arrayB = { 1, 2, 3 };

        final int[] expected = { 4, 1 };

        final int[] actual = fixture.make2(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] arrayA = {};
        final int[] arrayB = { 1, 2 };

        final int[] expected = { 1, 2 };

        final int[] actual = fixture.make2(arrayA, arrayB);

        assertThat(actual).isEqualTo(expected);
    }
}
