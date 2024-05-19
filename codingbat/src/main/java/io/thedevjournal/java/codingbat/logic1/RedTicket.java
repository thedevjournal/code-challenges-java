package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.NumberConstants.ZERO;

public class RedTicket {

    static final int LOTTERY_TEN = TEN;

    static final int LOTTERY_FIVE = FIVE;

    static final int LOTTERY_ONE = ONE;

    static final int LOTTERY_ZERO = ZERO;

    public int redTicket(final int num1, final int num2, final int num3) {

        final boolean allTwos = num1 == num2 && num2 == num3 && num1 == TWO;
        final boolean allOnes = num1 == num2 && num2 == num3 && num1 == ONE;
        final boolean allZeros = num1 == num2 && num2 == num3 && num1 == ZERO;
        final boolean num2AndNum3DifferentFromNum1 = num1 != num2 && num1 != num3;

        final int result;

        if (allTwos) {
            result = LOTTERY_TEN;
        } else if (allOnes || allZeros) {
            result = LOTTERY_FIVE;
        } else if (num2AndNum3DifferentFromNum1) {
            result = LOTTERY_ONE;
        } else {
            result = LOTTERY_ZERO;
        }

        return result;
    }
}
