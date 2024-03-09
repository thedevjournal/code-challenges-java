package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.TEEN_END;
import static io.thedevjournal.java.common.NumberConstants.TEEN_START;

public class TeenSum {

    public int teenSum(final int number1, final int number2) {

        final int sum = number1 + number2;
        final boolean eitherNumberIsTeen = isTeen(number1) || isTeen(number2);

        return eitherNumberIsTeen ? TEEN_END : sum;
    }

    private boolean isTeen(final int number) {
        return number >= TEEN_START && number <= TEEN_END;
    }
}
