package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.SEVEN;
import static io.thedevjournal.java.common.NumberConstants.SIX;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WithoutDoublesTest {

    private WithoutDoubles fixture;

    @BeforeEach
    void setUp() {
        fixture = new WithoutDoubles();
    }

    @Test
    void shouldReturnSum_WhenDie1AndDie2AreDifferentAndNoDoublesIsFalse() {

        final int die1 = ONE;
        final int die2 = TWO;
        final boolean noDoubles = false;

        final int expected = THREE;

        final int actual = fixture.withoutDoubles(die1, die2, noDoubles);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSum_WhenDie1AndDie2AreSameAndNoDoublesIsFalse() {

        final int die1 = ONE;
        final int die2 = ONE;
        final boolean noDoubles = false;

        final int expected = TWO;

        final int actual = fixture.withoutDoubles(die1, die2, noDoubles);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSum_WhenDie1AndDie2AreDifferentAndNoDoublesIsTrue() {

        final int die1 = ONE;
        final int die2 = TWO;
        final boolean noDoubles = true;

        final int expected = THREE;

        final int actual = fixture.withoutDoubles(die1, die2, noDoubles);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSumPlusOne_WhenDie1AndDie2AreSameAndNoDoublesIsTrue() {

        final int die1 = ONE;
        final int die2 = ONE;
        final boolean noDoubles = true;

        final int expected = THREE;

        final int actual = fixture.withoutDoubles(die1, die2, noDoubles);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSumAsSeven_WhenDie1AndDie2AreSixAndNoDoublesIsTrue() {

        final int die1 = SIX;
        final int die2 = SIX;
        final boolean noDoubles = true;

        final int expected = SEVEN;

        final int actual = fixture.withoutDoubles(die1, die2, noDoubles);

        assertThat(actual).isEqualTo(expected);
    }
}
