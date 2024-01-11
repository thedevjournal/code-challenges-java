package io.thedevjournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MonkeyTroubleTest {

    private MonkeyTrouble fixture;

    @BeforeEach
    void setUp() {
        fixture = new MonkeyTrouble();
    }

    static Stream<Arguments> monkeyTroubleTestParametersProvider() {
        return Stream.of(
            arguments(true, true, true),
            arguments(true, false, false),
            arguments(false, true, false),
            arguments(false, false, true)
        );
    }

    @DisplayName("areWeInTroubleWithMonkeys")
    @ParameterizedTest(name = "({0}) when MonkeyASmiling({1}) and MonkeyBSmiling({2})")
    @MethodSource("monkeyTroubleTestParametersProvider")
    void areWeInTroubleWithMonkeys(
            final boolean shouldBeInTrouble,
            final boolean monkeyASmiling,
            final boolean monkeyBSmiling) {

        final boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble).isEqualTo(areWeInTrouble);
    }
}
