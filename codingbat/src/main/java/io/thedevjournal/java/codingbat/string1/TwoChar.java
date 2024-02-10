package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class TwoChar {

    public String twoChar(final String input, final int index) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();

        if (inputLength < TWO) {
            return EMPTY_STRING;
        }

        int startIndex = 0;

        if (index > 0) {
            startIndex = (index + TWO) > inputLength ? 0 : index;
        }

        return inputNormalized.substring(startIndex, startIndex + TWO);
    }
}
