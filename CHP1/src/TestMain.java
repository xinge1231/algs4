import edu.princeton.cs.algs4.StdIn;

public class TestMain {

	public static void main(String[] args) {
		LinkedQueue<String> lq = new LinkedQueue<>();
		while (!StdIn.isEmpty()) {
			
			String item = StdIn.readString();
			lq.enqueue(item);
		
		}
		
		while(!lq.isEmpty()) {
			System.out.println(lq.dequeue());
		}
	}

}
