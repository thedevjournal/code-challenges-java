package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.SIXTY;

import io.thedevjournal.java.common.NumberConstants;

public class SquirrelPlay {

    public boolean squirrelPlay(final int temperature, final boolean isSummer) {

        final int lowerLimit = SIXTY;
        final int upperLimit = isSummer ? NumberConstants.HUNDRED : NumberConstants.NINETY;

        return temperature >= lowerLimit && temperature <= upperLimit;
    }
}
