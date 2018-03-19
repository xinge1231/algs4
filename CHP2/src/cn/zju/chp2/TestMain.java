package cn.zju.chp2;

import java.util.Arrays;

import edu.princeton.cs.algs4.Stopwatch;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] arr = {5,4,3,2,1};
		Stopwatch timer = new Stopwatch();
		String[] strArr= {"hello","abc","ddd","aba","hello","ddd"};
		//SelectSort.sort(strArr);
		//InsertSort.sort(strArr);
		ShellSort.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		//System.out.println(SelectSort.isSorted(strArr));
		//System.out.println(Arrays.toString(arr));
		//System.out.println("abc".compareTo("aba"));
		System.out.println(timer.elapsedTime());
	}

}
