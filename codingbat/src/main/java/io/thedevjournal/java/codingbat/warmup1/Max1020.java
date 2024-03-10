package io.thedevjournal.java.codingbat.warmup1;

import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;

public class Max1020 {

    public final int max1020(final int value1, final int value2) {

        final boolean isValue1inRange = TEN <= value1 && value1 <= TWENTY;
        final boolean isValue2inRange = TEN <= value2 && value2 <= TWENTY;

        int max = 0;

        /*
        The coverage for the below line cannot be 100%.
        Uncovered condition: isValue1inRange = true and value1 > max = false
        This is not possible because if value1 is in range,
        it can never be less than max
        */
        if (isValue1inRange && value1 > max) {
            max = value1;
        }

        if (isValue2inRange && value2 > max) {
            max = value2;
        }

        return max;
    }
}
