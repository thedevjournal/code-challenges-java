package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public final class DoubleX {

    static final char CHAR_X = 'x';

    public boolean doubleX(final String str) {

        final String input = Optional.ofNullable(str).orElseGet(EMPTY_STRING_SUPPLIER);

        boolean result = false;

        final int strLength = input.length();

        for (int index = 0; index < strLength - 1; index++) {
            if (input.charAt(index) == CHAR_X) {
                result = input.charAt(index + 1) == CHAR_X;
                break;
            }
        }

        return result;
    }
}
