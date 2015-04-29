import java.util.PriorityQueue;


public class PriorityQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Double> queue = new PriorityQueue<Double>();
		
		queue.offer(3.2);
		queue.offer(9.8);
		queue.offer(5.4);
		
		while(queue.size() > 0){
			System.out.printf("%.1f ",queue.peek());
			queue.poll();
		}
	}

}
