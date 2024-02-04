package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class MakeAbba {

    public String makeAbba(final String inputA, final String inputB) {

        final StringBuilder result = new StringBuilder();

        final String aNormalized = Optional.ofNullable(inputA).orElseGet(EMPTY_STRING_SUPPLIER);
        final String bNormalized = Optional.ofNullable(inputB).orElseGet(EMPTY_STRING_SUPPLIER);

        return result
                .append(aNormalized)
                .append(bNormalized)
                .append(bNormalized)
                .append(aNormalized)
                .toString();
    }
}
