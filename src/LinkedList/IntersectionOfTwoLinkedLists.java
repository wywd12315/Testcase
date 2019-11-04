package LinkedList;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	ListNode tmpA=headA;
    	ListNode tmpB=headB;
    	if(headA==null||headB==null) {
    		return null;
    		}
    	else if(headA.next==null||headB.next==null) {
    		if(headA.next==null) {
    			while(tmpB!=null) {
    			if(tmpB==headA)
    				return headA;
    			tmpB=tmpB.next;
    			}
    			return null;
    		}
    		else{
    			while(tmpA!=null) {
    			if(tmpA==headB)
    				return headB;
    			tmpA=tmpA.next;
    			}
    			return null;
    		}
    	}

    	while(tmpA!=null&&tmpB!=null) {
    		if(tmpA==tmpB) {return tmpA;}
    		else {
    			tmpA=tmpA.next;
    			tmpB=tmpB.next;
    		}
    	}
    	if(tmpA==null&&tmpB==null) return null;	
    	else if(tmpA==null) {
    		tmpA=headB; tmpB=tmpB.next;
    		while(tmpA!=null) {
    			if(tmpA==tmpB) {return tmpA;}
    			if(tmpB==null) {tmpB=headA; tmpA=tmpA.next;}
    			else {
    			tmpA=tmpA.next;
    			tmpB=tmpB.next;}
    		}
    	}
    	else if(tmpB==null) {
    		tmpB=headA; tmpA=tmpA.next;
    		while(tmpB!=null) {
    			if(tmpA==tmpB) {return tmpA;}
    			if(tmpA==null) {tmpA=headB; tmpB=tmpB.next;}
    			else {
    			tmpA=tmpA.next;
    			tmpB=tmpB.next;}
    		}
    	}	
    	return null;
    }
}
