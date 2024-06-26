package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class FizzString {

    static final String FIZZBUZZ = "FizzBuzz";

    static final String FIZZ = "Fizz";

    static final String BUZZ = "Buzz";

    private static final String CHAR_F = "f";

    private static final String CHAR_B = "b";

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

        if (CHAR_F.equalsIgnoreCase(firstChar) && CHAR_B.equalsIgnoreCase(lastChar)) {
            result = FIZZBUZZ;
        } else if (CHAR_F.equalsIgnoreCase(firstChar)) {
            result = FIZZ;
        } else if (CHAR_B.equalsIgnoreCase(lastChar)) {
            result = BUZZ;
        } else {
            result = string;
        }

        return result;
    }
}
