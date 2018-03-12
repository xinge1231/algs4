import edu.princeton.cs.algs4.StdIn;

public class TestMain {

	public static void main(String[] args) {
		LinkedStack<String> st1 = new LinkedStack<>();
		while (!StdIn.isEmpty()) {
			
			String item = StdIn.readString();
			st1.push(item);
		
		}
		int len = st1.size();
		for (int i = 0; i < len; i++) {
			System.out.println(st1.pop());
		}
	}

}
