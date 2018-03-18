import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class UnionFindTest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("largeUF.txt"));
		int n = sc.nextInt();
		WeightedQuickUnion wqn = new WeightedQuickUnion(n);
		for(int i=0;i<2000000;i++) {
			int tmp1 = sc.nextInt();
			int tmp2 = sc.nextInt();
			wqn.union(tmp1, tmp2);
		}
		System.out.println(wqn.getCount());

	}

}
