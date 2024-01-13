package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StartHiTest {

    private StartHi fixture;

    @BeforeEach
    void setUp() {
        fixture = new StartHi();
    }

    @Test
    void shouldReturnTrue_WhenStartsWithHi() {

        final String str = "hi there";
        final boolean expected = true;
        final boolean actual = fixture.startHi(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnTrue_WhenDoesntStartsWithHi() {

        final String str = "hello";
        final boolean expected = false;
        final boolean actual = fixture.startHi(str);

        assertThat(actual).isEqualTo(expected);
    }
}
