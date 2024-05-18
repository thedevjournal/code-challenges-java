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
        final int[] nums = { 4, 5 };

        final boolean expected = true;

        final boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 4, 2 };

        final boolean expected = false;

        final boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 3, 5 };

        final boolean expected = false;

        final boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumsIsNull() {
        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumsIsEmpty() {
        final int[] nums = {};

        final boolean expected = false;

        final boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumsIsSingleElementAndDoesntHave2Or3() {
        final int[] nums = { 4 };

        final boolean expected = true;

        final boolean actual = fixture.no23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumsIsSingleElementAndHas2Or3() {

        final int[] nums1 = { 2 };
        final int[] nums2 = { 3 };

        final boolean expected = false;

        final boolean actual1 = fixture.no23(nums1);
        final boolean actual2 = fixture.no23(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
