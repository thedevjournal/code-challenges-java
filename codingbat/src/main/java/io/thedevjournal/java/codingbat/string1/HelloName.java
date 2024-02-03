package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;

import io.thedevjournal.java.common.StringConstants;

public class HelloName {

    private static final String HELLO = "Hello";

    public String helloName(final String name) {

        final String greeting = StringConstants.hasLength(name) ? " " + name : EMPTY_STRING;

        return HELLO + greeting + "!";
    }
}
