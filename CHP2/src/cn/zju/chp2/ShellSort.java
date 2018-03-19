package cn.zju.chp2;
/*
 * 希尔排序
 */
public class ShellSort {
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
		int h = 1;
		int len = arr.length;
		while(h<len/3)//设置距离(递增序列)
			h=h*3+1;
		while(h>=1) {
			for(int i=h;i<len;i++) {//处理整个h有序数组
				for(int j=i-h;j>=0 && less(arr[j+h],arr[j]) ;j-=h) {//处理单个h子数组
					exch(arr,j+h,j);
				}
			}
			h/=3;
		}
	}
}
