package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.codingbat.logic1.FizzString2.BUZZ;
import static io.thedevjournal.java.codingbat.logic1.FizzString2.FIZZ;
import static io.thedevjournal.java.codingbat.logic1.FizzString2.FIZZBUZZ;
import static io.thedevjournal.java.codingbat.logic1.FizzString2.RESULT_SUFFIX;
import static io.thedevjournal.java.common.NumberConstants.FIFTEEN;
import static io.thedevjournal.java.common.NumberConstants.SEVEN;
import static io.thedevjournal.java.common.NumberConstants.SIX;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.RandomValuesUtil.randomInteger;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzString2Test {

    private FizzString2 fixture;

    @BeforeEach
    void setUp() {
        fixture = new FizzString2();
    }

    @Test
    void shouldReturnFizzBuzz_WhenNumberIsDivisibleByFifteen() {

        final int number = randomInteger() * FIFTEEN;

        final String expected = FIZZBUZZ + RESULT_SUFFIX;

        final String actual = fixture.fizzString2(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnFizz_WhenNumberIsDivisibleOnlyByThree() {

        final int number = SIX;

        final String expected = FIZZ + RESULT_SUFFIX;

        final String actual = fixture.fizzString2(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBuzz_WhenNumberIsDivisibleOnlyByFive() {

        final int number = TEN;

        final String expected = BUZZ + RESULT_SUFFIX;

        final String actual = fixture.fizzString2(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnNumber_WhenNumberIsNotDivisibleByBothThreeAndFive() {

        final int number = SEVEN;

        final String expected = SEVEN + RESULT_SUFFIX;

        final String actual = fixture.fizzString2(number);

        assertThat(actual).isEqualTo(expected);
    }
}
