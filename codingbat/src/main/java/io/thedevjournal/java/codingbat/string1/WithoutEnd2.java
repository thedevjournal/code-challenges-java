package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class WithoutEnd2 {

    public String withoutEnd2(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();

        if (inputLength <= TWO) {
            return EMPTY_STRING;
        }

        final int beginIndex = Math.min(inputLength, ONE);
        final int endIndex = Math.max(0, inputLength - ONE);

        return inputNormalized.substring(beginIndex, endIndex);
    }
}
