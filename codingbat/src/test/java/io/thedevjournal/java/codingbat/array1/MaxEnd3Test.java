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
        int[] nums = new int[] { 1, 2, 3 };

        int[] expected = new int[] { 3, 3, 3 };

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        int[] nums = new int[] { 11, 5, 9 };

        int[] expected = new int[] { 11, 11, 11 };

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        int[] nums = new int[] { 2, 11, 3 };

        int[] expected = new int[] { 3, 3, 3 };

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumIsNull() {
        int[] nums = null;

        int[] expected = new int[] {};

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumIsEmpty() {
        int[] nums = new int[] {};

        int[] expected = new int[] {};

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumIsSingleElement() {
        int[] nums = new int[] { 1 };

        int[] expected = new int[] { 1 };

        int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
