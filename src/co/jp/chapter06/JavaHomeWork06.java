package co.jp.chapter06;

import java.util.Arrays;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問2.配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。

		int[] array = new int[] { 1, 2, 3, 4 };
		System.out.println(sum(array));
		System.out.println(max(array));
		System.out.println(min(array));

		// 質問6-0.
		Object[] a = { 1, 2, 3, 4 };
		printArray(a);
		Object[] b = { 5, 6, 7, 8 };
		printArray(b);

		// 質問6-1.
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		System.out.println("megerArray:" + Arrays.toString(megerArray(left, right)));

		// 質問6-2.
		int[] array_1 = new int[] { 1, 2, 3, 4 };
		int start = 1;
		int length = 2;
		System.out.println("subArray:" + Arrays.toString(subArray(array_1, start, length)));

	}
	// 質問1.以下関数の修飾子、返却型、関数名、引数(引数の型・名称)を回答してください。
	// 関数の修飾子public static; 返却型void; 関数名mian; 引数の型String[]; 引数名称args

	// 質問2.配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
	public static int sum(int[] datas) {
		int sum = 0;
		for (int i = 0; i < datas.length; i++) {
			sum += datas[i];
		}
		return sum;
	}

	public static int max(int[] datas) {
		int max = datas[0];
		for (int i = 1; i < datas.length; i++) {
			if (datas[i] > max) {
				max = datas[i];
			}
		}
		return max;
	}

	public static int min(int[] datas) {
		int min = datas[0];
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] < min) {
				min = datas[i];
			}
		}
		return min;
	}

	// 質問3.以下メソッドの実施結果を教えてください。

	// public class Kicker{
	// private static void sayHell(Srting y) {
	// y="hello world";
	// }
	// public static void main (String args[]) {
	// String x= null;
	// sayHello(x);
	// System.out.println(x);
	// }
	// }

	// 回答: null

	// 質問4:以下メソッドの実施結果を教えてください
	// public class Kicker{
	// private static void fillArray(String[] array){
	// array[0] = "value2";
	// }
	// public static void main(String[] args){
	// String[] array = new String[]{"value1"};
	// fillArray(array);
	// System.out.println(array[0]);
	// }
	// }
	// 回答:value2

	// 質問5:以下メソッドの実施結果を教えてください。
	// public class Kicker{
	// private static void fillArray(String[] array){
	// array = new String[]{"1", "2"};
	// }
	// public static void main(String[] args){
	// String[] array = null;
	// fillArray(array);
	// System.out.println(array == null);
	// }
	// }
	// 回答:true

	// 質問6-0:配列は直接に印刷できません。下記メソッドを利用して、配列をprintしま す。以下メソッドを呼び出してください。
	public static void printArray(Object[] objs) {
		if (objs == null) {
			System.out.println("null");
			return;
		}
		String prefix = "";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Object obj : objs) {
			sb.append(prefix);
			sb.append(String.valueOf(obj));
			prefix = ", ";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	// 質問6-1:以下静的なメソッドを定義してください。
	public static int[] megerArray(int[] left, int[] right) {
		int[] array_meger = new int[left.length + right.length];
		for (int i = 0; i < array_meger.length; i++) {
			if (i < left.length) {
				array_meger[i] = left[i];
			} else {
				array_meger[i] = right[i - left.length];
			}
		}
		return array_meger;
	}

	// 質問6-2:以下静的なメソッドを定義してください。
	public static int[] subArray(int[] array, int startIndex, int length) {
		int[] array_sub = new int[length];
		if (length > array.length || startIndex < 0 || startIndex > array.length - 1) {
			System.out.println("startIndex or length ERROR!");
		}
		for (int i = 0; i < length; i++) {
			array_sub[i] = array[startIndex + i];
		}
		return array_sub;
	}

	// 質問7:以下静的なメソッドを定義してください。

	// 質問8:バブルソート用メソッドを作成してください。

	// 質問9:メソッドの呼び出す練習。

}
