import edu.princeton.cs.algs4.StdIn;

public class TestMain {

	public static void main(String[] args) {
		LinkedBag<String> lb = new LinkedBag<>();
		LinkedStack<String> ls = new LinkedStack<>();
		LinkedQueue<String> lq = new LinkedQueue<>();
		while (!StdIn.isEmpty()) {
			
			String item = StdIn.readString();
			lb.add(item);
			ls.push(item);
			lq.enqueue(item);
		
		}
		System.out.println("Bag:");
		for(String str:lb) {
			System.out.println(str);
		}
		System.out.println("Stack:");
		for(String str:ls) {
			System.out.println(str);
		}
		System.out.println("Queue:");
		for(String str:lq) {
			System.out.println(str);
		}
	}

}
