package io.thedevjournal.java.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MakePiTest {

    private MakePi fixture;

    @BeforeEach
    void setUp() {
        fixture = new MakePi();
    }

    @Test
    void testcase1() {
        final int[] expected = { 3, 1, 4 };

        final int[] actual = fixture.makePi();

        assertThat(actual).isEqualTo(expected);
    }
}
