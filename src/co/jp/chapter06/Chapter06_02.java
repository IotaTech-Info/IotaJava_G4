package co.jp.chapter06;

import java.util.Arrays;

public class Chapter06_02 {

	public Chapter06_02() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	static int index = 0;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] arr = new int[10];

		System.out.println("method之前" + Arrays.toString(arr));

		arr = setItem(arr, 1);
		arr = setItem(arr, 0);
		arr = setItem(arr, 33);
		arr = setItem(arr, 4);
		arr = setItem(arr, 55);
		arr = setItem(arr, 1);
		arr = setItem(arr, 0);
		arr = setItem(arr, 33);
		arr = setItem(arr, 4);
		arr = setItem(arr, 55);
		
		System.out.println(index);
		
		arr = setItem(arr, 888);
		
		System.out.println(index); //index在method的if循环内或者外的区别
		
		System.out.println("method之后" + Arrays.toString(arr));
		// arr[0] = 1;

		arr = clearItem(arr);
		System.out.println("清空之后" + Arrays.toString(arr));
System.out.println(index);
	}
	// 1.构成一个追加要素的method
	static int[] setItem(int[] arr, int item) {

		int[] result = arr;
		
		if (result.length > index) {
			result[index] = item;
			index++; // *影响调查*
		}

//		for (int i = 0; i < result.length; i++) {
//			if(result[i] ==0) {
//				result[i] = item;
//			break;
//			}
//		}
//		
		return result;
	}
	//2. 清空这个数组
	static int[] clearItem(int[]arr) {
		int[]result = new int[arr.length];
		index = 0;
		return result;
		
	}
	
	//3. 消除数组中的要素（index中删除，或者将数组中一样数字的要素删除）
	//3.1. index delete
static int[] delItem(int[]arr, int item) {
	int[] result = arr;
	if(index > 0 && index <= arr.length) {
	result[item] = 0;
	}
	return result;
}










}
