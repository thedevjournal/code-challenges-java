package io.thedevjournal.java.codingbat.logic1;

public class SumLimit {

    public int sumLimit(final int num1, final int num2) {

        final int sum = num1 + num2;

        final int num1Length = String.valueOf(num1).length();
        final int sumLength = String.valueOf(sum).length();

        return sumLength == num1Length ? sum : num1;
    }
}
