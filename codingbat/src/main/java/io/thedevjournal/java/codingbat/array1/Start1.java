package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.ONE;

import java.util.Optional;

public class Start1 {

    public int start1(final int[] arrayA, final int[] arrayB) {

        final int[] aNormalized = Optional.ofNullable(arrayA).orElseGet(() -> new int[] {});
        final int[] bNormalized = Optional.ofNullable(arrayB).orElseGet(() -> new int[] {});

        int count = 0;

        if (aNormalized.length > 0 && aNormalized[0] == ONE) {
            count++;
        }

        if (bNormalized.length > 0 && bNormalized[0] == ONE) {
            count++;
        }

        return count;
    }
}
