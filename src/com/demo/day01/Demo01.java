package com.demo.day01;

/**
 * @Auther: ghost
 * @Date: 2019/11/18 16:23
 * @Description:  day01
 */
public class Demo01 {

    public static void main(String[] args) {
        System.out.println("seven day works");
        int[] arr = {1,2,1};
        int i = removeDuplicates(arr);
         System.out.println(i);
        for(int n : arr){
            System.out.print(n);
        }
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
