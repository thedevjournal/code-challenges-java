package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public final class StringYak {

    public String stringYak(final String str) {

        final String input = Optional.ofNullable(str).orElseGet(EMPTY_STRING_SUPPLIER);

        String output = input;

        if (input.length() >= THREE) {
            output = input.replaceAll("y[a-zA-Z0-9]k", EMPTY_STRING);
        }

        return output;
    }
}
