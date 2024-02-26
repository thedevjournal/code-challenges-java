package io.thedevjournal.java.codingbat.logic1;

public class AnswerCell {

    public boolean answerCell(final boolean isMorning, boolean isMom, boolean isAsleep) {

        boolean result = true;

        if (isAsleep) {
            result = false;
        } else if (isMorning && !isMom) {
            result = false;
        }

        return result;
    }
}
