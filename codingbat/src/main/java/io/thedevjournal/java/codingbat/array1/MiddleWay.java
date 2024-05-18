package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.TWO;

import java.util.Optional;

public class MiddleWay {

    public int[] middleWay(final int[] arrayA, final int[] arrayB) {

        final int[] arrayANormalized = Optional.ofNullable(arrayA).orElseGet(() -> new int[] {});
        final int[] arrayBNormalized = Optional.ofNullable(arrayB).orElseGet(() -> new int[] {});

        final int arrayALength = arrayANormalized.length;
        final boolean arrayALengthEven = arrayANormalized.length % TWO == 0;
        final int arrayBLength = arrayBNormalized.length;
        final boolean arrayBLengthEven = arrayBNormalized.length % TWO == 0;

        validate(arrayALength, arrayALengthEven, arrayBLength, arrayBLengthEven);

        if (arrayALength > 0 && arrayBLength > 0) {

            final int arrayAMiddle = arrayANormalized[arrayALength / TWO];
            final int arrayBMiddle = arrayBNormalized[arrayBLength / TWO];
            return new int[] { arrayAMiddle, arrayBMiddle };

        } else if (arrayALength > 0) {

            final int arrayAMiddle = arrayANormalized[arrayALength / TWO];
            return new int[] { arrayAMiddle };

        } else if (arrayBLength > 0) {

            final int arrayBMiddle = arrayBNormalized[arrayBLength / TWO];
            return new int[] { arrayBMiddle };

        } else {
            return new int[] {};
        }
    }

    private void validate(
            final int arrayALength,
            final boolean arrayALengthEven,
            final int arrayBLength,
            final boolean arrayBLengthEven) {

        final boolean isArrayAValid = arrayALength > 0 && arrayALengthEven;
        final boolean isArrayBValid = arrayBLength > 0 && arrayBLengthEven;

        if (isArrayAValid || isArrayBValid) {
            throw new IllegalArgumentException();
        }
    }
}
