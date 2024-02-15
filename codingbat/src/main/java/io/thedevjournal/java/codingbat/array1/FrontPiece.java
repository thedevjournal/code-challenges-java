package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.TWO;

import java.util.Optional;

public class FrontPiece {

    public int[] frontPiece(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        if (numsNormalized.length <= TWO) {
            return numsNormalized.clone();
        } else {
            return new int[] { numsNormalized[0], numsNormalized[1] };
        }
    }
}
