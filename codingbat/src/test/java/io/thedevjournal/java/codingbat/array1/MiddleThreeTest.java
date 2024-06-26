package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiddleThreeTest {

    private MiddleThree fixture;

    @BeforeEach
    void setUp() {
        fixture = new MiddleThree();
    }

    @Test
    void testcase1() {
        final int[] nums = { 1, 2, 3, 4, 5 };

        final int[] expected = { 2, 3, 4 };

        final int[] actual = fixture.midThree(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 8, 6, 7, 5, 3, 0, 9 };

        final int[] expected = { 7, 5, 3 };

        final int[] actual = fixture.midThree(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 1, 2, 3 };

        final int[] expected = { 1, 2, 3 };

        final int[] actual = fixture.midThree(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumsIsNullOrEmpty() {
        final int[] nums1 = null;
        final int[] nums2 = {};

        final int[] expected = {};

        final int[] actual1 = fixture.midThree(nums1);
        final int[] actual2 = fixture.midThree(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldThrowException_WhenNumsHasEvenElement() {
        final int[] nums = { 1, 2 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.midThree(nums));
    }
}
