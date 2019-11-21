package com.demo.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ghost
 * @Date: 2019/11/20 20:39
 * @Description: 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 */
public class MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin();// --> 返回 -3.
        System.out.println(min);
        minStack.pop();
        int top = minStack.top();//--> 返回 0.
        System.out.println(top);
        int min1 = minStack.getMin();
        System.out.println(min1);
        //--> 返回 -2.
    }

    private static final int DEF_NUM = 10;

    List<Integer> list = new ArrayList(DEF_NUM);

    int num = 0;

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        list.add(x);
        num++;

    }

    public void pop() {
        list.get(list.size()-1);
        list.remove(list.size()-1);
        num--;
    }

    public int top() {
       return list.get(num-1);
    }

    public int getMin() {
        int minVal = list.get(0);
        for (int i = 1;i<list.size();i++){
            if(minVal>list.get(i)){
                minVal = list.get(i);
            }
        }
        return minVal;
    }
}
