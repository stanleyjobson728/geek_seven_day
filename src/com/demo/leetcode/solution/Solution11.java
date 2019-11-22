package com.demo.leetcode.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Auther: ghost
 * @Date: 2019/11/22 10:30
 * @Description: 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Solution11 {

    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode03 = new ListNode(4);
        ListNode listNode02 = new ListNode(3);
        ListNode listNode01 = new ListNode(1);
        listNode01.next = listNode02;
        listNode02.next = listNode03;


//        ListNode listNode7 = new ListNode(-10);
//        ListNode listNode6 = new ListNode(-10);
//        ListNode listNode5 = new ListNode(-9);
//        ListNode listNode4 = new ListNode(-4);
//        ListNode listNode3 = new ListNode(1);
//        ListNode listNode2 = new ListNode(6);
//        ListNode listNode1 = new ListNode(6);
//        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;

//        ListNode listNode01 = new ListNode(-7);

        ListNode listNode = mergeTwoLists3(listNode1, listNode01);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }


    public static ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }

    /**
     * 思路2  遍历一个插入另外一个
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode sec = l2;
        ListNode beforeNode = null;
        while (sec != null) {
            while (first != null) {
                if (sec.val <= first.val) {
                    if(beforeNode!=null){
                        beforeNode.next = sec;
                        sec.next = first;
                        beforeNode = first;
                    }else{
                        sec.next = first;
                        beforeNode = first.next;
                    }
                    break;
                }
                beforeNode = first;
                first = first.next;
            }
            sec = sec.next;
        }
        return l1;
    }

    /**
     * 执行用时 :
     * 4 ms
     * , 在所有 java 提交中击败了
     * 16.05%
     * 的用户
     * 内存消耗 :
     * 37.7 MB
     * , 在所有 java 提交中击败了
     * 75.38%
     * 的用户
     * <p>
     * 思路1 暴力方法
     * 遍历  放list  排序  输出
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            if (l2 == null) {
                return null;
            } else {
                return l2;
            }
        }
        ListNode result;
        List<ListNode> listAdd = new ArrayList<>();
        List<ListNode> list1 = new ArrayList<>();
        List<ListNode> list2 = new ArrayList<>();
        ListNode tmp1 = l1;
        while (tmp1 != null) {
            list1.add(tmp1);
            tmp1 = tmp1.next;
        }
        ListNode tmp2 = l2;
        while (tmp2 != null) {
            list2.add(tmp2);
            tmp2 = tmp2.next;
        }
        listAdd.addAll(list1);
        listAdd.addAll(list2);
        listAdd.sort(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val > o2.val) {
                    return 1;
                } else if (o1.val < o2.val) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        result = listAdd.get(0);
        ListNode listNode = listAdd.get(listAdd.size());
        listNode.next = null;
        ListNode tmp = result;
        for (int i = 1; i < listAdd.size(); i++) {
            tmp.next = listAdd.get(i);
            tmp = listAdd.get(i);
        }
        return result;
    }


}
