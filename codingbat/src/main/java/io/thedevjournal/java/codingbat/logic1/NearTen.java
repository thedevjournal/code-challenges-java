package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.TEN;
import static io.thedevjournal.java.common.NumberConstants.TWO;

public class NearTen {

    public boolean nearTen(final int number) {

        final int remainder = number % TEN;

        final int nearTen = remainder >= FIVE ? TEN - remainder : remainder;

        return nearTen <= TWO;
    }
}
