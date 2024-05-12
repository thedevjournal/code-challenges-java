package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class Left2 {

    public String left2(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        if (inputNormalized.length() <= TWO) {
            return inputNormalized;
        }

        return inputNormalized.substring(TWO) + inputNormalized.substring(0, TWO);
    }
}
