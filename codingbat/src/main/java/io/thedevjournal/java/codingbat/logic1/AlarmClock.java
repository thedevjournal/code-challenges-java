package io.thedevjournal.java.codingbat.logic1;

import static io.thedevjournal.java.common.NumberConstants.SIX;
import static io.thedevjournal.java.common.NumberConstants.ZERO;

public class AlarmClock {

    static final String ALARM_OFF = "off";

    static final String ALARM_7AM = "7:00";

    static final String ALARM_10AM = "10:00";

    public String alarmClock(final int day, final boolean vacation) {

        String alarm;

        if (vacation) {
            alarm = vacationAlarmStatus(day);
        } else {
            alarm = weekdayAlarmStatus(day);
        }

        return alarm;
    }

    private String vacationAlarmStatus(final int day) {

        String alarm;

        if (day == SIX || day == ZERO) {
            alarm = ALARM_OFF;
        } else {
            alarm = ALARM_10AM;
        }

        return alarm;
    }

    private String weekdayAlarmStatus(final int day) {

        String alarm;

        if (day == SIX || day == ZERO) {
            alarm = ALARM_10AM;
        } else {
            alarm = ALARM_7AM;
        }

        return alarm;
    }
}
