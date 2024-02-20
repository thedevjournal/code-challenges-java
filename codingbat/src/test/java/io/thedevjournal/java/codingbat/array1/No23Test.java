package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class No23Test {

    private No23 fixture;

    @BeforeEach
    void setUp() {
        fixture = new No23();
    }

    @Test
    void testcase1() {
        final int[] nums = new int[] { 4, 5 };

        boolean expected = true;

        boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = new int[] { 4, 2 };

        boolean expected = false;

        boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = new int[] { 3, 5 };

        boolean expected = false;

        boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumsIsNull() {
        final int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        boolean expected = false;

        boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNumsIsSingleElementAndDoesntHave2Or3() {
        final int[] nums = new int[] { 4 };

        boolean expected = true;

        boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumsIsSingleElementAndHas2Or3() {

        final int[] nums1 = new int[] { 2 };
        final int[] nums2 = new int[] { 3 };

        boolean expected = false;

        boolean actual1 = fixture.no23(nums1);
        boolean actual2 = fixture.no23(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
