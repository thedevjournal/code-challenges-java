package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FORTY;
import static io.thedevjournal.java.common.NumberConstants.SIXTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CigarPartyTest {

    private CigarParty fixture;

    @BeforeEach
    void setUp() {
        fixture = new CigarParty();
    }

    @Test
    void shouldReturnFalse_WhenWeekendAndCigarsLessThan40() {

        final boolean isWeekend = true;
        final int cigars = FORTY - 1;

        final boolean expected = false;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenWeekendAndCigarsGreaterThanOrEqualTo40() {

        final boolean isWeekend = true;
        final int cigars1 = FORTY;
        final int cigars2 = SIXTY + 1;

        final boolean expected = true;

        final boolean actual1 = fixture.cigarParty(cigars1, isWeekend);
        final boolean actual2 = fixture.cigarParty(cigars2, isWeekend);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNotAWeekendAndCigarsLessThan40() {

        final boolean isWeekend = false;
        final int cigars = FORTY - 1;

        final boolean expected = false;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNotAWeekendAndCigarsEqualTo40() {

        final boolean isWeekend = false;
        final int cigars = FORTY;

        final boolean expected = true;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNotAWeekendAndCigarsEqualTo60() {

        final boolean isWeekend = false;
        final int cigars = SIXTY;

        final boolean expected = true;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenNotAWeekendAndCigarsGreaterThan40AndLessThan60() {

        final boolean isWeekend = false;
        final int cigars = SIXTY - 1;

        final boolean expected = true;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNotAWeekendAndCigarsGreaterThan60() {

        final boolean isWeekend = false;
        final int cigars = SIXTY + 1;

        final boolean expected = false;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }
}
