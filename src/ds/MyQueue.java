package ds;

public class MyQueue {
	int capacity = 5;
	Integer[] qArray;
	Integer currentPosition;
	Integer enquePosition = 0;
	Integer temp;
	Integer count = 0;
	int front = 0;
	int rear = 0;
	MyQueue(int capacity){
		this.capacity = capacity;
		qArray =  new Integer[this.capacity];;
	}
	public static void main(String[] args) throws Exception{
		MyQueue myQueue = new MyQueue(4);
		myQueue.enque(3);
		myQueue.enque(4);
		myQueue.enque(5);
		int val = myQueue.deque();
		System.out.println(val);
		myQueue.enque(6);
		val = myQueue.deque();
		System.out.println(val);
		val = myQueue.deque();
		System.out.println(val);
		val = myQueue.deque();
		System.out.println(val);
		
		myQueue.enque(31);
		myQueue.enque(41);
		myQueue.enque(51);
		myQueue.enque(322);
		myQueue.enque(422);
		myQueue.enque(522);
		
		
	}
	
	public void enque(Integer i) throws Exception {
		if(count >= this.capacity)
			throw new Exception("Queue is Full");
		qArray[rear] = i;
		rear =  (rear++)%this.capacity;
		count++;
	}
	public Integer deque() throws Exception{
		if(count==0)
			throw new Exception("Queue is Empty");
		temp = qArray[front];
		front++;
		count--;
		
		return temp;
	}

}
