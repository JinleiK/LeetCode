package javacode;
import util.ListNode;


public class DetectCycle {
	
	public ListNode detectCycle(ListNode head) {
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

	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		DetectCycle dc = new DetectCycle();
		ListNode c = dc.detectCycle(a);
		
	}

}
