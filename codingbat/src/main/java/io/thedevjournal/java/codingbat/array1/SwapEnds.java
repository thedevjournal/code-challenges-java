package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.TWO;

import java.util.Optional;

public class SwapEnds {

    public int[] swapEnds(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        final int[] result = numsNormalized.clone();

        if (result.length >= TWO) {

            final int temp = result[0];

            result[0] = result[result.length - 1];
            result[result.length - 1] = temp;
        }

        return result;
    }
}
