package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Double23Test {

    private Double23 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Double23();
    }

    @Test
    void testcase1() {

        final int[] nums = new int[] { 2, 2 };

        final boolean expected = true;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = new int[] { 3, 3 };

        final boolean expected = true;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = new int[] { 2, 3 };

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumsIsNull() {
        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumsIsSingleElementAndNot2Or3() {
        final int[] nums = new int[] { 5 };

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
