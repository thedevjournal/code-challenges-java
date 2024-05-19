package io.thedevjournal.java.codingbat.logic1;

public class AnswerCell {

    public boolean answerCell(final boolean isMorning, final boolean isMom, final boolean isAsleep) {

        boolean result = true;

        if (isAsleep) {
            result = false;
        } else if (isMorning && !isMom) {
            result = false;
        }

        return result;
    }
}
