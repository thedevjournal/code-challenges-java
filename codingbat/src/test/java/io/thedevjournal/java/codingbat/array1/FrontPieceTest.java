package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrontPieceTest {

    private FrontPiece fixture;

    @BeforeEach
    void setUp() {
        fixture = new FrontPiece();
    }

    @Test
    void testcase1() {
        final int[] nums = { 1, 2, 3 };

        final int[] expected = { 1, 2 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = { 1, 2 };

        final int[] expected = { 1, 2 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = { 1 };

        final int[] expected = { 1 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = {};

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenNumsIsEmpty() {
        final int[] nums = {};

        final int[] expected = {};

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
