package Queue;
import java.util.*;
class MyStack {
	Queue<Integer> myqueue = new LinkedList<Integer>();
	
    /** Initialize your data structure here. */
    public MyStack() {

    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        myqueue.offer(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
   
        	for(int i=0;i<myqueue.size()-1;i++) {
        		myqueue.offer(myqueue.poll());
        	}
        	return myqueue.poll();
        
    }
    
    /** Get the top element. */
    public int top() {
    	   
    	for(int i=0;i<myqueue.size()-1;i++) {
    		myqueue.offer(myqueue.poll());
    	}
    	int tmp= myqueue.peek();
    	myqueue.offer(myqueue.poll());
    	return tmp;
    
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return myqueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */