package com.demo.leetcode.solution;

import java.util.HashMap;

/**
 * @Auther: ghost
 * @Date: 2019/11/19 14:39
 * @Description: 盛水最多的容器
 */
public class Solution05 {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
//        int[] arr = {1,2,1};
//        int[] arr = {1,2,4,3};
        int i = maxArea(arr);
        System.out.println(i);


        System.out.println(maxArea(arr));

        System.out.println(maxArea2My(arr));

    }


    public static int maxArea2My(int[] height) {
        int maxVal = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            int val = ( end - start) * Math.min(height[start], height[end]);
            maxVal = maxVal < val ? val : maxVal;
            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return maxVal;
    }

    public int maxArea2(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

    public static int maxArea(int[] height) {
        int maxVal = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > i; j--) {
                int w = j - i;
                int h = height[i] > height[j] ? height[j] : height[i];
                maxVal = Math.max(maxVal, w * h);

            }
        }
        return maxVal;
    }
}
