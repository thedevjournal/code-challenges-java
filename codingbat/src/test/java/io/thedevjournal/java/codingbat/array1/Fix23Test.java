package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Fix23Test {

    private Fix23 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Fix23();
    }

    @Test
    void testcase1() {
        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 1, 2, 0 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = new int[] { 2, 3, 5 };

        final int[] expected = new int[] { 2, 0, 5 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = new int[] { 1, 2, 1 };

        final int[] expected = new int[] { 1, 2, 1 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameWhenNumsIsSingleElement() {
        final int[] nums = new int[] { 2 };

        final int[] expected = new int[] { 2 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValidWhenNumsIsDoubleElementAnd2and3() {
        final int[] nums = new int[] { 2, 3 };

        final int[] expected = new int[] { 2, 0 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValidWhenNumsIsDoubleElementAndNot2and3() {
        final int[] nums = new int[] { 3, 2 };

        final int[] expected = new int[] { 3, 2 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
