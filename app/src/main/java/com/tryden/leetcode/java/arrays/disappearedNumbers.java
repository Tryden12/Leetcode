package com.tryden.leetcode.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class disappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 2, 2, 2, 8};
        findDisappearedNumbers(nums);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<Integer>();
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (!Arrays.asList(nums).contains(i)) {
                missingNumbers.add(i);
            }
        }
        

        return missingNumbers;
    }
}

/*

                System.out.println(nums[i]);
                int tmp = nums[i] - nums[i-1];
                System.out.println("tmp = " + tmp);

                for (int j = tmp; j < nums[i]; j++) {
                    System.out.println("tmp = " + tmp);
                    System.out.println("nums[i] = " + nums[i]);
                    System.out.println("i = " + i);
                    System.out.println("j = " + j);
                    if (!Arrays.asList(nums).contains(j)) {
                        theNumbers.add(j);
                    }

                }



 */
