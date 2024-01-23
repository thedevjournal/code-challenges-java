package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringSplosionTest {

    private StringSplosion fixture;

    @BeforeEach
    void setUp() {
        fixture = new StringSplosion();
    }

    @Test
    void scenario1() {

        final String str = "Code";

        final String expected = "CCoCodCode";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scenario2() {

        final String str = "abc";

        final String expected = "aababc";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void scenario3() {

        final String str = "ab";

        final String expected = "aab";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenStringIsNull() {

        final String str = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenStringIsEmpty() {

        final String str = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }
}
