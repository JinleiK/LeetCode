package javacode;

import util.ListNode;

public class InsertionSortList {
	
	public ListNode insertionSortListv1(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode mover = head.next;
        ListNode moverPre = head;
        ListNode chaser, chaserPre;
        while(mover != null){
            chaserPre = fakeHead;
            chaser = chaserPre.next;
            while(chaser != mover){
                if(chaser.val > mover.val){
                    moverPre.next = mover.next;
                    chaserPre.next = mover;
                    mover.next = chaser;
                    break;
                } else{
                    chaserPre = chaser;
                    chaser = chaser.next;
                }
            }
            if(chaser == mover){
                moverPre = mover;
            }
            mover = moverPre.next;
        }
        return fakeHead.next;
    }
	
	public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode sortedPre = fakeHead;
        ListNode sortedCur = head;
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur != null){
            while(sortedCur != cur && cur.val > sortedCur.val){
                sortedCur = sortedCur.next;
                sortedPre = sortedPre.next;
            }
            ListNode next = cur.next;
            if(sortedCur != cur){
                cur.next = sortedCur;
                sortedPre.next = cur;
                pre.next = next;
            } else pre = pre.next;
            cur = next;
            sortedPre = fakeHead;
            sortedCur = fakeHead.next;
        }
        return fakeHead.next;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSortList isl = new InsertionSortList();
		ListNode a = new ListNode(3);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(1);
		a.next = b; b.next = c;
		ListNode d = isl.insertionSortList(a);
		while(d != null){
			System.out.println(d.val);
			d = d.next;
		}
	}

}
