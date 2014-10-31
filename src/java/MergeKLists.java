package java;
import java.util.ArrayList;
import java.util.List;

import util.ListNode;


public class MergeKLists {
	 
	 public ListNode mergeKLists(List<ListNode> lists) {
	        ListNode fakeHead = new ListNode(0);
	        if(lists == null || lists.size() < 1){
	            return null;
	        }
	        int len = lists.size();
	        if(len == 1){
	            return lists.get(0);
	        }
	        
	        //add the first element in each list to the min heap
	        List<ListNode> minHeap = new ArrayList<ListNode>();
	        for(int i = 0; i < len; i ++){
	        	//each time, get the top element('cause removed and added to the end
	        	ListNode node = (ListNode) lists.get(0);
	        	lists.remove(node);
	            if(node != null){
	                lists.add(node.next);
	                minHeap.add(node);
	            } 
	        }
	        len = minHeap.size();
	        if(len < 1){
	            return null;
	        }
	        //build min heap
	        for(int i = len / 2 - 1; i >=0; i --){
	            minHeapify(minHeap, i);
	        }
	        ListNode cur = fakeHead;
	        while(!minHeap.isEmpty()){
	            ListNode node = (ListNode) minHeap.get(0);
	            cur.next = node;
	            cur = node;
	            if(node.next != null){
	                minHeap.set(0, node.next);
	                lists.remove(node.next);
	                lists.add(node.next.next);
	            } else{
	                len --;
	                minHeap.set(0, minHeap.get(len));
	                minHeap.remove(len);
	            }
	            minHeapify(minHeap, 0);
	        }
	        return fakeHead.next;
	    }
	    
	    public void minHeapify(List<ListNode> h, int i){
	        int len = h.size();
	        int l = 2 * i + 1;
	        int r = l + 1;
	        int min = i;
	        if(l < len && h.get(l).val < h.get(min).val){
	            min = l;
	        }
	        if(r < len && h.get(r).val < h.get(min).val){
	            min = r;
	        }
	        if(i != min){
	            ListNode t = h.get(i);
	            h.set(i, h.get(min));
	            h.set(min, t);
	            minHeapify(h, min);
	        }
	    }
	    
	    
//	    public static void main(String[] args){
//	    	MergeKLists ml = new MergeKLists();
//	    	List<ListNode> lists = new ArrayList<ListNode>();
//	    	ListNode a = new ListNode(1);
//	    	a.next = new ListNode(2);
//	    	ListNode b = new ListNode(1);
//	    	lists.add(null);
//	    	lists.add(b);
//	    	ml.mergeKLists(lists);
//	    }
}
