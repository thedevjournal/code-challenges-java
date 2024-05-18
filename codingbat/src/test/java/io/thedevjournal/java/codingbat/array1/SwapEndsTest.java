package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwapEndsTest {

    private SwapEnds fixture;

    @BeforeEach
    void setUp() {
        fixture = new SwapEnds();
    }

    @Test
    void testcase1() {
        final int[] nums = { 1, 2, 3, 4 };

        final int[] expected = { 4, 2, 3, 1 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 1, 2, 3 };

        final int[] expected = { 3, 2, 1 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 8, 6, 7, 9, 5 };

        final int[] expected = { 5, 6, 7, 9, 8 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumsIsNullOrEmpty() {
        final int[] nums1 = null;
        final int[] nums2 = {};

        final int[] expected = {};

        final int[] actual1 = fixture.swapEnds(nums1);
        final int[] actual2 = fixture.swapEnds(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnSame_WhenNumsIsSingleElement() {
        final int[] nums = { 1 };

        final int[] expected = { 1 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEndsSwapped_WhenNumsIsMultiElement() {
        final int[] nums = { 1, 2 };

        final int[] expected = { 2, 1 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
