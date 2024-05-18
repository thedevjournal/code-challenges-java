package io.thedevjournal.java.codingbat.array1;

import java.util.Optional;

public class MakeLast {

    public int[] makeLast(final int[] nums) {
        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        if (numsNormalized.length > 0) {

            final int[] result = new int[numsNormalized.length * 2];

            result[result.length - 1] = numsNormalized[numsNormalized.length - 1];

            return result;
        }

        return new int[] {};
    }
}
