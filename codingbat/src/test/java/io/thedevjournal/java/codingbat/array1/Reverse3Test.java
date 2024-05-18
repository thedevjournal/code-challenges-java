package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Reverse3Test {

    private Reverse3 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Reverse3();
    }

    @Test
    void testcase1() {
        final int[] nums = { 1, 2, 3 };

        final int[] expected = { 3, 2, 1 };

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 5, 11, 9 };

        final int[] expected = { 9, 11, 5 };

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 7, 0, 0 };

        final int[] expected = { 0, 0, 7 };

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumIsNull() {
        final int[] nums = null;

        final int[] expected = {};

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumIsEmpty() {
        final int[] nums = { };

        final int[] expected = { };

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
