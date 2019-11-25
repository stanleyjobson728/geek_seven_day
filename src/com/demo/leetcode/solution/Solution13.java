package com.demo.leetcode.solution;

import java.util.Arrays;

/**
 * @Auther: ghost
 * @Date: 2019/11/25 10:13
 * @Description: 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution13 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int[] ints = plusOne(arr);
        for (int i : ints) {
            System.out.print(i + "->");
        }

    }


    public static int[] plusOne(int[] digits) {
        int n = 0;
        int i = digits.length - 1;
        while (i - n >= 0) {
            if (digits[i - n] == 9) {
                digits[i - n] = 0;
                if (i - n <= 0) {
                    int[] arr = new int[digits.length + 1];
                    arr[0] = 1;
                    System.arraycopy(digits, 0, arr, 1, digits.length);
                    return arr;
                }
            } else {
                digits[i - n] = digits[i - n] + 1;
                break;
            }
            n++;
        }
        return digits;

    }
}
