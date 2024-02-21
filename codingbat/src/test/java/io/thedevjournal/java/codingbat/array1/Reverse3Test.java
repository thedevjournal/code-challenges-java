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
        int[] nums = new int[] { 1, 2, 3 };

        int[] expected = new int[] { 3, 2, 1 };

        int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        int[] nums = new int[] { 5, 11, 9 };

        int[] expected = new int[] { 9, 11, 5 };

        int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        int[] nums = new int[] { 7, 0, 0 };

        int[] expected = new int[] { 0, 0, 7 };

        int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumIsNull() {
        int[] nums = null;

        int[] expected = new int[] {};

        int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumIsEmpty() {
        int[] nums = new int[] { };

        int[] expected = new int[] { };

        int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
