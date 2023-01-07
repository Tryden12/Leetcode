package com.tryden.leetcode.java.arrays;

public class validMountainArray {

    public boolean validMountainArray(int[] arr) {
        int i=0,j=arr.length-1;     //i forward pointer ,j backward
        while(i<j&&arr[i]<arr[i+1])  i++;    //increase i until the next value is decreased
        while(j>0&&arr[j-1]>arr[j]) j--;    //decrease j until the next value is decreased from back
        return i>0&&j<arr.length-1&&i==j;   //return if i and j are equal
    }
}
