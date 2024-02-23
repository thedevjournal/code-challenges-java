package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Sum3Test {

    private Sum3 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Sum3();
    }

    @Test
    void testcase1() {
        final int[] nums = { 1, 2, 3 };

        final int expected = 6;

        final int actual = fixture.sum3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 5, 11, 2 };

        final int expected = 18;

        final int actual = fixture.sum3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 7, 0, 0 };

        final int expected = 7;

        final int actual = fixture.sum3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZero_WhenNumIsNullOrEmpty() {
        final int[] nums1 = null;
        final int[] nums2 = {};

        final int expected = 0;

        final int actual1 = fixture.sum3(nums1);
        final int actual2 = fixture.sum3(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnSum_WhenNumLengthIsLessThanEqualTo3() {
        final int[] nums1 = { 1 };
        final int[] nums2 = { 1, 0 };
        final int[] nums3 = { 1, 0, 0 };

        final int expected = 1;

        final int actual1 = fixture.sum3(nums1);
        final int actual2 = fixture.sum3(nums2);
        final int actual3 = fixture.sum3(nums3);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
        assertThat(actual3).isEqualTo(expected);
    }

    @Test
    void shouldReturnSum_WhenNumLengthIsGreaterThan3() {
        final int[] nums = { 1, 0, 0, 2 };

        final int expected = 1;
        final int actual = fixture.sum3(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
