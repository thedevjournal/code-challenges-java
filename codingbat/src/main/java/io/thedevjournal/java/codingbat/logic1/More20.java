package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;
import static io.thedevjournal.java.common.NumberConstants.TWO;

public class More20 {

    public boolean more20(final int number) {

        final int remainder = number % TWENTY;

        return remainder == ONE || remainder == TWO;
    }
}
