package javacode;
import util.ListNode;


public class ReverseKGroup {
	
	public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k < 2){
            return head;
        }
        ListNode node = head;
        int len = 0;
        while(node != null){
            len ++;
            node = node.next;
        }
        if(len < k){
            return head;
        }
        
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode left = fakeHead;
        ListNode reversed = left.next;
        ListNode reversedTail = reversed;
        ListNode cur = reversed.next;
        int count = 0;
        while(len - count >= k){
            ListNode post = null;
            for(int i = 1; i < k; i ++){
                post = cur.next;
                cur.next = reversed;
                reversed = cur;
                cur = post;
            }
           
            left.next = reversed;
            reversedTail.next = post;
            left = reversedTail;
            reversed = post;
            reversedTail = post;
            if(post != null){
            cur = post.next;
            }
            count += k;
        }
        
        return fakeHead.next;
    }

	public static void main(String[] args) {
		ReverseKGroup rg = new ReverseKGroup();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		//d.next = new ListNode(5);
		ListNode n = rg.reverseKGroup(a, 2);
		while(n != null){
			System.out.println(n.val);
			n = n.next;
		}
	}

}
