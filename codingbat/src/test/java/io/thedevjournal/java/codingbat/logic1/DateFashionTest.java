package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.codingbat.logic1.DateFashion.STYLE_SCORE_HIGH;
import static io.thedevjournal.java.codingbat.logic1.DateFashion.STYLE_SCORE_LOW;
import static io.thedevjournal.java.codingbat.logic1.DateFashion.TABLE_RESULT_MAYBE;
import static io.thedevjournal.java.codingbat.logic1.DateFashion.TABLE_RESULT_NO;
import static io.thedevjournal.java.codingbat.logic1.DateFashion.TABLE_RESULT_YES;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateFashionTest {

    private DateFashion fixture;

    @BeforeEach
    void setUp() {
        fixture = new DateFashion();
    }

    @Test
    void shouldReturnTableResultNo_WhenBothAreNotStylish() {

        final int youStyleScore = STYLE_SCORE_LOW;
        final int dateStyleScore = STYLE_SCORE_LOW - 1;

        final int expected = TABLE_RESULT_NO;

        final int actual = fixture.dateFashion(youStyleScore, dateStyleScore);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTableResultNo_WhenOneOfUsIsStylishAndOtherIsNot() {

        final int youStyleScore1 = STYLE_SCORE_HIGH;
        final int youStyleScore2 = STYLE_SCORE_LOW;
        final int dateStyleScore1 = STYLE_SCORE_LOW;
        final int dateStyleScore2 = STYLE_SCORE_HIGH;

        final int expected = TABLE_RESULT_NO;

        final int actual1 = fixture.dateFashion(youStyleScore1, dateStyleScore1);
        final int actual2 = fixture.dateFashion(youStyleScore2, dateStyleScore2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnTableResultMaybe_WhenOurStyleScoreIsNeitherHighNeitherLow() {

        final int youStyleScore1 = STYLE_SCORE_LOW + 1;
        final int youStyleScore2 = STYLE_SCORE_HIGH - 1;
        final int dateStyleScore1 = STYLE_SCORE_HIGH - 1;
        final int dateStyleScore2 = STYLE_SCORE_LOW + 1;

        final int expected = TABLE_RESULT_MAYBE;

        final int actual1 = fixture.dateFashion(youStyleScore1, dateStyleScore1);
        final int actual2 = fixture.dateFashion(youStyleScore2, dateStyleScore2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturn2_WhenWeAreStylish() {

        final int youStyleScore1 = STYLE_SCORE_HIGH;
        final int youStyleScore2 = STYLE_SCORE_LOW + 1;
        final int dateStyleScore1 = STYLE_SCORE_LOW + 1;
        final int dateStyleScore2 = STYLE_SCORE_HIGH + 1;

        final int expected = TABLE_RESULT_YES;

        final int actual1 = fixture.dateFashion(youStyleScore1, dateStyleScore1);
        final int actual2 = fixture.dateFashion(youStyleScore2, dateStyleScore2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
