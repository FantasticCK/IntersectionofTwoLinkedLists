package com.CK;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode ptA = headA, ptB = headB;
        int rA = 0, rB = 0;
        while (true) {
            if (ptA == ptB) return ptA;
            if (ptA.next != null) ptA = ptA.next;
            else {
                if (rA == 0) {
                    ptA = headB;
                    rA++;
                } else break;
            }

            if (ptB.next != null) ptB = ptB.next;
            else {
                if (rB == 0) {
                    ptB = headA;
                    rB++;
                } else break;
            }

        }
        return null;
    }
}