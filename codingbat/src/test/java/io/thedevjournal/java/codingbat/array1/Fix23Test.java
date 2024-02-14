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
        final int[] nums = { 1, 2, 3 };

        final int[] expected = { 1, 2, 0 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 2, 3, 5 };

        final int[] expected = { 2, 0, 5 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 1, 2, 1 };

        final int[] expected = { 1, 2, 1 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = {};

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumsIsEmpty() {
        final int[] nums = {};

        final int[] expected = {};

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSame_WhenNumsIsSingleElement() {
        final int[] nums = { 2 };

        final int[] expected = { 2 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValid_WhenNumsIsDoubleElementAnd2and3() {
        final int[] nums = { 2, 3 };

        final int[] expected = { 2, 0 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValid_WhenNumsIsDoubleElementAndNot2and3() {
        final int[] nums = { 3, 2 };

        final int[] expected = { 3, 2 };

        final int[] actual = fixture.fix23(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
