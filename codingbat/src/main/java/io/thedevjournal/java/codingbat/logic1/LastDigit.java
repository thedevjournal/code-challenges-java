package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.TEN;

public class LastDigit {

    public boolean lastDigit(final int num1, final int num2, final int num3) {

        final int lastDigitNum1 = num1 % TEN;
        final int lastDigitNum2 = num2 % TEN;
        final int lastDigitNum3 = num3 % TEN;

        return lastDigitNum1 == lastDigitNum2 || lastDigitNum2 == lastDigitNum3 || lastDigitNum1 == lastDigitNum3;
    }
}
