package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class MiddleTwo {

    public String middleTwo(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();

        if (inputLength > 0) {
            if (inputLength % TWO != 0) {
                throw new UnsupportedOperationException("MiddleTwo for odd lengths is not supported");
            }

            final int middlePos = (inputLength / TWO) - 1;

            return inputNormalized.substring(middlePos, middlePos + TWO);
        }

        return EMPTY_STRING;
    }
}
