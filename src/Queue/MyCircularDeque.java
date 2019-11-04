package Queue;

class MyCircularDeque {
    
	int[] myArray;
	int front=0;
	int rear=0;
	int numElements=0;
	
	//rear和front 在 0, insert操作， rear先赋值再移位++，front 先移位--再赋值；delete，rear先移位--再赋值, front 先赋值再移位++;
	
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
    	myArray= new int[k];
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
    	if(numElements==myArray.length) {return false;}
    	else {
    		front=(front-1+myArray.length)%myArray.length;
    		myArray[front]=value;
    		numElements++;
    		return true;
    	}
        
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
    	if(numElements==myArray.length) {return false;}
    	else {
    		myArray[rear]=value;
    		rear=(rear+1)%myArray.length;
    		numElements++;
    		return true;
    	}
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
    	if(numElements==0) {return false;}
    	else {
    		front=(front+1)%myArray.length;
    		numElements--;
    		return true;
    	}
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
    	if(numElements==0) {return false;}
    	else {
    		rear=(rear-1+myArray.length)%myArray.length;
    		numElements--;
    		return true;
    	}
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
    	if(numElements==0) {return -1;}
    	else {
    		return myArray[front];
    	}
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
    	if(numElements==0) {return -1;}
    	else {
    		return myArray[(rear-1+myArray.length)%myArray.length];
    	}
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return numElements==0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
    	return numElements==myArray.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */