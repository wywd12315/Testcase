package Queue;
import java.util.*;
class MyQueue {

	Stack<Integer> mystack1 = new Stack<Integer>();
	Stack<Integer> mystack2 = new Stack<Integer>();
	
    /** Initialize your data structure here. */
    public MyQueue() {
        
    }

    
    /** Push element x to the back of queue. */
    public void push(int x) {
        mystack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!mystack1.isEmpty()) {
        	mystack2.push(mystack1.pop());
        }
        int tmp = mystack2.pop();
        while(!mystack2.isEmpty()) {
        	mystack1.push(mystack2.pop());
        }
        return tmp;
    }
    
    /** Get the front element. */
    public int peek() {
        while(!mystack1.isEmpty()) {
        	mystack2.push(mystack1.pop());
        }
        int tmp = mystack2.peek();
        while(!mystack2.isEmpty()) {
        	mystack1.push(mystack2.pop());
        }
        return tmp;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return mystack1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */