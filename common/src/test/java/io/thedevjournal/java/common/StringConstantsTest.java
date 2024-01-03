package io.thedevjournal.java.common;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING_SUPPLIER;
import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class StringConstantsTest {

    @Test
    void isEmpty_ReturnsTrue_WhenInputIsNull() {
        assertThat(StringConstants.isEmpty(null)).isTrue();
    }

    @Test
    void isEmpty_ReturnsTrue_WhenInputIsEmpty() {
        final String input = null;
        final boolean actual = StringConstants.isEmpty(Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER));
        assertThat(actual).isTrue();
    }

    @Test
    void isEmpty_ReturnsFalse_WhenInputIsNeitherNullNorEmpty() {
        assertThat(StringConstants.isEmpty(randomUUID().toString())).isFalse();
    }

    @Test
    void hasLength_ReturnsTrue_WhenInputIsNeitherNullNorEmpty() {
        assertThat(StringConstants.hasLength(randomUUID().toString())).isTrue();
    }

    @Test
    void hasLength_ReturnsFalse_WhenInputIsNull() {
        assertThat(StringConstants.hasLength(null)).isFalse();
    }

    @Test
    void hasLength_ReturnsFalse_WhenInputIsEmpty() {
        assertThat(StringConstants.hasLength(EMPTY_STRING)).isFalse();
    }
}
