package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.SEVEN;
import static io.thedevjournal.java.common.NumberConstants.TWELVE;

public class WithoutDoubles {

    public int withoutDoubles(final int die1, final int die2, final boolean noDoubles) {

        final boolean doubles = die1 == die2;
        final int sum = die1 + die2;

        final int result;

        if (noDoubles && doubles) {
            result = sum == TWELVE ? SEVEN : sum + 1;
        } else {
            result = sum;
        }

        return result;
    }
}
