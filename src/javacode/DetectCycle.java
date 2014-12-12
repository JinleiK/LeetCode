package javacode;
import java.util.PriorityQueue;

import util.ListNode;


public class DetectCycle {
	
	public ListNode detectCyclev1(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        System.out.println(fast.val);
        while(fast != null && fast.next != null){
        	System.out.println(fast.val);
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)	break;
        }
        if(fast == null || fast.next == null){
        	System.out.println("aaa");
            return null;
            
        }
        ListNode node = head;
        while(slow != node){
            node = node.next;
            slow = slow.next;
        }
        return node;
    }
	
	public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while(fast != null && fast.next != null && fast != slow){
        	System.out.println(fast.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        // no cycle
        if(fast == null || fast.next == null){
        	System.out.println("aaa");
            return null;
        }
        ListNode cycleBegin = head;
        while(cycleBegin != slow){
            cycleBegin = cycleBegin.next;
            slow = slow.next;
        }
        return cycleBegin;
    }

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		DetectCycle dc = new DetectCycle();
		ListNode c = dc.detectCycle(a);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(6);
		pq.add(3);
		pq.add(8);
		pq.add(2);
		pq.add(1);
		pq.add(9);
		pq.poll();
		Integer[] arr = pq.toArray(new Integer[0]);
		for(Integer brr : arr)
			System.out.println(brr);
	}

}
