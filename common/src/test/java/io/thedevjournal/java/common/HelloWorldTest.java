package io.thedevjournal.java.common;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

    private final HelloWorld fixture = new HelloWorld();

    @Test
    void say_ReturnsHello() {
        assertThat(fixture.say()).isEqualTo("hello");
    }
}
