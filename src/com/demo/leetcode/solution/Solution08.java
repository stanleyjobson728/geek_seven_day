package com.demo.leetcode.solution;

import java.util.Arrays;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 10:13
 * @Description: 思路 遍历前移 每次有重复 把该元素置换到最后一位  bug：记录重复数字数量有问题。
 * <p>
 * 思路2 双指针。 first 指针从第i位和   last 指针 从i+1位置开始 如果相同last后移在比较
 * 直到 first 不等于last  吧last移动到 first +1 位置 之后 first 指向last last++
 */
public class Solution08 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};
        int i = removeDuplicates2(arr);
        System.out.println(i);
        for (int t : arr) {
            System.out.print(t + " _  ");
        }
        System.out.println("");
        System.out.println("===================================");
        int i1 = removeDuplicates3(arr);
        System.out.println(i1);


    }



    /**
     * 思路2  双指针
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i]!= nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    /**
     * 官方思路
     * @param nums
     * @return
     */
    public static int removeDuplicates3(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    /**
     * 思路1  遍历 前移
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int num = 0;
        int o = 0;
        for (int i = 0; i < nums.length - 1; ) {
            if (o > nums.length || nums.length == 2 && nums[0] == nums[1]) {
                return 1;
            }
            if (nums[i] == nums[i + 1] && (i + 1 < nums.length - 1)) {
                if (nums.length == 2) {
                    return 1;
                }
                num++;
                o++;
                swapAfter(nums, i + 1, i);
            } else {
                i++;
            }
        }
        if (o == 0 && nums.length > 2) {
            if (nums[nums.length - 1] == nums[nums.length - 2]) {
                return nums.length - 1;
            }
            return nums.length;
        }
        num = num < 2 ? 2 : num;
        nums = Arrays.copyOf(nums, num - 1);
        return num;
    }

    /**
     * 复制指定位置
     *
     * @param nums
     * @param j
     */
    private static void swapAfter(int[] nums, int j, int k) {
        for (int i = k; i < nums.length - j; i++) {
            int tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
    }
}
