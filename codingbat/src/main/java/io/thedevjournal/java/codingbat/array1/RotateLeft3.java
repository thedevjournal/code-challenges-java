package io.thedevjournal.java.codingbat.array1;

import java.util.Optional;

public class RotateLeft3 {

    @SuppressWarnings("PMD.AvoidArrayLoops")
    public int[] rotateLeft3(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        if (numsNormalized.length > 0) {

            final int first = numsNormalized[0];

            for (int index = 0; index < numsNormalized.length - 1; index++) {

                numsNormalized[index] = numsNormalized[index + 1];
            }

            numsNormalized[numsNormalized.length - 1] = first;
        }

        return numsNormalized;
    }
}
