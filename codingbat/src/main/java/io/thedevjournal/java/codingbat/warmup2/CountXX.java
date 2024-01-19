package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CountXX {

    static final Pattern PATTERN = Pattern.compile("([x]){2}");

    public int countXxValues(final String str) {

        int count = 0;

        final String input = Optional.ofNullable(str).orElseGet(EMPTY_STRING_SUPPLIER);
        final Matcher matcher = PATTERN.matcher(input);

        // The trick is to start again at the first matched position
        if (matcher.find()) {
            do {
                count++;
            } while (matcher.find(matcher.start(1)));
        }

        return count;
    }
}
