package io.thedevjournal.java.codingbat.logic1;

public class CaughtSpeeding {

    static final int[] LIMITS_BIRTHDAY = { 66, 85 };

    static final int[] LIMITS_NOT_BIRTHDAY = { 61, 80 };

    static final int NO_TICKET = 0;

    static final int SMALL_TICKET = 1;

    static final int BIG_TICKET = 2;

    public int caughtSpeeding(final int speed, final boolean isBirthday) {

        final int[] limits = getLimits(isBirthday);

        final int lowerLimit = limits[0];
        final int upperLimit = limits[1];

        final int speedingTicket;

        if (speed < lowerLimit) {
            speedingTicket = NO_TICKET;
        } else if (speed <= upperLimit) {
            speedingTicket = SMALL_TICKET;
        } else {
            speedingTicket = BIG_TICKET;
        }

        return speedingTicket;
    }

    private int[] getLimits(final boolean isBirthday) {

        final int lowerLimit = isBirthday ? LIMITS_BIRTHDAY[0] : LIMITS_NOT_BIRTHDAY[0];
        final int upperLimit = isBirthday ? LIMITS_BIRTHDAY[1] : LIMITS_NOT_BIRTHDAY[1];

        return new int[] { lowerLimit, upperLimit };
    }
}
