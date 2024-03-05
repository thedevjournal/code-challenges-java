package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.THREE;

public class Odd35 {

    public boolean old35(final int number) {

        final boolean isDivisibleBy3 = number % THREE == 0;
        final boolean isDivisibleBy5 = number % FIVE == 0;

        final boolean divisibleBy3ButNotBy5 = isDivisibleBy3 && !isDivisibleBy5;
        final boolean divisibleBy5ButNotBy3 = !isDivisibleBy3 && isDivisibleBy5;

        return divisibleBy3ButNotBy5 || divisibleBy5ButNotBy3;
    }
}
