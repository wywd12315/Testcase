package LinkedList;

public class LinkedListCycle {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode previous = head;
        ListNode current = head;
        if(head==null||head.next==null) {return head;}
        else {
        	current=current.next;
        	while(current!=null) {
        	if(current.val==previous.val) {
        		previous.next=current.next;
        		}
        	else {
        		previous=previous.next;
        		}
        	current=current.next;
        	}
        	return head;
        }
    }
}
