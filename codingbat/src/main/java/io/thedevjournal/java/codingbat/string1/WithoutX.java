package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class WithoutX {

    public String withoutX(final String input) {
        return Optional
                .ofNullable(input)
                .orElseGet(EMPTY_STRING_SUPPLIER)
                .replaceAll("^x", EMPTY_STRING)
                .replaceAll("x$", EMPTY_STRING);
    }
}
