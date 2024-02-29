package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class FizzString {

    static final String FIZZBUZZ = "FizzBuzz";

    static final String FIZZ = "Fizz";

    static final String BUZZ = "Buzz";

    public String fizzString(final String str) {

        final String string = Optional.ofNullable(str).orElseGet(EMPTY_STRING_SUPPLIER).trim();

        if (string.length() == 0) {
            return string;
        }

        final int startPosition = 0;
        final int lastPosition = string.length() - 1;

        final String firstChar = String.valueOf(string.charAt(startPosition));
        final String lastChar = String.valueOf(string.charAt(lastPosition));

        final String result;

        if (firstChar.equalsIgnoreCase("f") && lastChar.equalsIgnoreCase("b")) {
            result = FIZZBUZZ;
        } else if (firstChar.equalsIgnoreCase("f")) {
            result = FIZZ;
        } else if (lastChar.equalsIgnoreCase("b")) {
            result = BUZZ;
        } else {
            result = string;
        }

        return result;
    }
}
