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
        int[] nums = new int[] { 1, 2, 3 };

        int expected = 3;

        int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        int[] nums = new int[] { 1, 1 };

        int expected = 2;

        int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        int[] nums = new int[] { 1, 1, 1, 1 };

        int expected = 2;

        int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZeroWhenNumIsNull() {
        int[] nums = null;

        int expected = 0;

        int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZeroWhenNumIsEmpty() {
        int[] nums = new int[] {};

        int expected = 0;

        int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSumWhenNumIsSingleElement() {
        int[] nums = new int[] { 1 };

        int expected = 1;

        int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSumWhenNumIsMultipleElement() {
        int[] nums = new int[] { 1, 2 };

        int expected = 3;

        int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
