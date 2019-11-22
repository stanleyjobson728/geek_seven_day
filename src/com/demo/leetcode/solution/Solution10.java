package com.demo.leetcode.solution;

/**
 * @Auther: ghost
 * @Date: 2019/11/21 14:27
 * @Description: 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class Solution10 {

    public static void main(String[] args) {
        int[] arr4 = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate6(arr4, 3);
        for (int v : arr4) {
            System.out.println(v);
        }
    }



    public static void rotate6(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }


    /**
     * 环状替换
     * @param nums
     * @param k
     */
    public static void rotate5(int[] nums, int k) {
        int l = nums.length;
        int[] a = new int[l];
        for (int i  = 0 ; i<l ; i++){
            int num  = (i + k)% l; //首位置后移k位
            a[num] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }


    public static void rotate4(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = (i + k) % nums.length;
            a[num] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }

    /**
     * 创建数组 获取分割点 重新排列数据
     * @param nums
     * @param k
     */
    public static void rotate3(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int p = nums.length - k % nums.length;
        for (int i = 0; i < nums.length - p; i++) {
            arr[i] = nums[p + i];
        }
        int length = k % nums.length;
        for (int j = 0; j < p; j++) {
            arr[length + j] = nums[j];
        }
        for (int q = 0; q < nums.length; q++) {
            nums[q] = arr[q];
        }
    }


    public static void rotate2(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            //置换 每次把最后一位放置到最前
            int last = nums[nums.length - 1];
            int tmp;
            for (int j = 0; j < nums.length; j++) {
                tmp = nums[j];
                nums[j] = last;
                last = tmp;
            }
        }
    }


    public static void rotate1(int[] nums, int k) {
        int tmp;
        for (int i = 0; i < k; i++) {
            int last = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                tmp = nums[j];
                nums[j] = last;
                last = tmp;
            }
        }
    }


}
