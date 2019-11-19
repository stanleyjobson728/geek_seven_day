package com.demo.leetcode.solution;

/**
 * @Auther: ghost
 * @Date: 2019/11/19 12:04
 * @Description:
 */
public class Solution03 {

    public static void main(String[] args) {
        int[] nums = {11, 7, 2, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }


    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int hashSize = 1;
        while (hashSize < length) {
            hashSize <<= 1;
        }
        int[] hashTable = new int[hashSize];
        int[] linkTable = new int[length];
        int hash = hashSize - 1;
        int delta = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] + nums[0] == target) {
                return new int[]{i, 0};
            }
            delta = target - nums[i];
            //hashtabel中存放等于hash值等于delta的index，遇到冲突则从linktable中查找
            int val = delta & hash;
            int p = hashTable[delta & hash];
            while (p != 0) {
                if (nums[p] == delta) {
                    return new int[]{i, p};
                }
                p = linkTable[p];
            }
            int key = nums[i] & hash;
            //将当前hashtable中冲突的index放入link表形成链
            linkTable[i] = hashTable[key];
            hashTable[key] = i;
        }
        return null;
    }
}
