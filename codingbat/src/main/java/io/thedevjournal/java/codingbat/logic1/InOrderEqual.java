package io.thedevjournal.java.codingbat.logic1;

public class InOrderEqual {

    public boolean inOrderEqual(final int num1, final int num2, final int num3, final boolean equalOk) {

        final boolean result;

        if (equalOk) {
            result = num1 <= num2 && num2 <= num3;
        } else {
            result = num1 < num2 && num2 < num3;
        }

        return result;
    }
}
