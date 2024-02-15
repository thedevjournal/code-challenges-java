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
        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] nums = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] nums = new int[] { 1 };

        final int[] expected = new int[] { 1 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumsIsNull() {
        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyWhenNumsIsEmpty() {
        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
