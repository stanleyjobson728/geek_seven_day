package com.demo.leetcode.solution;

/**
 * @Auther: ghost
 * @Date: 2019/11/19 13:42
 * @Description:  移动零
 */
public class Solution04 {

    public static void main(String[] args) {
        int[] arr = {0,0,0,3,12};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i + "  ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int val = nums[i];
                nums[i] = nums[n];
                nums[n] = val;
                n++;
            }
        }
    }
}
