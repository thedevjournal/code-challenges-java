package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DelDelTest {

    static final String SMALL_A = "a";

    private DelDel fixture;

    @BeforeEach
    void setUp() {
        fixture = new DelDel();
    }

    @Test
    void shouldReturnSameString_WhenStringLengthIsLessThan4() {

        final String str = SMALL_A;

        final String expected = str;

        final String actual = fixture.delDel(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenStringLengthIsGreatherThanEqualTo4AndDoesntContainDel() {

        final String str = "abcd";

        final String expected = str;

        final String actual = fixture.delDel(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnUpdatedString_WhenStringLengthIsGreatherThanEqualTo4AndContainDel() {

        final String str = "adel";

        final String expected = SMALL_A;

        final String actual = fixture.delDel(str);

        assertThat(actual).isEqualTo(expected);
    }
}
