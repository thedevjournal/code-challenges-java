package io.thedevjournal.java.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NoTriplesTest {

    private NoTriples fixture;

    @BeforeEach
    void setUp() {
        fixture = new NoTriples();
    }

    @Test
    void testcase1() {

        final int[] nums = { 1, 1, 2, 2, 1 };

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final int[] nums = { 1, 1, 2, 2, 2, 1 };

        final boolean expected = false;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final int[] nums = { 1, 1, 1, 2, 2, 2, 1 };

        final boolean expected = false;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumIsNull() {

        final int[] nums = null;

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumIsEmpty() {

        final int[] nums = {};

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumsHasLessThan3Elements() {

        final int[] nums = { 1, 1 };

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNumsHas3Elements() {

        final int[] nums = { 1, 1, 1 };

        final boolean expected = false;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
