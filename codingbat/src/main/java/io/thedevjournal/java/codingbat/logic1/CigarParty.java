package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.FORTY;
import static io.thedevjournal.java.common.NumberConstants.SIXTY;

public class CigarParty {

    public boolean cigarParty(final int cigars, final boolean isWeekend) {
        return isWeekend ? cigars >= FORTY : cigars >= FORTY && cigars <= SIXTY;
    }
}
