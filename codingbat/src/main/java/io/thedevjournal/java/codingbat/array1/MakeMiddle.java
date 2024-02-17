package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.TWO;
import static io.thedevjournal.java.common.NumberConstants.ZERO;

import java.util.Optional;

public class MakeMiddle {

    public int[] makeMiddle(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        if (numsNormalized.length == ZERO) {
            return new int[] {};
        } else if (numsNormalized.length % TWO == ONE) {
            throw new IllegalArgumentException();
        }

        final int midLeft = (numsNormalized.length / TWO) - ONE;
        final int midRight = midLeft + ONE;

        return new int[] { numsNormalized[midLeft], numsNormalized[midRight] };
    }
}
