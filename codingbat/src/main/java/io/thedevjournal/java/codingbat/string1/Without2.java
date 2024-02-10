package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class Without2 {

    public String without2(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();

        if (inputLength == 0 || inputLength == TWO) {
            return EMPTY_STRING;
        }

        if (inputLength > TWO && inputNormalized.substring(0, TWO).equals(inputNormalized.substring(inputLength - TWO))) {
            return inputNormalized.substring(TWO);
        }

        return inputNormalized;
    }
}
