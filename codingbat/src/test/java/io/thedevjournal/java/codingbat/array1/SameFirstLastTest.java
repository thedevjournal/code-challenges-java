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
        final int[] nums = { 1, 2, 3 };

        final boolean expected = false;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 1, 2, 3, 1 };

        final boolean expected = true;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 1, 2, 1 };

        final boolean expected = true;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumsIsNull() {
        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumsIsEmpty() {
        final int[] nums = {};

        final boolean expected = false;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumsIsSingleElement() {
        final int[] nums = { 1 };

        final boolean expected = true;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
