package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;

import io.thedevjournal.java.common.StringConstants;

public class MakeOutWord {

    public String makeOutWord(final String out, final String word) {

        if (StringConstants.isEmpty(word)) {
            return EMPTY_STRING;
        }

        String prefix = EMPTY_STRING;
        String suffix = EMPTY_STRING;

        if (out != null && out.length() > 0) {
            prefix = out.substring(0, out.length() / TWO);
            suffix = out.substring(out.length() / TWO);
        }

        return prefix + word + suffix;
    }
}
