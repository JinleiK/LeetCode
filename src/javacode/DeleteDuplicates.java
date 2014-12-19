package javacode;

import util.ListNode;

public class DeleteDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode fakeHead = new ListNode(Integer.MAX_VALUE);
        fakeHead.next = head;
        ListNode distinct = fakeHead;
        ListNode pre = head;
        ListNode cur = pre.next;
        while(cur != null){
            while(cur != null && cur.val == pre.val){
                pre = pre.next;
                cur = cur.next;
            }
            if(distinct.next == pre)
                distinct = pre;
            else
                distinct.next = cur;
            if(cur != null){   
                pre = cur;
                cur = cur.next;
            }
        }
        return fakeHead.next;
    }
}
