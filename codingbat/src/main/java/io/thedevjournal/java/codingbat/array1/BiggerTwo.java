package io.thedevjournal.java.codingbat.array1;

import java.util.Arrays;
import java.util.Optional;

public class BiggerTwo {

    public int[] biggerTwo(final int[] arrayA, final int[] arrayB) {
        final int[] aNormalized = Optional.ofNullable(arrayA).orElseGet(() -> new int[] {});
        final int[] bNormalized = Optional.ofNullable(arrayB).orElseGet(() -> new int[] {});

        final int sumA = Arrays.stream(aNormalized).sum();
        final int sumB = Arrays.stream(bNormalized).sum();

        if (sumB > sumA) {
            return bNormalized.clone();
        } else {
            return aNormalized.clone();
        }
    }
}
