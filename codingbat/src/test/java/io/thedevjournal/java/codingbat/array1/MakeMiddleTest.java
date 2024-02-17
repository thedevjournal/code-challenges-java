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
        final int[] nums = { 1, 2, 3, 4 };

        final int[] expected = { 2, 3 };

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 7, 1, 2, 3, 4, 9 };

        final int[] expected = { 2, 3 };

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 1, 2 };

        final int[] expected = { 1, 2 };

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = {};

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumsIsEmpty() {
        final int[] nums = {};

        final int[] expected = {};

        final int[] actual = fixture.makeMiddle(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldThrowException_WhenNumIsOddLength() {
        final int[] nums = { 1, 2, 3 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.makeMiddle(nums));
    }
}
