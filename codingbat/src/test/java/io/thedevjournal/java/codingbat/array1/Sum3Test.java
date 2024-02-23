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
        int[] nums = new int[] { 1, 2, 3 };

        int expected = 6;

        int actual = fixture.sum3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        int[] nums = new int[] { 5, 11, 2 };

        int expected = 18;

        int actual = fixture.sum3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        int[] nums = new int[] { 7, 0, 0 };

        int expected = 7;

        int actual = fixture.sum3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZeroWhenNumIsNullOrEmpty() {
        int[] nums1 = null;
        int[] nums2 = new int[] {};

        int expected = 0;

        int actual1 = fixture.sum3(nums1);
        int actual2 = fixture.sum3(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnSumWhenNumLengthIsLessThanEqualTo3() {
        int[] nums1 = new int[] { 1 };
        int[] nums2 = new int[] { 1, 0 };
        int[] nums3 = new int[] { 1, 0, 0 };

        int expected = 1;

        int actual1 = fixture.sum3(nums1);
        int actual2 = fixture.sum3(nums2);
        int actual3 = fixture.sum3(nums3);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
        assertThat(actual3).isEqualTo(expected);
    }

    @Test
    void shouldReturnSumWhenNumLengthIsGreaterThan3() {
        int[] nums = new int[] { 1, 0, 0, 2 };

        int expected = 1;
        int actual = fixture.sum3(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
