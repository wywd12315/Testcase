package LinkedList;

class Solution {
    public ListNode reverseList(ListNode head) {
    	if(head==null||head.next==null) {return head;}
    	else {
    	ListNode head_copy=head;
    	ListNode tmp2 = head.next;
    	while(tmp2!=null) {
    		ListNode tmp = new ListNode(tmp2.val);
    		tmp.next=head;
    		head_copy.next=tmp2.next;
    		head=tmp;
    		tmp2=tmp2.next;
    	}
    	return head;
    	}
    }
}