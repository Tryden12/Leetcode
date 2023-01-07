package com.tryden.leetcode.java.arrays;

public class NandDoubleExist {
    public boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == 2*arr[i] && i != j) {
                    return  true;
                }
            }
        }

        return false;
    }


    /*
    //Hash Set:
    Set<Integer> set = new HashSet();
        for (int n : arr) {
            if (set.contains(2*n) || (n%2 == 0 && set.contains(n/2))) {
                return true;
            }
            set.add(n);
        }
        return false;
     */
}
