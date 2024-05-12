package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

import io.thedevjournal.java.common.StringConstants;

public class MakeTags {

    public String makeTags(final String tag, final String word) {

        if (StringConstants.isEmpty(tag)) {
            return EMPTY_STRING;
        }

        final String wordNormalized = Optional.ofNullable(word).orElseGet(EMPTY_STRING_SUPPLIER);

        return String.format("<%s>%s</%s>", tag, wordNormalized, tag);
    }
}
