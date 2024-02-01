package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;

import io.thedevjournal.java.common.StringConstants;

public class FirstHalf {

    public String firstHalf(final String input) {

        if (StringConstants.isEmpty(input)) {
            return EMPTY_STRING;
        }

        final int indexMiddle = (int) Math.ceil(input.length() / 2.0);

        return input.substring(0, indexMiddle);
    }
}
