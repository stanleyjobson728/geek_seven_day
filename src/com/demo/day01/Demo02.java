package com.demo.day01;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 13:49
 * @Description:
 */
public class Demo02 {


    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int i = removeDuplicates(arr);
        System.out.println(i);
        for (int n : arr) {
            System.out.print(n);
        }
        System.out.println("");
        System.out.println("==============");

        int[] arr2 = {1, 1, 2};
        int i1 = removeDuplicates2(arr2);
        System.out.println(i1);
        for (int n : arr) {
            System.out.print(n);
        }
    }


    /**
     * 方法2 双指针  一前一后 匹配不同后段落移动
     */
    public static int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * 方法1  循环遍历 记录、 有相同移动到末尾。
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        if (n == 1) {
            return 1;
        }
        for (int j = 0; j < n - 1; ) {
            if (nums[j] != nums[j + 1]) {
                j++;
            } else {
                swapAfter(nums, j + 1);
                n--;
            }
            i = n;
        }
        return i;
    }

    /**
     * 复制指定位置
     *
     * @param nums
     * @param j
     */
    private static void swapAfter(int[] nums, int j) {
        for (int i = j; i < nums.length - 1; i++) {
            int tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
    }
}
