package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxTripleTest {

    private MaxTriple fixture;

    @BeforeEach
    void setUp() {
        fixture = new MaxTriple();
    }

    @Test
    void testcase1() {
        final int[] nums = new int[] { 1, 2, 3 };

        final int expected = 3;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = new int[] { 1, 5, 3 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = new int[] { 5, 2, 3 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldThrowExceptionWhenNull() {
        final int[] nums = null;

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.maxTriple(nums));
    }

    @Test
    void shouldThrowExceptionWhenEmpty() {
        final int[] nums = new int[] {};

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.maxTriple(nums));
    }

    @Test
    void shouldThrowExceptionWhenEvenLength() {
        final int[] nums = new int[] { 5, 2 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.maxTriple(nums));
    }

    @Test
    void shouldReturnSameWhenSingleElement() {
        final int[] nums = new int[] { 5 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
