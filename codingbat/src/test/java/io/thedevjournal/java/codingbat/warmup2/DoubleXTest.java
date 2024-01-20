package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoubleXTest {

    private DoubleX fixture;

    @BeforeEach
    void setUp() {
        fixture = new DoubleX();
    }

    @Test
    void shouldReturnTrue_WhenFirstTwoXAreNextToEachOtherInFront() {

        final String str = "xxbb";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenFirstTwoXAreNextToEachOtherInEnd() {

        final String str = "axx";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenFirstTwoXAreNextToEachOtherInMiddle() {

        final String str = "axxbb";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNoXExists() {

        final String str = "abcdef";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenXExistsAlone() {

        final String str = "axcxefx";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenFirstXIsAlone() {

        final String str = "xcxx";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenAllX() {

        final String str = "xxx";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenSingleX() {

        final String str = "x";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenTwoX() {

        final String str = "xx";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNull() {

        final String str = null;

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenEmpty() {

        final String str = EMPTY_STRING;

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }
}
