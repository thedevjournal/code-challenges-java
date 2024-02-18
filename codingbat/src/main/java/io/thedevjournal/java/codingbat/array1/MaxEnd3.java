package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.ZERO;

import java.util.Optional;

public class MaxEnd3 {

    public int[] maxEnd3(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        if (numsNormalized.length > ZERO) {

            final int first = numsNormalized[0];
            final int last = numsNormalized[numsNormalized.length - 1];

            final int max = Math.max(first, last);

            final int[] result = new int[numsNormalized.length];

            for (int index = 0; index < result.length; index++) {
                result[index] = max;
            }

            return result;
        }

        return numsNormalized;
    }
}
