package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;

import java.util.Optional;

public class LastChars {

    private static final String SYMBOL_AT = "@";

    public String lastChars(final String inputA, final String inputB) {

        final String aNormalized = getNormalized(inputA);
        final String bNormalized = getNormalized(inputB);

        final char firstCharA = aNormalized.charAt(0);
        final char lastCharB = bNormalized.charAt(bNormalized.length() - 1);

        return EMPTY_STRING + firstCharA + lastCharB;
    }

    private String getNormalized(final String value) {
        return Optional.ofNullable(value).filter(s -> !s.isEmpty()).orElseGet(() -> SYMBOL_AT);
    }
}
