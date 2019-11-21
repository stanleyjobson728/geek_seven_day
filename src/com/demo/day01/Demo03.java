package com.demo.day01;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther: ghost
 * @Date: 2019/11/21 10:17
 * @Description: 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class Demo03 {


    public static void main(String[] args) {
//        System.out.println("==================");
//        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
//        rotate(arr, 3);
//        for (int v : arr) {
//            System.out.println(v);
//        }
//        System.out.println("==================");
//        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7};
//        rotate2(arr2, 3);
//        for (int v : arr2) {
//            System.out.println(v);
//        }
//        System.out.println("================");
//        int[] arr3 = new int[]{1, 2, 3, 4, 5, 6, 7};
//        rotate3(arr3, 3);
//        for (int v : arr3) {
//            System.out.println(v);
//        }
//        System.out.println("=====================");
        int[] arr4 = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate4(arr4,3);
        for (int v : arr4) {
            System.out.println(v);
        }
//        System.out.println("=====================");
//        int[] arr5 = new int[]{1, 2, 3, 4, 5, 6, 7};
//        rotate5(arr5,3);
//        for (int v : arr5) {
//            System.out.println(v);
//        }
//        System.out.println("=====================");
//        int[] arr6 = new int[]{1, 2, 3, 4, 5, 6, 7};
//        rotate6(arr6,3);
//        for (int v : arr6) {
//            System.out.println(v);
//        }
    }


    /**
     *  官方思路3 ：使用环状替换
     * @param nums
     * @param k
     */
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
     * 官方思路2
     * @param nums
     * @param k
     */
    public static void rotate5(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }





    /**
     * 官方思路1
     * @param nums
     * @param k
     */
    public static void rotate4(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }




    /**
     *  暴力循环  效率低
     * @param nums
     * @param k
     */
    public static void rotate3(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int[] ints = removeFirst(nums);
            for (int m = 0; m < nums.length; m++) {
                nums[m] = ints[m];
            }
        }
    }

    public static int[] removeFirst(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[nums.length - 1];
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1];
        }
        return result;
    }


    /**
     *
     */

    /**
     * 思路2  queue 解决  （问题效率低）
     */
    public static void rotate2(int[] nums, int k) {
        List<Integer> collect = Arrays.stream(nums).boxed().collect(Collectors.toList());
        LinkedList<Integer> queue = new LinkedList<>(collect);
        for (int i = 0; i < k; i++) {
            Integer last = queue.getLast();
            queue.addFirst(last);
            queue.removeLast();
        }
        Integer[] i = new Integer[queue.size()];
        queue.toArray(i);
        for (int n = 0; n < nums.length; n++) {
            nums[n] = queue.get(n);
        }
    }


    /**
     * 思路1 ：  转list  切割 拼接   转数组返回  (有bug  当前只能处理移动步数小于数组长度 )
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if (nums.length < k) {
            return;
        }

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        List<Integer> list1 = list.subList(0, nums.length - k);
        List<Integer> list2 = list.subList(nums.length - k, nums.length);
        List<Integer> result = new ArrayList<>();
        result.addAll(list2);
        result.addAll(list1);
        Integer[] i = new Integer[result.size()];
        result.toArray(i);
        for (int n = 0; n < nums.length; n++) {
            nums[n] = result.get(n);
        }
    }
}
