package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class WithoutX2 {

    public String withoutX2(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final String front;
        final String tail;

        if (inputNormalized.length() <= TWO) {
            front = inputNormalized;
            tail = EMPTY_STRING;
        } else {
            front = inputNormalized.substring(0, TWO);
            tail = inputNormalized.substring(TWO);
        }

        return front.replaceAll("x", EMPTY_STRING) + tail;
    }
}
