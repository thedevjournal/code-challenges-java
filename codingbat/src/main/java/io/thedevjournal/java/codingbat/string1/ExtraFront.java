package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class ExtraFront {

    public String extraFront(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int endIndex = Math.min(inputNormalized.length(), TWO);

        return inputNormalized.substring(0, endIndex)
                + inputNormalized.substring(0, endIndex)
                + inputNormalized.substring(0, endIndex);
    }
}
