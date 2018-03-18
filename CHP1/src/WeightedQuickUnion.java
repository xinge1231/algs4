/*
 * union-find算法的加权quick-union实现  (加权并查集)
 */
public class WeightedQuickUnion {
	private int[] roots;
	private int[] weights; //各子数权重(结点数)
	private int count; //连通分量数
	
	public WeightedQuickUnion(int n) {
		roots = new int[n];
		weights=new int[n];
		count=n;
		for(int i=0;i<n;i++) {
			roots[i]=i; //初始根结点是自己
			weights[i]=1;
		}
	}
	
	//返回连通数
	public int getCount() {
		return count;
	}
	
	//查找根结点
	public int find(int num) {
		int tmp=roots[num];
		while(tmp!=roots[tmp])
			tmp=roots[tmp];
		return tmp;
	}
	
	//合并连接
	public void union(int a,int b) {
		int roota=find(a);
		int rootb=find(b);
		if(roota!=rootb) {
			if(weights[roota]>weights[rootb]) { //小树合并到大树
				roots[rootb]=roota;
				weights[roota]+=weights[rootb];
			}
			else {
				roots[roota]=rootb;
				weights[rootb]+=weights[roota];
			}
			count--; //连接后，连通数减1
			System.out.println("current count:"+count);
		}
	}
}
