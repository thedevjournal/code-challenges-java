package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class ConCat {

    public String conCat(final String inputA, final String inputB) {

        final String aNormalized = Optional.ofNullable(inputA).orElseGet(EMPTY_STRING_SUPPLIER);
        final String bNormalized = Optional.ofNullable(inputB).orElseGet(EMPTY_STRING_SUPPLIER);

        final int aLength = aNormalized.length();
        final int bLength = bNormalized.length();

        if (aLength > 0 && bLength > 0 && aNormalized.charAt(aLength - ONE) == bNormalized.charAt(0)) {
            return aNormalized.substring(0, aLength - ONE) + bNormalized;
        }

        return aNormalized + bNormalized;
    }
}
