package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.codingbat.logic1.TeaParty.PARTY_BAD;
import static io.thedevjournal.java.codingbat.logic1.TeaParty.PARTY_GOOD;
import static io.thedevjournal.java.codingbat.logic1.TeaParty.PARTY_GREAT;
import static io.thedevjournal.java.common.NumberConstants.FIVE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.RandomValuesUtil.randomInteger;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TeaPartyTest {

    private TeaParty fixture;

    @BeforeEach
    void setUp() {
        fixture = new TeaParty();
    }

    @Test
    void shouldReturnGreat_WhenTeaAndCandyAreAtLeastTwiceOfEither() {

        final int tea1 = randomInteger();
        final int candy1 = tea1 * TWO;

        final int candy2 = randomInteger();
        final int tea2 = candy2 * TWO;

        final int expected = PARTY_GREAT;

        final int actual1 = fixture.teaParty(tea1, candy1);
        final int actual2 = fixture.teaParty(tea2, candy2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    void shouldReturnGood_WhenTeaAndCandyAreAtLeastFive() {

        final int tea = FIVE;
        final int candy = FIVE + 1;

        final int expected = PARTY_GOOD;

        final int actual = fixture.teaParty(tea, candy);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBad_WhenTeaAndCandyAreLessThanFive() {

        final int tea = FIVE - 1;
        final int candy = FIVE - 2;

        final int expected = PARTY_BAD;

        final int actual = fixture.teaParty(tea, candy);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBad_WhenTeaAndCandyAreLeastOneIsLessThanFive() {

        final int tea1 = FIVE - 1;
        final int tea2 = FIVE + 1;
        final int candy1 = FIVE + 1;
        final int candy2 = FIVE - 1;

        final int expected = PARTY_BAD;

        final int actual1 = fixture.teaParty(tea1, candy1);
        final int actual2 = fixture.teaParty(tea2, candy2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
