package io.thedevjournal.java.codingbat.array1;

import java.util.Optional;

public class FirstLast6 {

    public boolean firstLast6(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        return numsNormalized.length > 0 && (numsNormalized[0] == 6 || numsNormalized[numsNormalized.length - 1] == 6);
    }
}
