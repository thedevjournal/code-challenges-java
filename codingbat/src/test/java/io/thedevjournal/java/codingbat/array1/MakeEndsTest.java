package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MakeEndsTest {

    private MakeEnds fixture;

    @BeforeEach
    void setUp() {
        fixture = new MakeEnds();
    }

    @Test
    void testcase1() {
        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 1, 3 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = new int[] { 1, 2, 3, 4 };

        final int[] expected = new int[] { 1, 4 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = new int[] { 7, 4, 6, 2 };

        final int[] expected = new int[] { 7, 2 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumIsNull() {
        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumIsEmpty() {
        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValidWhenNumIsSingleElement() {
        final int[] nums = new int[] { 1 };

        final int[] expected = new int[] { 1 , 1};

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValidWhenNumIsDoubleElement() {
        final int[] nums = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
