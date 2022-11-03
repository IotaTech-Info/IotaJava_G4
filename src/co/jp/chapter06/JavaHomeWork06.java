package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] datas_1 = new int[] { 1, 2, 5, 8, 71, 3 };
		int[] datas_2 = new int[] { 4, 5, 1, 7, 1451, 5 };
		/*
		 * 質問１． 関数の修飾⼦ public static 返却型 void 関数名 main 引数 (String[] args) 引数の型 String[]
		 * 名称 args
		 * 
		 */

		question02(datas_1);

		/*
		 * 質問3． 結果はnull
		 * 
		 * 質問4．結果はvalue2
		 * 
		 * 質問5．結果はtrue
		 * 
		 */

		// 質問6．
		Object[] objs = new Object[] { 1, 3, 4.5 };
		printArray(objs);

		// 質問9-1．
		int[] megger = meggerArray(datas_1, datas_2);
		// 質問9-2．
		bubbleSort(megger);
		System.out.println("ソートした行列");
		for (int i : megger) {

			System.out.print(i + " ");
		}

	}

	static void question02(int[] datas) {
		int max = datas[0];
		int min = datas[0];
		int sum = 0;
		for (int i = 0; i < datas.length; i++) {
			if (datas[i] > max) {
				max = datas[i];
			}
			if (datas[i] < min) {
				min = datas[i];
			}
			sum += datas[i];
		}

		System.out.println("最大値:" + max + "最小値:" + min);
		System.out.println("配列の和は" + sum);

	}

	// 質問6．
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

	// 質問6-1．
	static int[] meggerArray(int[] left, int[] right) {
		int[] megger = new int[left.length + right.length];
		int i;
		for (i = 0; i < left.length; i++) {
			megger[i] = left[i];
		}

		for (int j = i; j < left.length + right.length; j++) {
			megger[j] = right[j - i];
		}

		return megger;
	}

	// 質問6-2．
	static int[] subArray(int[] array, int startIndex, int length) {
		int[] sub = new int[length];

		for (int i = startIndex; i < startIndex + length; i++) {
			sub[i - startIndex] = array[i];
		}

		return sub;

	}

	// 質問7．
	static char[] trim(char[] input) {

		int start = 0;
		int end = input.length - 1;

		for (int i = start; i < input.length; i++) {
			if (input[i] == ' ') {
				continue;
			}
			start = i;
			break;
		}

		for (int i = end; i >= 0; i--) {
			if (input[i] == ' ') {

				continue;
			}
			end = i;

			break;
		}
		int length = end - start + 1;
		char[] output = new char[length];
		for (int i = start; i < start + length; i++) {
			output[i - start] = input[i];
		}

		return output;
	}

	// 質問8．
	static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int count = array[j];
					array[j] = array[j + 1];
					array[j + 1] = count;

				}
			}
		}

		return array;
	}

}
