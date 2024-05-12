package io.thedevjournal.java.codingbat.string1;

import static io.thedevjournal.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloNameTest {

    private HelloName fixture;

    @BeforeEach
    void setUp() {
        fixture = new HelloName();
    }

    @Test
    void shouldReturnHello_WhenNameIsNull() {

        final String name = null;

        final String expected = "Hello!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnHello_WhenNameIsEmpty() {

        final String name = EMPTY_STRING;

        final String expected = "Hello!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnGreeting_WhenNameIsNotEmpty1() {

        final String name = "Bob";

        final String expected = "Hello Bob!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnGreeting_WhenNameIsNotEmpty2() {

        final String name = "X";

        final String expected = "Hello X!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnGreeting_WhenNameIsNotEmpty3() {

        final String name = "Alice";

        final String expected = "Hello Alice!";

        final String actual = fixture.helloName(name);

        assertThat(actual).isEqualTo(expected);
    }
}
