package io.thedevjournal.java.codingbat.warmup1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.NumberConstants.ZERO;

public class StartOz {

    static final String O_STRING = "o";

    static final String Z_STRING = "z";

    public final String startOz(final String str) {

        final StringBuilder output = new StringBuilder();

        if (str.length() >= TWO) {

            final String first = str.substring(ZERO, ONE);
            final String second = str.substring(ONE, TWO);

            if (O_STRING.equals(first)) {
                output.append(first);
            }

            if (Z_STRING.equals(second)) {
                output.append(second);
            }

        } else {
            output.append(str);
        }

        return output.toString();
    }
}
