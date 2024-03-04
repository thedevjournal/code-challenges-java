package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;

public class MaxMod5 {

    public int maxMod5(final int num1, final int num2) {

        final boolean sameValues = num1 == num2;
        final int remainderNum1ModFive = num1 % FIVE;
        final int remainderNum2ModFive = num2 % FIVE;

        final boolean sameRemainder = remainderNum1ModFive == remainderNum2ModFive;

        final int max = num1 >= num2 ? num1 : num2;
        final int min = num1 <= num2 ? num1 : num2;

        final int result;

        if (sameValues) {
            result = 0;
        } else if (sameRemainder) {
            result = min;
        } else {
            result = max;
        }

        return result;
    }
}
