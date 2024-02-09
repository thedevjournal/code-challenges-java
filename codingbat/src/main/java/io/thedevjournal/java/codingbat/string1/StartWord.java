package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class StartWord {

    public String startWord(final String input, final String word) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);
        final String wordNormalized = Optional.ofNullable(word).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();
        final int wordLength = wordNormalized.length();

        if (inputLength == 0 || wordLength == 0) {
            return EMPTY_STRING;
        } else if (inputLength == ONE && wordLength == ONE) {
            return inputNormalized;
        } else if (inputLength == ONE) {
            return EMPTY_STRING;
        }

        final String search = wordNormalized.substring(ONE);

        final int startIndex = ONE;
        final int endIndex = Math.min(inputLength, ONE + search.length());

        final String text = inputNormalized.substring(startIndex, endIndex);

        final String matchedText = wordLength > ONE ? text : EMPTY_STRING;

        return text.equals(search) ? inputNormalized.charAt(0) + matchedText : EMPTY_STRING;
    }
}
