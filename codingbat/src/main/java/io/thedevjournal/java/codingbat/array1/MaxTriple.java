package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.NumberConstants.ZERO;

import java.util.Optional;

public class MaxTriple {

    public int maxTriple(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        if (numsNormalized.length % TWO == ZERO) {
            throw new IllegalArgumentException();
        }

        int max;

        if (numsNormalized.length == ONE) {
            max = numsNormalized[0];
        } else {
            final int first = numsNormalized[0];
            final int middle = numsNormalized[numsNormalized.length / TWO];
            final int last = numsNormalized[numsNormalized.length - 1];

            max = Math.max(first, Math.max(middle, last));
        }

        return max;
    }
}
