package cn.zju.chp2;
/*
 * ≤Â»Î≈≈–Ú
 */
public class InsertSort {
	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b)<0;
	}
	
	private static void exch(Comparable[] arr,int i, int j) {
		Comparable tmp;
		tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
	
	public static void sort(Comparable[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i-1;j>=0;j--) {
				if(less(arr[i],arr[j]))
					exch(arr,i,j);
			}
		}
	}
}
