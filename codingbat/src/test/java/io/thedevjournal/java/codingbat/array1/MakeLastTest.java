package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MakeLastTest {

    private MakeLast fixture;

    @BeforeEach
    void setUp() {
        fixture = new MakeLast();
    }

    @Test
    void testcase1() {
        final int[] nums = new int[] { 4, 5, 6 };

        final int[] expected = new int[] { 0, 0, 0, 0, 0, 6 };

        final int[] actual = fixture.makeLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = new int[] { 1, 2 };

        final int[] expected = new int[] { 0, 0, 0, 2 };

        final int[] actual = fixture.makeLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = new int[] { 3 };

        final int[] expected = new int[] { 0, 3 };

        final int[] actual = fixture.makeLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeLast(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
