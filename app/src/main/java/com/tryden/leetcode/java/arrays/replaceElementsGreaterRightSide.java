package com.tryden.leetcode.java.arrays;

import java.util.Arrays;

public class replaceElementsGreaterRightSide {

    public static void main(String[] args) {
        int[] test = {17,18,5,4,6,1};
        replaceElements(test);
    }

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int tmp = arr[i];
            System.out.println("tmp = " + tmp);
            arr[i] = max;
            System.out.println("max = " + max);
            if (tmp > max) {
                max = tmp;
                System.out.println("max = tmp: " + max + " = " + tmp);
                System.out.println();
                System.out.println();
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
        return arr;
    }
}
