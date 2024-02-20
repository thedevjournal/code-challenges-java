package io.thedevjournal.java.codingbat.array1;

import java.util.Optional;

public class PlusTwo {

    public int[] plusTwo(final int[] arrayA, final int[] arrayB) {

        final int[] aNormazlized = Optional.ofNullable(arrayA).orElseGet(() -> new int[] {});
        final int[] bNormazlized = Optional.ofNullable(arrayB).orElseGet(() -> new int[] {});

        final int[] merged = new int[aNormazlized.length + bNormazlized.length];

        int count = 0;

        for (final int value : aNormazlized) {
            merged[count++] = value;
        }

        for (final int value : bNormazlized) {
            merged[count++] = value;
        }

        return merged;
    }
}
