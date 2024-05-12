package io.thedevjournal.java.codingbat.warmup1;

import static io.thedevjournal.java.common.NumberConstants.TEN;

public class LastDigit {

    public final boolean lastDigit(final int number1, final int number2) {

        final int lastDigitNumber1 = number1 % TEN;
        final int lastDigitNumber2 = number2 % TEN;

        return lastDigitNumber1 == lastDigitNumber2;
    }
}
