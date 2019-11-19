package com.demo.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * 两数之和
 *
 * @Auther: ghost
 * @Date: 2019/11/19 11:26
 * @Description:
 */
class Solution01 {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] ints = twoSum(nums, target);
        System.out.println(ints);
    }


    public static int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            boolean tag = false;
            for (int j = l-1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    result.add(i);
                    result.add(j);
                    tag = true;
                    break;
                }
            }
            if(tag==true){
                break;
            }
        }

        Integer[] array = result.toArray(new Integer[result.size()]);//能正确运行
        for(int element:array){
            System.out.println(element);
        }
        int[] d = new int[result.size()];
        for(int i = 0;i<result.size();i++){
            d[i] = result.get(i);
        }
        return d;

        //   Map<Integer,Integer> p = new HashMap<>();
        //   for (int i = 0; i < nums.length; i++) {
        //         int mt = target - nums[i];
        //         if (p.containsKey(mt)) {
        //             int[] result = {p.get(target - nums[i]), i};
        //            return result;
        //         }
        //         p.put(nums[i], i);
        //     }
        // return null;
    }
}