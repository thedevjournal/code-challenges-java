package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;

import io.thedevjournal.java.common.StringConstants;

public class ExtraEnd {

    public String extraEnd(final String input) {

        if (StringConstants.isEmpty(input)) {
            return EMPTY_STRING;
        }

        final String suffix = input.substring(Math.max(input.length() - TWO, 0));

        final StringBuilder result = new StringBuilder();

        for (int i = THREE; i > 0; i--) {
            result.append(suffix);
        }

        return result.toString();
    }
}
