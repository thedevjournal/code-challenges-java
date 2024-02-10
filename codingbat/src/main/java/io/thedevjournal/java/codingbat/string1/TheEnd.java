package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class TheEnd {

    public String theEnd(final String input, final boolean front) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();

        final String frontChar = inputNormalized.substring(0, Math.min(inputLength, 1));
        final String lastChar = inputNormalized.substring(Math.max(0, inputLength - 1));

        return front ? frontChar : lastChar;
    }
}
