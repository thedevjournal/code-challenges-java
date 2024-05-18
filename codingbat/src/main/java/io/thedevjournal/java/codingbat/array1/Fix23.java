package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWO;

import java.util.Optional;

public class Fix23 {

    public int[] fix23(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        if (numsNormalized.length <= ONE) {
            return numsNormalized.clone();
        }

        final int[] result = numsNormalized.clone();

        int index = 0;
        int indexPlusOne = ONE;

        while (index < result.length - ONE) {

            final int current = result[index];
            final int next = result[indexPlusOne];

            if (current == TWO && next == THREE) {
                result[indexPlusOne] = 0;
                index++;
            }

            index++;
            indexPlusOne = index + 1;
        }

        return result;
    }
}
