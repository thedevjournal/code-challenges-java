package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.TEN;

import java.util.HashSet;
import java.util.Set;

public class ShareDigit {

    public boolean shareDigit(final int num1, final int num2) {

        final Set<Integer> num1Digits = getNum1Digits(num1);

        boolean commonDigit = false;

        int value = num2;

        while (value != 0) {

            final int lastDigit = value % TEN;

            if (num1Digits.contains(lastDigit)) {
                commonDigit = true;
                break;
            }

            value = value / 10;
        }

        return commonDigit;
    }

    private Set<Integer> getNum1Digits(final int num1) {

        final Set<Integer> digits = new HashSet<>(TEN);

        int value = num1;

        while (value != 0) {

            final int lastDigit = value % TEN;

            digits.add(lastDigit);

            value = value / TEN;
        }

        return digits;
    }
}
