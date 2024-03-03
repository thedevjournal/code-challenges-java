package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.SIX;

public class Love6 {

    static final int VALUE_TO_COMPARE = SIX;

    public boolean love6(final int num1, final int num2) {

        final int sum = num1 + num2;
        final int difference = num1 - num2;

        final boolean anyValueMatch = num1 == VALUE_TO_COMPARE || num2 == VALUE_TO_COMPARE;

        final boolean sumMatch = sum == VALUE_TO_COMPARE;
        final boolean differenceMatch = Math.abs(difference) == VALUE_TO_COMPARE;

        return anyValueMatch || sumMatch || differenceMatch;
    }
}
