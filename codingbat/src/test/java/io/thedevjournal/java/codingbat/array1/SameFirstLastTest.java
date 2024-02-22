package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SameFirstLastTest {

    private SameFirstLast fixture;

    @BeforeEach
    void setUp() {
        fixture = new SameFirstLast();
    }

    @Test
    void testcase1() {
        int[] nums = new int[] { 1, 2, 3 };

        boolean expected = false;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        int[] nums = new int[] { 1, 2, 3, 1 };

        boolean expected = true;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        int[] nums = new int[] { 1, 2, 1 };

        boolean expected = true;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumsIsNull() {
        int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumsIsEmpty() {
        int[] nums = new int[] {};

        boolean expected = false;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNumsIsSingleElement() {
        int[] nums = new int[] { 1 };

        boolean expected = true;

        boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
