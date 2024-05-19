package io.thedevjournal.java.codingbat.logic1;

public class SpecialEleven {

    private static final int ELEVEN = 11;

    public boolean specialEleven(final int number) {

        final int remainder = number % ELEVEN;

        return remainder == 0 || remainder == 1;
    }
}
