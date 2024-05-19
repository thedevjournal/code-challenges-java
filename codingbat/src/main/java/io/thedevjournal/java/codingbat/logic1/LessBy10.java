package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.TEN;

public class LessBy10 {

    public boolean lessBy10(final int num1, final int num2, final int num3) {

        final int differenceNum1AndNum2 = Math.abs(num1 - num2);
        final int differenceNum2AndNum3 = Math.abs(num2 - num3);
        final int differenceNum1AndNum3 = Math.abs(num1 - num3);

        return differenceNum1AndNum2 >= TEN || differenceNum2AndNum3 >= TEN || differenceNum1AndNum3 >= TEN;
    }
}
