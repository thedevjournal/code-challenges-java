package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Sum2Test {

    private Sum2 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Sum2();
    }

    @Test
    void testcase1() {
        final int[] nums = { 1, 2, 3 };

        final int expected = 3;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 1, 1 };

        final int expected = 2;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 1, 1, 1, 1 };

        final int expected = 2;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZero_WhenNumIsNull() {
        final int[] nums = null;

        final int expected = 0;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZero_WhenNumIsEmpty() {
        final int[] nums = {};

        final int expected = 0;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSum_WhenNumIsSingleElement() {
        final int[] nums = { 1 };

        final int expected = 1;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSum_WhenNumIsMultipleElement() {
        final int[] nums = { 1, 2 };

        final int expected = 3;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
