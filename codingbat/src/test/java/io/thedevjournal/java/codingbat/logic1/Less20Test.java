package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.TWENTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Less20Test {

    private Less20 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Less20();
    }

    @Test
    void shoulReturnFalse_WhenNumberIsAMultipleOf20() {

        final int number = TWENTY;

        final boolean expected = false;

        final boolean actual = fixture.less20(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shoulReturnTrue_WhenNumberIsOneLessThanMultipleOf20() {

        final int number = TWENTY - 1;

        final boolean expected = true;

        final boolean actual = fixture.less20(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shoulReturnTrue_WhenNumberIsTwoLessThanMultipleOf20() {

        final int number = TWENTY - 2;

        final boolean expected = true;

        final boolean actual = fixture.less20(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shoulReturnFalse_WhenNumberIsMoreLessThanMultipleOf20() {

        final int number = TWENTY - 3;

        final boolean expected = false;

        final boolean actual = fixture.less20(number);

        assertThat(actual).isEqualTo(expected);
    }
}
