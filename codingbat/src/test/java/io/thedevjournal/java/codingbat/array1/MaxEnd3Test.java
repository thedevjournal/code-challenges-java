package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaxEnd3Test {

    private MaxEnd3 fixture;

    @BeforeEach
    void setUp() {
        fixture = new MaxEnd3();
    }

    @Test
    void testcase1() {
        final int[] nums = { 1, 2, 3 };

        final int[] expected = { 3, 3, 3 };

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 11, 5, 9 };

        final int[] expected = { 11, 11, 11 };

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 2, 11, 3 };

        final int[] expected = { 3, 3, 3 };

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumIsNull() {
        final int[] nums = null;

        final int[] expected = {};

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumIsEmpty() {
        final int[] nums = {};

        final int[] expected = {};

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumIsSingleElement() {
        final int[] nums = { 1 };

        final int[] expected = { 1 };

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
