package io.thedevjournal.java.codingbat.array1;

import java.util.Optional;

public class Sum2 {

    public int sum2(final int[] nums) {

        final  int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        int sum = 0;

        for (int index = 0; index < numsNormalized.length && index < 2; index++) {
            sum = sum + numsNormalized[index];
        }

        return sum;
    }
}
