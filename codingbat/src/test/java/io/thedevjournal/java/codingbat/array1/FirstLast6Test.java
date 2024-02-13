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
        int[] nums = new int[] { 1, 2, 6 };

        boolean expected = true;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        int[] nums = new int[] { 6, 1, 2, 3 };

        boolean expected = true;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        int[] nums = new int[] { 13, 6, 1, 2, 3 };

        boolean expected = false;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumIsNull() {
        int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumIsEmpty() {
        int[] nums = null;

        boolean expected = false;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueWhenNumHasSingleElement6() {
        int[] nums = new int[] { 6 };

        boolean expected = true;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseWhenNumHasSingleElementNon6() {
        int[] nums = new int[] { 1 };

        boolean expected = false;

        boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
