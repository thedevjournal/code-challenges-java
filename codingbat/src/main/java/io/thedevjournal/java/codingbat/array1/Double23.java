package io.thedevjournal.java.codingbat.array1;

import java.util.Arrays;

public class Double23 {

    public boolean double23(final int[] nums) {

        if (nums == null || nums.length < 2) {
            return false;
        }

        final int count2 = (int) Arrays.stream(nums).filter(n -> n == 2).count();
        final int count3 = (int) Arrays.stream(nums).filter(n -> n == 3).count();

        return nums.length == count2 || nums.length == count3;
    }
}
