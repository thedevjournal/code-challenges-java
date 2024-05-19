package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.TEEN_END;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.TWENTY;

public class SortaSum {

    public int sortaSum(final int num1, final int num2) {

        final int sum = num1 + num2;

        return sum >= TEN && sum <= TEEN_END ? TWENTY : sum;
    }
}
