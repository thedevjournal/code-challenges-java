package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWO;

import java.util.Arrays;
import java.util.Optional;

public class Has23 {

    public boolean has23(final int[] nums) {
        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        return Arrays.stream(numsNormalized)
                     .filter(it -> it == TWO || it == THREE)
                     .count() > 0;
    }
}
