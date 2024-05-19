package io.thedevjournal.java.common;

import java.util.List;
import java.util.UUID;

public final class RandomValuesUtil {

    static final int DEFAULT_LIMIT = 1000;

    public static String randomString() {
        return UUID.randomUUID().toString();
    }

    public static Integer randomInteger() {
        return randomInteger(DEFAULT_LIMIT);
    }

    public static Integer randomInteger(final int limit) {
        return randomDouble(limit).intValue();
    }

    public static Long randomLong() {
        return randomLong(DEFAULT_LIMIT);
    }

    public static Long randomLong(final int limit) {
        return randomInteger(limit).longValue();
    }

    public static Double randomDouble() {
        return randomDouble(DEFAULT_LIMIT);
    }

    public static Double randomDouble(final int limit) {
        return Math.random() * limit;
    }

    public static boolean randomFlag() {
        return Math.random() > 0.5;
    }

    public static <T> T randomElement(final T[] array) {
        return array[randomInteger(array.length)];
    }

    public static <T> T randomElement(final List<T> list) {
        final int index = randomInteger(list.size());
        return list.get(index);
    }

    private RandomValuesUtil() {
    }
}
