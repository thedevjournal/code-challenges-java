package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;
import static io.thedevjournal.java.common.NumberConstants.ZERO;

public class GreenTicket {

    static final int LOTTERY_ZERO = ZERO;

    static final int LOTTERY_TEN = TEN;

    static final int LOTTERY_TWENTY = TWENTY;

    public int greenTicket(final int num1, final int num2, final int num3) {

        final boolean allSame = num1 == num2 && num2 == num3;
        final boolean twoNumbersAreSame = num1 == num2 || num2 == num3 || num1 == num3;

        final int result;

        if (allSame) {
            result = LOTTERY_TWENTY;
        } else if (twoNumbersAreSame) {
            result = LOTTERY_TEN;
        } else {
            result = LOTTERY_ZERO;
        }

        return result;
    }
}
