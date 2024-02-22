package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Start1Test {

    private Start1 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Start1();
    }

    @Test
    void testcase1() {
        final int[] a = { 1, 2, 3 };
        final int[] b = { 1, 3 };

        final int expected = 2;

        final int actual = fixture.start1(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {
        final int[] a = { 7, 2, 3 };
        final int[] b = { 1 };

        final int expected = 1;

        final int actual = fixture.start1(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {
        final int[] a = { 1, 2 };
        final int[] b = {};

        final int expected = 1;

        final int actual = fixture.start1(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase4() {
        final int[] a = {};
        final int[] b = { 3 };

        final int expected = 0;

        final int actual = fixture.start1(a, b);

        assertThat(actual).isEqualTo(expected);
    }

}
