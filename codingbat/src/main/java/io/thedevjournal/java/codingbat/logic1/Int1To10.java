package io.thedevjournal.java.codingbat.logic1;

import java.util.function.Predicate;

public class Int1To10 {

    private static final int LOWER_LIMIT = 1;

    private static final int UPPER_LIMIT = 10;

    public boolean in1To10(final int number, final boolean outsideMode) {

        final Predicate<Integer> process = outsideMode ? processExclusiveMode() : processInclusiveMode();

        return process.test(number);
    }

    private Predicate<Integer> processInclusiveMode() {
        return it -> it >= LOWER_LIMIT && it <= UPPER_LIMIT;
    }

    private Predicate<Integer> processExclusiveMode() {
        return it -> it <= LOWER_LIMIT || it >= UPPER_LIMIT;
    }
}
