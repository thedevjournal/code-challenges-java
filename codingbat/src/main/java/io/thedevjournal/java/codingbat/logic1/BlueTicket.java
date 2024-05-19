package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.ZERO;

public class BlueTicket {

    static final int LOTTERY_TEN = TEN;

    static final int LOTTERY_FIVE = FIVE;

    static final int LOTTERY_ZERO = ZERO;

    public int blueTicket(final int num1, final int num2, final int num3) {

        final int sum1 = num1 + num2;
        final int sum2 = num2 + num3;
        final int sum3 = num1 + num3;

        final boolean anySumIsTen = sum1 == TEN || sum2 == TEN || sum3 == TEN;
        final boolean sum1IsExactlyTenMoreThanSum2OrSum3 = Math.abs(sum1 - sum2) == TEN || Math.abs(sum1 - sum3) == TEN;

        final int result;

        if (anySumIsTen) {
            result = LOTTERY_TEN;
        } else if (sum1IsExactlyTenMoreThanSum2OrSum3) {
            result = LOTTERY_FIVE;
        } else {
            result = LOTTERY_ZERO;
        }

        return result;
    }
}
