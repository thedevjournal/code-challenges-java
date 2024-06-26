package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.NumberConstants.ZERO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class DeFront {

    private static final Character CHAR_SMALL_A = 'a';

    private static final Character CHAR_SMALL_B = 'b';

    public String deFront(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();

        final String first = getMatchingCharacterAtIndex(inputNormalized, ZERO, CHAR_SMALL_A);
        final String second = getMatchingCharacterAtIndex(inputNormalized, ONE, CHAR_SMALL_B);
        final String rest = inputLength > TWO ? inputNormalized.substring(TWO) : EMPTY_STRING;

        return first + second + rest;
    }

    public String getMatchingCharacterAtIndex(final String input, final int index, final Character character) {
        return input.length() > index && character == input.charAt(index) ? character.toString() : EMPTY_STRING;
    }
}
