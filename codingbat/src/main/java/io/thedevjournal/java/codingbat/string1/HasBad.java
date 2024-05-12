package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.THREE;

import java.util.regex.Pattern;

import io.thedevjournal.java.common.StringConstants;

public class HasBad {

    private static final Pattern PATTERN = Pattern.compile("^.{0,1}bad");

    public boolean hasBad(final String input) {

        if (StringConstants.isEmpty(input) || input.length() < THREE) {
            return false;
        }

        return PATTERN.matcher(input).find();
    }
}
