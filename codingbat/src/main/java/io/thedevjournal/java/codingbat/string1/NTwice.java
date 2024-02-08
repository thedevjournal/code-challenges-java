package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;

import io.thedevjournal.java.common.StringConstants;

public class NTwice {

    public String nTwice(final String input, final int number) {

        if (StringConstants.isEmpty(input)) {
            return EMPTY_STRING;
        }

        final int inputLength = input.length();

        if (inputLength < number) {
            throw new IllegalArgumentException("Length of the String is too short");
        }

        final String front = input.substring(0, number);
        final String end = input.substring(inputLength - number);

        return front + end;
    }
}
