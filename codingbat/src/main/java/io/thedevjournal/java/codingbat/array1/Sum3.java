package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.THREE;

import java.util.Arrays;
import java.util.Optional;

public class Sum3 {

    public int sum3(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        return Arrays.stream(numsNormalized).limit(THREE).sum();
    }
}
