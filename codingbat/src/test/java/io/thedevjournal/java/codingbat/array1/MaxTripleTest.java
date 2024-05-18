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
        final int[] nums = { 1, 2, 3 };

        final int expected = 3;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 1, 5, 3 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 5, 2, 3 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldThrowException_WhenNull() {
        final int[] nums = null;

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.maxTriple(nums));
    }

    @Test
    void shouldThrowException_WhenEmpty() {
        final int[] nums = {};

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.maxTriple(nums));
    }

    @Test
    void shouldThrowException_WhenEvenLength() {
        final int[] nums = { 5, 2 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.maxTriple(nums));
    }

    @Test
    void shouldReturnSame_WhenSingleElement() {
        final int[] nums = { 5 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
