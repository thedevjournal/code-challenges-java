package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComboStringTest {

    private ComboString fixture;

    @BeforeEach
    void setUp() {
        fixture = new ComboString();
    }

    @Test
    void testcase1() {

        final String strA = "Hello";
        final String strB = "hi";

        final String expected = "hiHellohi";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String strA = "hi";
        final String strB = "Hello";

        final String expected = "hiHellohi";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String strA = "aaa";
        final String strB = "b";

        final String expected = "baaab";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenBothAreNull() {

        final String strA = null;
        final String strB = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenBothAreEmpty() {

        final String strA = EMPTY_STRING;
        final String strB = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenBothOneIsEmptyAndOtherIsNull() {

        final String strA1 = EMPTY_STRING;
        final String strA2 = null;
        final String strB1 = null;
        final String strB2 = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual1 = fixture.comboString(strA1, strB1);
        final String actual2 = fixture.comboString(strA2, strB2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void testcase4() {

        final String strA = "a";
        final String strB = "b";

        final String expected = "aba";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }
}
