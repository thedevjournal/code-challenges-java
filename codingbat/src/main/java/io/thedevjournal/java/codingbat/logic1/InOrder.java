package io.thedevjournal.java.codingbat.logic1;

public class InOrder {

    public boolean inOrder(final int number1, final int number2, final int number3, final boolean ignoreNumber2GreaterThanNumber1) {

        final boolean number2IsGreaterThanNumber1 = number2 > number1;
        final boolean number3IsGreaterThanNumber2 = number3 > number2;

        final boolean result;

        if (ignoreNumber2GreaterThanNumber1) {
            result = number3IsGreaterThanNumber2;
        } else {
            result = number2IsGreaterThanNumber1 && number3IsGreaterThanNumber2;
        }

        return result;
    }
}
