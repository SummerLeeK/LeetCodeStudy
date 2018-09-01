package com.study.lee.leetcodestudylib.java;

/**
 * 两数相加
 * Created by Administrator on 2018/8/30 0030.
 */

public class AddTwoNumber {

    public static void main(String[] args) {

        ListNode node1, node2, node3;
        node1 = new ListNode(2);
        node2 = new ListNode(4);
        node3 = new ListNode(3);
        node2.next = node3;
        node1.next = node2;
        ListNode node4, node5, node6;
        node4 = new ListNode(5);
        node5 = new ListNode(6);
        node6 = new ListNode(4);

        node5.next = node6;
        node4.next = node5;

        ListNode next1 = node1.next;
        ListNode next2 = node4.next;
        int first = (node1.val + node4.val);
        ListNode header = new ListNode(first % 10);


        int remain = first / 10;
        while (next1 != null || next2 != null || remain > 0) {
            int all = (next1 == null ? 0 : next1.val) + (next2 == null ? 0 : next2.val) + remain;
            ListNode cur = new ListNode(all % 10);
            remain = all / 10;
            ListNode point = header;
            while (point.next != null) {
                point = point.next;
            }
            point.next = cur;


            if (next1 != null) {
                next1 = next1.next;
            }


            if (next2 != null) {
                next2 = next2.next;
            }


//            if (next1.next != null || next2.next != null) {
//
//            } else {
//                break;
//            }

        }


        System.out.println("==========");
//        System.out.println(header.val);
        while (header != null) {
            System.out.println(header.val);
            header = header.next;
        }
        System.out.println("==========");
    }


}


class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
