package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public final class StringBits {

    public String stringBits(final String str) {

        final String input = Optional.ofNullable(str).orElseGet(EMPTY_STRING_SUPPLIER);

        final StringBuilder result = new StringBuilder();

        for (int index = 0; index < input.length(); index += 2) {
            result.append(input.charAt(index));
        }

        return result.toString();
    }
}
