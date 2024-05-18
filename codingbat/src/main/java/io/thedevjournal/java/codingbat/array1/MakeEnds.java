package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.NumberConstants.ZERO;

import java.util.Optional;

public class MakeEnds {

    public int[] makeEnds(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        if (numsNormalized.length == ZERO) {
            return new int[] {};
        } else if (numsNormalized.length == ONE) {
            return new int[] { numsNormalized[0], numsNormalized[0] };
        } else if (numsNormalized.length == TWO) {
            return numsNormalized.clone();
        } else {
            return new int[] { numsNormalized[0], numsNormalized[numsNormalized.length - 1] };
        }
    }
}
