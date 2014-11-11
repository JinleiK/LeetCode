package javacode;
import util.ListNode;


public class PartitionList {
	
	public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode lessTail = fakeHead;
        if(head.val < x){
            lessTail = head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val < x){
            	if(lessTail != pre){
            		pre.next = cur.next;
            		cur.next = lessTail.next;
            		lessTail.next = cur;
            		cur = pre.next;
            	} else{
            		pre = pre.next;
            		cur = cur.next;
            	}
                lessTail = lessTail.next;
            } else{
                pre = pre.next;
                cur = cur.next;
            }
            
        }
        return fakeHead.next;
    }

	public static void main(String[] args) {
		PartitionList pl = new PartitionList();
		ListNode a = new ListNode(1); 
		ListNode b = new ListNode(4); 
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(2);
		ListNode e = new ListNode(5); 
		ListNode f = new ListNode(2); 
		ListNode g = new ListNode(1);
//		a.next = b;
//		b.next = c;
//		c.next = d;
//		d.next = e;
//		e.next = f;
		a.next = c;
		c.next = d;
		int x = 3;
		ListNode n = pl.partition(a, x);
		while(n != null){
			System.out.println(n.val);
			n = n.next;
		}
	}

}
