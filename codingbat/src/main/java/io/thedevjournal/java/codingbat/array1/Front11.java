package io.thedevjournal.java.codingbat.array1;

import java.util.Optional;

public class Front11 {

    public int[] front11(final int[] arrayA, final int[] arrayB) {

        final int[] aNormalized = Optional.ofNullable(arrayA).orElseGet(() -> new int[] {});
        final int[] bNormalized = Optional.ofNullable(arrayB).orElseGet(() -> new int[] {});

        if (aNormalized.length > 0 && bNormalized.length > 0) {
            return new int[] { aNormalized[0], bNormalized[0] };
        } else if (aNormalized.length > 0) {
            return new int[] { aNormalized[0] };
        } else if (bNormalized.length > 0) {
            return new int[] { bNormalized[0] };
        } else {
            return new int[] {};
        }
    }
}
