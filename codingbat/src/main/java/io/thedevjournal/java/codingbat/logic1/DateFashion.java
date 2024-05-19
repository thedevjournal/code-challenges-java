package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.EIGHT;
import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.NumberConstants.ZERO;

public class DateFashion {

    static final int TABLE_RESULT_YES = TWO;

    static final int TABLE_RESULT_MAYBE = ONE;

    static final int TABLE_RESULT_NO = ZERO;

    static final int STYLE_SCORE_HIGH = EIGHT;

    static final int STYLE_SCORE_LOW = TWO;

    public int dateFashion(final int youStyleScore, final int dateStyleScore) {

        final boolean oneOfUsIsStylish = youStyleScore >= STYLE_SCORE_HIGH || dateStyleScore >= STYLE_SCORE_HIGH;
        final boolean oneOfUsIsNotStylish = youStyleScore <= STYLE_SCORE_LOW || dateStyleScore <= STYLE_SCORE_LOW;

        final int tableResult;

        if (oneOfUsIsNotStylish) {
            tableResult = TABLE_RESULT_NO;
        } else if (oneOfUsIsStylish) {
            tableResult = TABLE_RESULT_YES;
        } else {
            tableResult = TABLE_RESULT_MAYBE;
        }

        return tableResult;
    }
}
