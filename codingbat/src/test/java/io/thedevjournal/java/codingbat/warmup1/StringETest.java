package io.thedevjournal.java.codingbat.warmup1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringETest {

    private StringE fixture;

    @BeforeEach
    void setUp() {
        fixture = new StringE();
    }

    @Test
    void shouldReturnFalse_WhenStringIsEmpty() {

        final String str = EMPTY_STRING;

        final boolean expected = false;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenStringIsNotEmptyAndHasZeroE() {

        final String str = "a";

        final boolean expected = false;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenStringIsNotEmptyAndHasOneE() {

        final String str = "ae";

        final boolean expected = true;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenStringIsNotEmptyAndHasTwoE() {

        final String str = "aee";

        final boolean expected = true;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenStringIsNotEmptyAndHasThreeE() {

        final String str = "aebece";

        final boolean expected = true;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenStringIsNotEmptyAndHasFourE() {

        final String str = "aebecede";

        final boolean expected = false;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }
}
