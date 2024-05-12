package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public final class StringMatch {

    public int stringMatch(final String input1, final String input2) {

        final String string1 = Optional.ofNullable(input1).orElseGet(EMPTY_STRING_SUPPLIER);
        final String string2 = Optional.ofNullable(input2).orElseGet(EMPTY_STRING_SUPPLIER);

        final int loopCounter = Math.min(string1.length(), string2.length());

        int totalMatches = 0;

        for (int i = 0; i < loopCounter - 1; i++) {

            final String subStringA = string1.substring(i, i + 2);
            final String subStringB = string2.substring(i, i + 2);

            if (subStringA.equals(subStringB)) {
                totalMatches++;
            }
        }

        return totalMatches;
    }
}
