package com.demo.leetcode.solution;

import java.util.*;

/**
 * @Auther: ghost
 * @Date: 2019/11/19 11:44
 * @Description:
 */
public class Solution02 {


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                int[] result = {map.get(num), i};
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }

}
