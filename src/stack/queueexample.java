package stack;

import java.util.Queue;

public class queueexample {

	public static void main(String[] args) {
	 Queue<Integer>queue= new linkedlist<Integer>();
	 queue.offer(20);
	 queue.offer(34);
	 queue.offer(56);
	 queue.offer(22);
	 queue.offer(43);
	 
	 System.out.println(queue);
	 
	 
	 queue.poll();
	 System.out.println(queue);
	 System.out.println("peek:"+queue.peek());
	 
	 
	 }

}
