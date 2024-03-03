package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FOUR;
import static io.thedevjournal.java.common.NumberConstants.SIX;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Love6Test {

    private Love6 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Love6();
    }

    @Test
    void shouldReturnTrue_WhenAIs6() {

        final int num1 = SIX;
        final int num2 = 0;

        final boolean expected = true;
        final boolean actual = fixture.love6(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenBIs6() {

        final int num1 = 0;
        final int num2 = SIX;

        final boolean expected = true;
        final boolean actual = fixture.love6(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueNoValueIs6AndSumIs6() {

        final int num1 = FOUR;
        final int num2 = TWO;

        final boolean expected = true;
        final boolean actual = fixture.love6(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrueNoValueIs6AndSumIsNot6AndDifferenceIs6() {

        final int num1 = TEN;
        final int num2 = FOUR;

        final boolean expected = true;
        final boolean actual = fixture.love6(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalseNoValueIs6AndSumIsNot6AndDifferenceIsNot6() {

        final int num1 = TWO;
        final int num2 = THREE;

        final boolean expected = false;
        final boolean actual = fixture.love6(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
