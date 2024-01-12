package io.thedevjournal.java.codingbat.warmup1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.THREE;

public class Or35 {

    public final boolean or35(final int number) {
        return number % THREE == 0 || number % FIVE == 0;
    }
}
