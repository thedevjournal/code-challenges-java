package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeeColor {

    private static final Pattern PATTERN_RED_OR_BLUE = Pattern.compile("^(red|blue)");

    public String seeColor(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final Matcher matcher = PATTERN_RED_OR_BLUE.matcher(inputNormalized);

        return matcher.find() ? matcher.group(1) : EMPTY_STRING;
    }
}
