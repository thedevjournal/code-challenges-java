package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;

import io.thedevjournal.java.common.StringConstants;

public class AtFirst {

    public String atFirst(final String input) {

        if (StringConstants.isEmpty(input)) {
            return "@@";
        }

        if (input.length() == ONE) {
            return input.substring(0, ONE) + "@";
        }

        return input.substring(0, TWO);
    }
}
