package LinkedList;

public class Test {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode tmp = head;
		for(int i=2;i<6;i++) {
			ListNode newNode = new ListNode(i);
			tmp.next= newNode;
			tmp = newNode;
		}
		ReverseLinkedList RLL =new ReverseLinkedList();
		ListNode ret = RLL.reverseList(head);
		tmp = ret;
		while(tmp!=null) {
			System.out.println(tmp.val);
			tmp=tmp.next;
		}
		
	}

}
