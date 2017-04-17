package ds;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class QueueReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new SynchronousQueue<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		print(queue );

	}
	void reverse(Queue q){
		
	}
	
	static void print(Queue q) {
		Iterator<Integer> itr = q.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
