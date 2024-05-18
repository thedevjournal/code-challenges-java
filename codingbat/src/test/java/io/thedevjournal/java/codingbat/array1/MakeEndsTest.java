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
        final int[] nums = { 1, 2, 3 };

        final int[] expected = { 1, 3 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 1, 2, 3, 4 };

        final int[] expected = { 1, 4 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 7, 4, 6, 2 };

        final int[] expected = { 7, 2 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumIsNull() {
        final int[] nums = null;

        final int[] expected = {};

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumIsEmpty() {
        final int[] nums = {};

        final int[] expected = {};

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValid_WhenNumIsSingleElement() {
        final int[] nums = { 1 };

        final int[] expected = { 1, 1};

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnValid_WhenNumIsDoubleElement() {
        final int[] nums = { 1, 2 };

        final int[] expected = { 1, 2 };

        final int[] actual = fixture.makeEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
