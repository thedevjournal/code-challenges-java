package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.THIRTEEN;
import static io.thedevjournal.java.common.NumberConstants.THIRTY;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShareDigitTest {

    private ShareDigit fixture;

    @BeforeEach
    void setUp() {
        fixture = new ShareDigit();
    }

    @Test
    void shouldReturnTrue_WhenNum1AndNum2ShareDigit() {

        final int num1 = TWENTY;
        final int num2 = THIRTY;

        final boolean expected = true;

        final boolean actual = fixture.shareDigit(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFalse_WhenNum1AndNum2DoNotShareDigit() {

        final int num1 = TWENTY;
        final int num2 = THIRTEEN;

        final boolean expected = false;

        final boolean actual = fixture.shareDigit(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
