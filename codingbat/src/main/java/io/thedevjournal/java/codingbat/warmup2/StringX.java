package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;
import java.util.stream.IntStream;

public final class StringX {

    static final char CHAR_X = 'x';

    public String stringX(final String str) {

        final String input = Optional.ofNullable(str).orElseGet(EMPTY_STRING_SUPPLIER);

        final StringBuilder result = new StringBuilder();

        if (input.length() >= THREE) {

            result.append(input.charAt(0));

            IntStream.range(1, input.length() - 1).forEach(i -> {

                final char currentChar = input.charAt(i);

                if (currentChar != CHAR_X) {
                    result.append(currentChar);
                }
            });

            result.append(input.charAt(input.length() - 1));

        } else {
            result.append(input);
        }

        return result.toString();
    }
}
