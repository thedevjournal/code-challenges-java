package io.thedevjournal.java.codingbat.array1;

import java.util.Optional;

public class CommonEnd {

    public boolean commonEnd(final int[] arrayA, final int[] arrayB) {
        final int[] arrayANormalized = Optional.ofNullable(arrayA).orElseGet(() -> new int[] {});
        final int[] arrayBNormalized = Optional.ofNullable(arrayB).orElseGet(() -> new int[] {});

        final int lengthA = arrayANormalized.length;
        final int lengthB = arrayBNormalized.length;

        return lengthA > 0 && lengthB > 0
                && (arrayANormalized[lengthA - 1] == arrayBNormalized[lengthB - 1]
                        || arrayANormalized[0] == arrayBNormalized[0]);
    }
}
