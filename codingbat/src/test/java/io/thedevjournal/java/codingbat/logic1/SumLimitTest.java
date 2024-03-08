package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIFTY;
import static io.thedevjournal.java.common.NumberConstants.NINETY;
import static io.thedevjournal.java.common.NumberConstants.THIRTY;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumLimitTest {

    private SumLimit fixture;

    @BeforeEach
    void setUp() {
        fixture = new SumLimit();
    }

    @Test
    void shouldReturnSum_WhenSumLengthIsSameAsNum1Length() {

        final int num1 = TWENTY;
        final int num2 = THIRTY;

        final int expected = FIFTY;

        final int actual = fixture.sumLimit(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnNum1_WhenSumLengthIsDifferntFromNum1Length() {

        final int num1 = TWENTY;
        final int num2 = NINETY;

        final int expected = TWENTY;

        final int actual = fixture.sumLimit(num1, num2);

        assertThat(actual).isEqualTo(expected);
    }
}
