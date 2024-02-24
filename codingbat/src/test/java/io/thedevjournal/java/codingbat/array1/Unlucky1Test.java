package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Unlucky1Test {

    private Unlucky1 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Unlucky1();
    }

    @Test
    void testcase1() {
        final int[] nums = { 1, 3, 4, 5 };

        final boolean expected = true;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 2, 1, 3, 4, 5 };

        final boolean expected = true;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 1, 1, 1 };

        final boolean expected = false;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumsIsNull() {
        final int[] nums = null;

        final boolean expected = false;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumsIsEmpty() {
        final int[] nums = {};

        final boolean expected = false;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumsLengthIsOne() {
        final int[] nums = { 1 };

        final boolean expected = false;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumsLengthIsGreaterThan2AndUnluck1AtLastPosition() {

        final int[] nums = { 1, 2, 3, 1, 3 };

        final boolean expected = true;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
