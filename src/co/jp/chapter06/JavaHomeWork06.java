package co.jp.chapter06;

import java.util.Arrays;

public class JavaHomeWork06 {


	public static void main(String[] args) {

//		質問０１: 質問1.以下関数の修飾子、返却型、関数名、引数(引数の型・名称)を回答してください。
//		public static void main(String[] args);  
//		修飾子:public static, 返却型:void, 関数名:main, 引数:(String, args 
		
//		質問２︓ 配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		int[] array = new int[] {1,3,5,7,100,0,1};
		System.out.println("Max=" + max(array));
		System.out.println("Min=" + min(array));
//		質問3.以下メソッドの実施結果を教えてください: null
//		質問4:以下メソッドの実施結果を教えてください: value2
//		質問5:以下メソッドの実施結果を教えてください: true
//		質問6-0:
		Object[] arr_0 = new Object[] {1,3,5,7,9};
		printArray(arr_0);
//		質問6-1:
		int[] left = new int[] {1,2,3,4};
		int[] right = new int[] {5,6,7,8};
		int[] result1 = megerArray(left,right);
		System.out.println(Arrays.toString(result1));
//		質問6-2:
		int[] arr_2 = new int[] {1,2,3,4};
		int[] result2 = subArray(arr_2, 1, 2);
		System.out.println(Arrays.toString(result2));
//		質問7:
		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		System.out.println(Arrays.toString(trim(input)));
//		質問8:
		int[] array8 = {2,9,6,3,7,5};
		printArray(bubbleSort(array8));
//		質問9:
		int[] left1 = new int[] {8, 16, 7};
		int[] right1 = new int[] {10, 13, 9};
		printArray(bubbleSort(megerArray(left1, right1)));
		
	}
	public static int max(int[] datas) {         //質問２
		int max = datas[0];
		for(int i = 1; i < datas.length; i++) {
			if(max < datas[i]) {
				max = datas[i];
			}
		}
		return max;
	}
	public static int min(int[] datas) {         //質問２
		int min = datas[0];
		for(int i = 1; i < datas.length; i++) {
			if(min > datas[i]) {
				min = datas[i];
			}
		}
		return min;
	}
//	質問6-0:
	public static void printArray(Object[] objs) { 
		if(objs == null) {
			 System.out.println("null");
			 return;
		 }
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	public static void printArray(int[] objs) { 
		if(objs == null) {
			 System.out.println("null");
			 return;
		 }
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
//	質問6-1:
	public static int[] megerArray(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		for(int i = 0; i < left.length; i++) {
			result[i] = left[i];
		}
		for(int i = left.length; i < (left.length + right.length); i++) {
			result[i] = right[i - left.length];
		}
		return result;
	}

//	質問6-2:
	public static int[] subArray(int[] array, int startIndex, int length) {
		int[] result = new int[length];
		for(int i = 0; i < length; i++) {
			result[i] = array[i + startIndex];
		}
		return result;
	}
//	質問7:
	public static char[] trim(char[] array) {
		int m = 0;
		for(;array[m] == ' ';) {
			m++;
		}
		int n = array.length;
		for(;array[n-1] == ' ';) {
			n--;
		}
		char[] result = new char[n-m];
		for(int i = 0; i < n-m; i++) {
			result[i] = array[i + m];
		}
		return result;
	}
//	質問8:
	public static int[] bubbleSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 1; j < (array.length-i); j++) {
				if(array[j-1] > array[j]) {
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
}




