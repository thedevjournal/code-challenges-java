package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class MinCat {

    public String minCat(final String inputA, final String inputB) {

        final String aNormalized = Optional.ofNullable(inputA).orElseGet(EMPTY_STRING_SUPPLIER);
        final String bNormalized = Optional.ofNullable(inputB).orElseGet(EMPTY_STRING_SUPPLIER);

        final int aLength = aNormalized.length();
        final int bLength = bNormalized.length();

        if (aLength > bLength) {
            return aNormalized.substring(aLength - bLength) + bNormalized;
        } else if (bLength > aLength) {
            return aNormalized + bNormalized.substring(bLength - aLength);
        } else {
            return aNormalized + bNormalized;
        }
    }
}
