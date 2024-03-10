package io.thedevjournal.java.codingbat.logic1;

import java.util.HashSet;
import java.util.Set;

public class TwoAsOne {

    public boolean twoAsOne(final int number1, final int number2, final int number3) {
        return twoAsOneGeneric(number1, number2, number3);
    }

    private boolean twoAsOneGeneric(final int... numbers) {

        final Set<Integer> uniqueNumbers = new HashSet<>(numbers.length);
        final Set<Integer> sums = new HashSet<>(numbers.length);

        int index = 0;

        while (index < numbers.length - 1) {

            final Integer number = numbers[index];
            final Integer nextNumber = numbers[index + 1];

            uniqueNumbers.add(number);
            sums.add(number + nextNumber);

            index++;
        }

        final Integer firstValue = numbers[0];
        final Integer lastValue = numbers[numbers.length - 1];

        uniqueNumbers.add(lastValue);
        sums.add(firstValue + lastValue);

        return sums.stream().anyMatch(uniqueNumbers::contains);
    }
}
