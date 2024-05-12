package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.NumberConstants.NINE;

import java.util.Arrays;
import java.util.Optional;

public final class ArrayCount9 {

    public int arrayCount9(final int[] nums) {

        final int[] input = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        return (int) Arrays.stream(input).filter(num -> num == NINE).count();
    }
}
