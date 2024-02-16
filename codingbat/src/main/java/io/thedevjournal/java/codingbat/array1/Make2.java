package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.TWO;

import java.util.Optional;

public class Make2 {

    public int[] make2(final int[] arrayA, final int[] arrayB) {

        final int[] aNormalized = Optional.ofNullable(arrayA).orElseGet(() -> new int[] {});
        final int[] bNormalized = Optional.ofNullable(arrayB).orElseGet(() -> new int[] {});

        final int[] merged = new int[aNormalized.length + bNormalized.length];

        int count = 0;

        for (final int index : aNormalized) {
            merged[count++] = index;
        }

        for (final int index : bNormalized) {
            merged[count++] = index;
        }

        if (merged.length <= TWO) {
            return merged.clone();
        } else {
            return new int[] { merged[0], merged[1] };
        }
    }
}
