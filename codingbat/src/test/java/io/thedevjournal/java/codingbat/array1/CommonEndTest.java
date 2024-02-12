package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CommonEndTest {

    private CommonEnd fixture;

    @BeforeEach
    void setUp() {
        fixture = new CommonEnd();
    }

    @Test
    void testcase1() {
        final int[] nums1 = { 1, 2, 3 };
        final int[] nums2 = { 7, 3 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums1 = { 1, 2, 3 };
        final int[] nums2 = { 7, 3, 2 };

        final boolean expected = false;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums1 = { 1, 2, 3 };
        final int[] nums2 = { 1, 3 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenBothNull() {
        final int[] nums1 = null;
        final int[] nums2 = null;

        final boolean expected = false;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenBothAreEmpty() {
        final int[] nums1 = {};
        final int[] nums2 = {};

        final boolean expected = false;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenOneIsNullAndOtherIsEmpty() {
        final int[] numsA1 = null;
        final int[] numsB1 = {};

        final int[] numsA2 = {};
        final int[] numsB2 = null;

        final boolean expected1 = false;
        final boolean expected2 = false;

        final boolean actual1 = fixture.commonEnd(numsA1, numsB1);
        final boolean actual2 = fixture.commonEnd(numsA2, numsB2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    void shouldReturnTrue_WhenBothAreSingleElementAndSameValue() {
        final int[] nums1 = { 1 };
        final int[] nums2 = { 1 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenBothAreSingleElementAndNotSameValue() {
        final int[] nums1 = { 1 };
        final int[] nums2 = { 2 };

        final boolean expected = false;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenEndsAreSameValue() {
        final int[] nums1 = { 1, 1 };
        final int[] nums2 = { 2, 1 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenFirstAreSameValue() {
        final int[] nums1 = { 1, 2 };
        final int[] nums2 = { 1, 1 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstAndLastAreSame() {
        final int[] numsA1 = { 1, 2 };
        final int[] numsB1 = { 3, 1 };

        final int[] numsA2 = { 2, 1 };
        final int[] numsB2 = { 1, 3 };

        final boolean expected1 = false;
        final boolean expected2 = false;

        final boolean actual1 = fixture.commonEnd(numsA1, numsB1);
        final boolean actual2 = fixture.commonEnd(numsA2, numsB2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    void shouldReturnFalse_WhenOneIsEmptyAndOtherIsNot() {
        final int[] numsA1 = {};
        final int[] numsB1 = { 3, 1 };

        final int[] numsA2 = { 2, 1 };
        final int[] numsB2 = {};

        final boolean expected1 = false;
        final boolean expected2 = false;

        final boolean actual1 = fixture.commonEnd(numsA1, numsB1);
        final boolean actual2 = fixture.commonEnd(numsA2, numsB2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
