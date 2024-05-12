package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class ComboString {

    public String comboString(final String inputA, final String inputB) {

        final String aNormalized = Optional.ofNullable(inputA).orElseGet(EMPTY_STRING_SUPPLIER);
        final String bNormalized = Optional.ofNullable(inputB).orElseGet(EMPTY_STRING_SUPPLIER);

        final String shortStr;
        final String longStr;

        if (aNormalized.length() <= bNormalized.length()) {
            shortStr = aNormalized;
            longStr = bNormalized;
        } else {
            shortStr = bNormalized;
            longStr = aNormalized;
        }

        return shortStr + longStr + shortStr;
    }
}
