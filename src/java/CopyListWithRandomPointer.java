package java;
import util.RandomListNode;

public class CopyListWithRandomPointer {
	
	public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return null;
        RandomListNode cur = head;
        RandomListNode newHead = null;
        RandomListNode newCur = null;
        while(cur != null){
            newCur = new RandomListNode(cur.label);
            if(newHead == null)
                newHead = newCur;
            newCur.next = cur.next;
            cur.next = newCur;
            cur = newCur.next;
        }
        //copy random
        cur = head;
        while(cur != null){
        	if(cur.next == null)
        		System.out.println("dfd");
        	if(cur.random == null)
        		cur.next.random =null;
        	else
        		cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        //copy next
        cur = head;
        newCur = newHead;
        while(cur != null){
            cur.next = newCur.next; //restore the orig list
            newCur.next = (cur.next != null? cur.next.next : null);//copy
            cur = cur.next;
            newCur = newCur.next;
        }
        return newHead;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyListWithRandomPointer cl = new CopyListWithRandomPointer();
		RandomListNode a = new RandomListNode(-1);
		RandomListNode b = cl.copyRandomList(a);
		
	}

}
