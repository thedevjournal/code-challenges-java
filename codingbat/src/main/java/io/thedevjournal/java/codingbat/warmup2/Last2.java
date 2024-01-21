package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public final class Last2 {

    public int last2(final String str) {

        final String input = Optional.ofNullable(str).orElseGet(EMPTY_STRING_SUPPLIER);

        int count = 0;

        if (input.length() >= TWO) {

            final int strLength = input.length();
            final String last2 = input.substring(strLength - TWO, strLength);

            for (int index = 0; index < strLength - TWO; index++) {
                final String currentSubstring = input.substring(index, index + TWO);

                if (currentSubstring.equals(last2)) {
                    count++;
                }
            }
        }

        return count;
    }
}
