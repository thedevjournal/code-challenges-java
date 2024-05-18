package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstLast6Test {

    private FirstLast6 fixture;

    @BeforeEach
    void setUp() {
        fixture = new FirstLast6();
    }

    @Test
    void testcase1() {
        final int[] nums = { 1, 2, 6 };

        final boolean expected = true;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 6, 1, 2, 3 };

        final boolean expected = true;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 13, 6, 1, 2, 3 };

        final boolean expected = false;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumIsNull() {
        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumIsEmpty() {
        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumHasSingleElement6() {
        final int[] nums = { 6 };

        final boolean expected = true;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNumHasSingleElementNon6() {
        final int[] nums = { 1 };

        final boolean expected = false;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
