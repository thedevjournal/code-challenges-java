package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.THREE;

public class FizzString2 {

    static final String FIZZBUZZ = "FizzBuzz";

    static final String FIZZ = "Fizz";

    static final String BUZZ = "Buzz";

    static final String RESULT_SUFFIX = "!";

    public String fizzString2(final int number) {

        final boolean divisibleByThree = number % THREE == 0;
        final boolean divisibleByFive = number % FIVE == 0;

        final String result;

        if (divisibleByThree && divisibleByFive) {
            result = FIZZBUZZ;
        } else if (divisibleByThree) {
            result = FIZZ;
        } else if (divisibleByFive) {
            result = BUZZ;
        } else {
            result = String.valueOf(number);
        }

        return result + RESULT_SUFFIX;
    }
}
