package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.TWO;

import java.util.Optional;

public class MiddleThree {

    public int[] midThree(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        if (numsNormalized.length == 0) {
            return numsNormalized.clone();
        } else if (numsNormalized.length % TWO == 0) {
            throw new IllegalArgumentException();
        }

        final int mid = numsNormalized.length / TWO;
        final int left = mid - 1;
        final int right = mid + 1;

        return new int[] { numsNormalized[left], numsNormalized[mid], numsNormalized[right] };
    }
}
