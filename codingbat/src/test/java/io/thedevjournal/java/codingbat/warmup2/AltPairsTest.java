package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AltPairsTest {

    private AltPairs fixture;

    @BeforeEach
    void setUp() {
        fixture = new AltPairs();
    }

    @Test
    void testcase1() {

        final String str = "kitten";

        final String expected = "kien";

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String str = "Chocolate";

        final String expected = "Chole";

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String str = "CodingHorror";

        final String expected = "Congrr";

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenStringIsNull() {

        final String str = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenStringIsEmpty() {

        final String str = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenStringLengthIsLessThanEqual2() {

        final String str1 = "a";
        final String str2 = "ab";

        final String expected1 = str1;
        final String expected2 = str2;

        final String actual1 = fixture.altPairs(str1);
        final String actual2 = fixture.altPairs(str2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
