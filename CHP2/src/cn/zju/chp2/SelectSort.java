package cn.zju.chp2;
/*
 * —°‘Ò≈≈–Ú
 */
public class SelectSort {
	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b)<0;
	}

	private static void exch(Comparable[] arr, int i, int j) {
		Comparable tmp;
		tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}

	public static void sort(Comparable[] arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(less(arr[j],arr[min]))
					min=j;
					
			}
			exch(arr,i,min);
		}
	}
	
	public static boolean isSorted(Comparable[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(less(arr[i],arr[i-1]))
				return false;
		}
		return true;
	}
}
