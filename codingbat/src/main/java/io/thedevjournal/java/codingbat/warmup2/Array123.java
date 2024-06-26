package io.thedevjournal.java.codingbat.warmup2;

import java.util.Arrays;
import java.util.Optional;

public final class Array123 {

    public boolean array123(final int[] input) {

        final int[] nums = Optional.ofNullable(input).orElseGet(() -> new int[] {});

        final StringBuilder inputStr = new StringBuilder();

        Arrays.stream(nums).forEach(inputStr::append);

        return inputStr.toString().contains("123");
    }
}
