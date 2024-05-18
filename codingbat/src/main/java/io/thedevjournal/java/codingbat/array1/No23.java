package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWO;

import java.util.Arrays;
import java.util.Optional;

public class No23 {

    public boolean no23(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        boolean result = false;

        if (numsNormalized.length > 0) {
            result = Arrays.stream(numsNormalized)
                           .filter(it -> it == TWO || it == THREE)
                           .count() == 0;
        }

        return result;
    }
}
