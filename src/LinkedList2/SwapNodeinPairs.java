package LinkedList2;

public class SwapNodeinPairs {
    public ListNode swapPairs(ListNode head) {
        if((head==null)||(head.next==null)) return head;
        ListNode cur=head;
        ListNode pre=new ListNode(0);
        pre.next=head;
        head=pre;
        while(pre.next!=null) {
        	pre.next=cur.next;
        	pre=cur.next;
        	cur.next=pre.next;
        	pre.next=cur;
        	pre=pre.next;
        	cur=cur.next;
        }
        return head.next;
    }
}
