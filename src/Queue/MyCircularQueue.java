package Queue;
class MyCircularQueue {
	int front=0;
	int rear=0;
	int numElements=0; // 用来记录Queue中有效内容个数
	int[] myArray; 
	
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        myArray= new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(numElements==myArray.length) {return false;}
        else{
        	myArray[rear]=value;
        	rear=(rear+1)%myArray.length;
        	numElements=numElements+1;
        	return true;
        }
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(numElements==0) {return false;}
        else {
        	myArray[front]=Integer.MIN_VALUE;
        	front=(front+1)%myArray.length;
        	numElements=numElements-1;
        	return true;
        }
    }
    
    /** Get the front item from the queue. */
    public int Front() {
    	if(numElements==0) {return -1;}
    	else {
        return myArray[front];
        }
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
    	if(numElements==0) {return -1;}
    	else {
    	return myArray[(rear-1+myArray.length)%myArray.length];
    	}
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return numElements==0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return numElements==myArray.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */