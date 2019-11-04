package LinkedList2;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
		if((head==null)||(head.next==null)) return false;
		ListNode fast=head;
		ListNode slow=head;
		do {fast=fast.next.next;
		slow=slow.next;
		if((fast==null)||(fast.next==null)) return false;
		}
		while(fast!=slow);
		return true;
		
	}
}
