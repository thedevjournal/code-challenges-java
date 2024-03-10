package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoAsOneTest {

    private TwoAsOne fixture;

    @BeforeEach
    void setUp() {
        fixture = new TwoAsOne();
    }

    @Test
    void testcase1() {

        final int number1 = ONE;
        final int number2 = TWO;
        final int number3 = THREE;

        final boolean expected = true;

        final boolean actual = fixture.twoAsOne(number1, number2, number3);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final int number1 = TWO;
        final int number2 = TWO;
        final int number3 = THREE;

        final boolean expected = false;

        final boolean actual = fixture.twoAsOne(number1, number2, number3);

        assertThat(actual).isEqualTo(expected);
    }
}
