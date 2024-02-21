package io.thedevjournal.java.codingbat.array1;

import java.util.Optional;

public class Reverse3 {

    @SuppressWarnings("PMD.AvoidArrayLoops")
    public int[] reverse3(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        final int[] reversed = new int[numsNormalized.length];

        for (int index = 0; index < numsNormalized.length; index++) {
            reversed[index] = numsNormalized[numsNormalized.length - index - 1];
        }

        return reversed;
    }
}
