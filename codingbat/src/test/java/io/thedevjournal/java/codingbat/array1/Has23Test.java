package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Has23Test {

    private Has23 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Has23();
    }

    @Test
    void testcase1() {
        final int[] nums = { 2, 5 };

        final boolean expected = true;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 4, 3 };

        final boolean expected = true;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 4, 5 };

        final boolean expected = false;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumIsNull() {
        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumIsEmpty() {
        final int[] nums = {};

        final boolean expected = false;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumIsSingleElementAndHas2Or3() {
        final int[] nums1 = { 2 };
        final int[] nums2 = { 3 };

        final boolean expected = true;

        final boolean actual1 = fixture.has23(nums1);
        final boolean actual2 = fixture.has23(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumIsSingleElementAndDoesntHave2Or3() {
        final int[] nums = { 4 };

        final boolean expected = false;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
