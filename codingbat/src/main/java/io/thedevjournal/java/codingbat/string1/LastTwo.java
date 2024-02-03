package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class LastTwo {

    public String lastTwo(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();

        if (inputLength >= TWO) {

            final int mid = inputLength - TWO;

            final String part1 = inputNormalized.substring(0, mid);
            final String part2 = inputNormalized.substring(mid + 1);
            final String part3 = inputNormalized.substring(mid, mid + 1);

            return part1 + part2 + part3;
        }

        return inputNormalized;
    }
}
