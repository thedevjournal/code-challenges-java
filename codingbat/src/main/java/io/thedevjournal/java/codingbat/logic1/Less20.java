package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;
import static io.thedevjournal.java.common.NumberConstants.TWO;

public class Less20 {

    public boolean less20(final int number) {

        final int remainder = number % TWENTY;
        final int twentyMinusRemainder = Math.abs(TWENTY - remainder);

        return twentyMinusRemainder == ONE || twentyMinusRemainder == TWO;
    }
}
