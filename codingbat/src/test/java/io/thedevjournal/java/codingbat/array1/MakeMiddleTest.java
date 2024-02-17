package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MakeMiddleTest {

    private MakeMiddle fixture;

    @BeforeEach
    void setUp() {
        fixture = new MakeMiddle();
    }

    @Test
    void testcase1() {
        final int[] nums = new int[] { 1, 2, 3, 4 };

        final int[] expected = new int[] { 2, 3 };

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = new int[] { 7, 1, 2, 3, 4, 9 };

        final int[] expected = new int[] { 2, 3 };

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldThrowExceptionWhenNumIsOddLength() {
        final int[] nums = new int[] { 1, 2, 3 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.makeMiddle(nums));
    }
}
