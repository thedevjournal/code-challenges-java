package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public final class FrontTimes {

    public String frontTimes(final String str, final int number) {

        final StringBuilder result = new StringBuilder();

        final String input = Optional.ofNullable(str).orElseGet(EMPTY_STRING_SUPPLIER);

        if (!input.isEmpty()) {

            final String front = input.length() < THREE ? input : input.substring(0, THREE);

            for (int index = 1; index <= number; index++) {
                result.append(front);
            }
        }

        return result.toString();
    }
}
