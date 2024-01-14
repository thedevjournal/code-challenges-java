package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumDoubleTest {

    private SumDouble fixture;

    @BeforeEach
    void setUp() {
        fixture = new SumDouble();
    }

    @Test
    void shouldReturnSum_WhenFirstIsGreatherThanSecond() {

        final int first = 1;
        final int second = 2;

        final int expected = 3;

        final int actual = fixture.sumDouble(first, second);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSum_WhenSecondIsGreatherThanFirst() {

        final int first = 3;
        final int second = 2;

        final int expected = 5;

        final int actual = fixture.sumDouble(first, second);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnDouble_WhenBothNumbersAreSame() {

        final int first = 2;
        final int second = 2;

        final int expected = 8;

        final int actual = fixture.sumDouble(first, second);

        assertThat(actual).isEqualTo(expected);
    }
}
