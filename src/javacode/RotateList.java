package javacode;

import util.ListNode;

public class RotateList {
	// using cycle O(n)
	public ListNode rotateRight1(ListNode head, int n) {
        if(head == null || head.next == null)
            return head;
        ListNode node = head;
        int len = 1;
        while(node.next != null){
            node = node.next;
            len ++;
        }
        n = n % len;
        node.next = head;
        ListNode pre = node;
        for(int i = 0; i < len - n; i ++){
            pre = pre.next;
        }
        ListNode newHead = pre.next;
        pre.next = null;
        return newHead;
    }
}
