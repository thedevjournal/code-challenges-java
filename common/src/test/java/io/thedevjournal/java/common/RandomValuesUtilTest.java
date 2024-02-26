package io.thedevjournal.java.common;

import static io.thedevjournal.java.common.RandomValuesUtil.DEFAULT_LIMIT;
import static io.thedevjournal.java.common.RandomValuesUtil.randomDouble;
import static io.thedevjournal.java.common.RandomValuesUtil.randomElement;
import static io.thedevjournal.java.common.RandomValuesUtil.randomFlag;
import static io.thedevjournal.java.common.RandomValuesUtil.randomInteger;
import static io.thedevjournal.java.common.RandomValuesUtil.randomLong;
import static io.thedevjournal.java.common.RandomValuesUtil.randomString;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class RandomValuesUtilTest {

    @Test
    void randomString_ReturnsNonEmptyString() {
        assertThat(randomString()).isNotEmpty();
    }

    @Test
    void randomInteger_ReturnsIntegerInDefaultLimit() {
        assertThat(randomInteger()).isGreaterThan(0).isLessThan(DEFAULT_LIMIT);
    }

    @Test
    void randomInteger_ReturnsIntegerInDefinedLimit() {
        final int limit = randomInteger();
        assertThat(randomInteger(limit)).isGreaterThan(0).isLessThan(limit);
    }

    @Test
    void randomLong_ReturnsIntegerInDefaultLimit() {
        assertThat(randomLong()).isGreaterThan(0).isLessThan(DEFAULT_LIMIT);
    }

    @Test
    void randomLong_ReturnsIntegerInDefinedLimit() {
        final int limit = randomInteger();
        assertThat(randomLong(limit)).isGreaterThan(0).isLessThan(limit);
    }

    @Test
    void randomDouble_ReturnsIntegerInDefaultLimit() {
        assertThat(randomDouble()).isGreaterThan(0).isLessThan(DEFAULT_LIMIT);
    }

    @Test
    void randomDouble_ReturnsIntegerInDefinedLimit() {
        final int limit = randomInteger();
        assertThat(randomDouble(limit)).isGreaterThan(0).isLessThan(limit);
    }

    @Test
    void randomFlag_ReturnsRandomBooleanValue() {

        final boolean actual = randomFlag();

        final boolean assertValue = actual == true || actual == false;

        assertThat(assertValue).isTrue();
    }

    @Test
    void randomElement_ReturnsElementInIntegerArray() {

        final Integer[] array = { randomInteger(), randomInteger(), randomInteger() };

        final Integer actual = randomElement(array);

        assertThat(array).contains(actual);
    }

    @Test
    void randomElement_ReturnsElementInStringArray() {

        final String[] array = { randomString(), randomString(), randomString() };

        final String actual = randomElement(array);

        assertThat(array).contains(actual);
    }

    @Test
    void randomElement_ReturnsElementInIntegerList() {

        final List<Integer> list = Arrays.asList(randomInteger(), randomInteger(), randomInteger());

        final Integer actual = randomElement(list);

        assertThat(list).contains(actual);
    }

    @Test
    void randomElement_ReturnsElementInStringList() {

        final List<String> list = Arrays.asList(randomString(), randomString(), randomString());

        final String actual = randomElement(list);

        assertThat(list).contains(actual);
    }
}
