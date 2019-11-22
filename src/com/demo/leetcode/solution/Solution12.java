package com.demo.leetcode.solution;

/**
 * @Auther: ghost
 * @Date: 2019/11/22 15:19
 * @Description: 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * <p>
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution12 {

    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 3, 3};
        int val = 3;
        int i = removeElement3(nums, val);
        System.out.println(i);
        System.out.println("============");
        for (int p = 0; p < nums.length; p++) {
            System.out.println(nums[p]);
        }
    }


    public static int removeElement4(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public static int removeElement3(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public static int removeElement2(int[] nums, int val) {
        int num = 0;
        int end = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                while (end > 1 && nums[end] == val) {
                    end--;
                }
                if (end < 0) {
                    return 0;
                }
                nums[i] = nums[end];
                end--;
                num++;
            }
        }
        return nums.length - num;
    }


    /**
     * 解法正确  官方 验证错误。 。官方顺序错误 不识别
     *
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length < 1) {
            return 0;
        }
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                boolean a = false;
                for (int j = i; j < nums.length - 1; j++) {
                    a = true;
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
                num++;
                if (i + num == nums.length) {
                    break;
                }
                if (a) {
                    i--;
                }
            }
        }
        return num != 0 ? num - 1 : num;
    }


}
