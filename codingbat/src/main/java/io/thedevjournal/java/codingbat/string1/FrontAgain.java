package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class FrontAgain {

    public boolean frontAgain(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();

        if (inputLength >= TWO) {
            final String firstTwo = inputNormalized.substring(0, TWO);
            final String lastTwo = inputNormalized.substring(inputLength - TWO);

            return firstTwo.equals(lastTwo);
        }

        return false;
    }
}
