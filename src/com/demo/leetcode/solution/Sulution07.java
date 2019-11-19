package com.demo.leetcode.solution;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Auther: ghost
 * @Date: 2019/11/19 18:07
 * @Description:
 */


//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//        有效字符串需满足：
//
//        左括号必须用相同类型的右括号闭合。
//        左括号必须以正确的顺序闭合。
//        注意空字符串可被认为是有效字符串。

public class Sulution07 {

    public static void main(String[] args) {
        String str = "]";
        boolean valid = isValid(str);
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character pop = stack.pop();
                if (!map.get(pop).equals(c)) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }


    /**
     * 堆栈实现
     */
    public class MyStack<T> {

        //计数器
        int num;
        //存储类型
        public T t;
        //下一个节点
        public MyStack next;

        public void push(MyStack stack) {
            this.next = stack;
        }


        public T pop() {
            return (T) next.t;
        }


    }
}


