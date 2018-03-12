
public class TestMain {

	public static void main(String[] args) {
		SeqStack<Integer> st1 = new SeqStack<>(10);
		for(int i=0;i<15;i++)
			st1.push(i);
		for(int i:st1) {
			System.out.println(i);
		}
		
	}

}
