package io.thedevjournal.java.codingbat.array1;

import static io.thedevjournal.java.common.NumberConstants.ONE;
import static io.thedevjournal.java.common.NumberConstants.THREE;
import static io.thedevjournal.java.common.NumberConstants.TWO;

import java.util.Optional;
import java.util.function.Predicate;

import lombok.Getter;
import lombok.Setter;

public class Unlucky1 {

    public boolean unlucky1(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        final int numsLength = numsNormalized.length;

        if (numsLength < TWO) {
            return false;
        }

        int index = 0;
        int indexPlusOne = index + 1;

        boolean result = false;

        while (index < numsLength - 1) {

            @SuppressWarnings("PMD.AvoidInstantiatingObjectsInLoops")
            final Values value = new Values();

            value.setArrayLength(numsLength);
            value.setCurrentPosition(index);
            value.setCurrentValue(numsNormalized[index]);
            value.setNextValue(numsNormalized[indexPlusOne]);

            if (isUnlucky1Predicate().test(value)) {
                result = true;
                break;
            }

            index++;
            indexPlusOne++;
        }

        return result;
    }

    public boolean unlucky1NonPredicate(final int[] nums) {

        final int[] numsNormalized = Optional.ofNullable(nums).orElseGet(() -> new int[] {});

        final int numsLength = numsNormalized.length;

        if (numsLength < TWO) {
            return false;
        }

        int index = 0;
        int indexPlusOne = index + 1;

        boolean result = false;

        while (index < numsLength - 1) {

            if ((index < 2 || index >= numsLength - TWO)
                    && numsNormalized[index] == ONE && numsNormalized[indexPlusOne] == THREE) {
                result = true;
                break;
            }

            index++;
            indexPlusOne++;
        }

        return result;
    }

    private Predicate<Values> isUnlucky1Predicate() {
        return it -> (it.getCurrentPosition() < TWO || it.getCurrentPosition() >= it.getArrayLength() - TWO)
                && it.getCurrentValue() == ONE && it.getNextValue() == THREE;
    }

    @Getter
    @Setter
    private static final class Values {

        private int currentPosition;

        private int currentValue;

        private int nextValue;

        private int arrayLength;
    }
}
