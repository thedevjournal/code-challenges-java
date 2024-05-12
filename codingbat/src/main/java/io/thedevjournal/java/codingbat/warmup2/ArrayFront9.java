package io.thedevjournal.java.codingbat.warmup2;

import static io.thedevjournal.java.common.NumberConstants.FOUR;
import static io.thedevjournal.java.common.NumberConstants.NINE;

import java.util.Optional;

public final class ArrayFront9 {

    public boolean arrayFront9(final int[] nums) {

        boolean result = false;

        final int[] input = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        final int loopCounter = input.length <= FOUR ? input.length : FOUR;

        for (int index = 0; index < loopCounter; index++) {
            if (input[index] == NINE) {
                result = true;
                break;
            }
        }

        return result;
    }
}
