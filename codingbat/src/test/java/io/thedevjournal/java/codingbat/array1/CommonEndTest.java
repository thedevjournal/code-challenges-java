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
        int[] nums1 = new int[] { 1, 2, 3 };
        int[] nums2 = new int[] { 7, 3 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        int[] nums1 = new int[] { 1, 2, 3 };
        int[] nums2 = new int[] { 7, 3, 2 };

        boolean expected = false;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        int[] nums1 = new int[] { 1, 2, 3 };
        int[] nums2 = new int[] { 1, 3 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenBothNull() {
        int[] nums1 = null;
        int[] nums2 = null;

        boolean expected = false;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenBothAreEmpty() {
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {};

        boolean expected = false;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenOneIsNullAndOtherIsEmpty() {
        int[] nums1_1 = null;
        int[] nums2_1 = new int[] {};

        int[] nums1_2 = new int[] {};
        int[] nums2_2 = null;

        boolean expected1 = false;
        boolean expected2 = false;

        boolean actual1 = fixture.commonEnd(nums1_1, nums2_1);
        boolean actual2 = fixture.commonEnd(nums1_2, nums2_2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    void shouldReturnTrueWhenBothAreSingleElementAndSameValue() {
        int[] nums1 = new int[] { 1 };
        int[] nums2 = new int[] { 1 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenBothAreSingleElementAndNotSameValue() {
        int[] nums1 = new int[] { 1 };
        int[] nums2 = new int[] { 2 };

        boolean expected = false;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenEndsAreSameValue() {
        int[] nums1 = new int[] { 1, 1 };
        int[] nums2 = new int[] { 2, 1 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenFirstAreSameValue() {
        int[] nums1 = new int[] { 1, 2 };
        int[] nums2 = new int[] { 1, 1 };

        boolean expected = true;

        boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenFirstAndLastAreSame() {
        int[] nums1_1 = new int[] { 1, 2 };
        int[] nums2_1 = new int[] { 3, 1 };

        int[] nums1_2 = new int[] { 2, 1 };
        int[] nums2_2 = new int[] { 1, 3 };

        boolean expected1 = false;
        boolean expected2 = false;

        boolean actual1 = fixture.commonEnd(nums1_1, nums2_1);
        boolean actual2 = fixture.commonEnd(nums1_2, nums2_2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    void shouldReturnFalseWhenOneIsEmptyAndOtherIsNot() {
        int[] nums1_1 = new int[] {};
        int[] nums2_1 = new int[] { 3, 1 };

        int[] nums1_2 = new int[] { 2, 1 };
        int[] nums2_2 = new int[] {};

        boolean expected1 = false;
        boolean expected2 = false;

        boolean actual1 = fixture.commonEnd(nums1_1, nums2_1);
        boolean actual2 = fixture.commonEnd(nums1_2, nums2_2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
