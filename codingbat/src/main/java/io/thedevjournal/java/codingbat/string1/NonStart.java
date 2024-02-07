package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class NonStart {

    public String nonStart(final String inputA, final String inputB) {

        final String aNormalized = Optional.ofNullable(inputA).orElseGet(EMPTY_STRING_SUPPLIER);
        final String bNormalized = Optional.ofNullable(inputB).orElseGet(EMPTY_STRING_SUPPLIER);

        final String returnValue1 = aNormalized.substring(Math.min(aNormalized.length(), ONE));
        final String returnValue2 = bNormalized.substring(Math.min(bNormalized.length(), ONE));

        return returnValue1 + returnValue2;
    }
}
