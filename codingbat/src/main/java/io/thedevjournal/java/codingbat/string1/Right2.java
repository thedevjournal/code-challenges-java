package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class Right2 {

    public String right2(final String input) {

        final String value = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int valueLength = value.length();

        if (valueLength <= TWO) {
            return value;
        }

        return value.substring(valueLength - TWO) + value.substring(0, valueLength - TWO);
    }
}
