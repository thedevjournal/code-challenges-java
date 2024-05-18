package io.thedevjournal.java.codingbat.array1;

import java.util.Optional;

public class SameFirstLast {

    public boolean sameFirstLast(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        return numsNormalized.length > 0 && numsNormalized[0] == numsNormalized[numsNormalized.length - 1];
    }
}
