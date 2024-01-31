package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class EndsLy {

    private static final String SUFFIX_LY = "ly";

    public boolean endsLy(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        return inputNormalized.endsWith(SUFFIX_LY);
    }
}
