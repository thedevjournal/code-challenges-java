package io.thedevjournal.java.common;

import java.util.function.Supplier;

public final class StringConstants {

    public static final String EMPTY_STRING = "";

    public static final Supplier<String> EMPTY_STRING_SUPPLIER = () -> EMPTY_STRING;

    private StringConstants() {
    }

    public static boolean isEmpty(final String value) {
        return value == null || value.isEmpty();
    }

    public static boolean hasLength(final String value) {
        return !isEmpty(value);
    }
}
