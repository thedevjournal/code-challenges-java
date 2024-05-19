package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.TWO;

public class TeaParty {

    static final int PARTY_BAD = 0;

    static final int PARTY_GOOD = 1;

    static final int PARTY_GREAT = 2;

    public int teaParty(final int tea, final int candy) {

        final boolean isGood = isGood(tea, candy);
        final boolean isGreat = isGreat(tea, candy);

        final int party;

        if (isGood && isGreat) {
            party = PARTY_GREAT;
        } else if (isGood) {
            party = PARTY_GOOD;
        } else {
            party = PARTY_BAD;
        }

        return party;
    }

    private boolean isGreat(final int tea, final int candy) {

        final int twiceTea = TWO * tea;
        final int twiceCandy = TWO * candy;

        return tea >= twiceCandy || candy >= twiceTea;
    }

    private boolean isGood(final int tea, final int candy) {
        return tea >= FIVE && candy >= FIVE;
    }
}
