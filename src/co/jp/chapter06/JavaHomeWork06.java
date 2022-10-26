package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
//		public static void main(String[] args);
//		修飾⼦ : public static
//		返却型 : void
//		関数名 : main
//		引数の型 : String型
//		名称 : args

//		質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		int[] arr = new int[] { 1, 2, 3, 4 };
		System.out.println(arr_sum(arr));
		System.out.println(arr_max(arr));
		System.out.println(arr_min(arr));

//		質問３．以下メソッドの実施結果を教えてください。
		String x = null;
		sayHello(x);
		System.out.println(x);

//		出力は null

//		質問４︓以下メソッドの実施結果を教えてください。
		String[] array = new String[] { "value1" };
		fillArray(array);
		System.out.println(array[0]);

//		出力は value2

//		質問５︓以下メソッドの実施結果を教えてください。
		String[] array5 = null;
		fillArray5(array5);
		System.out.println(array5 == null);

//		出力は　true

//		質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
		String[] array6_0 = new String[] { "1", "2", "3", "4" };
		printArray(array6_0);

		System.out.println("");
//		質問６-１︓以下静的なメソッドを定義してください。
		int[] left = new int[] { 1, 2, 3, 4 };
		int[] right = new int[] { 5, 6, 7, 8 };
		int[] result6_1 = result(left, right);
//		for (int i : result6_1) {
//			System.out.print(i + " ");
//		}
		print(result6_1);

		System.out.println(" ");
//		質問６-２︓以下静的なメソッドを定義してください。
		int[] array6_2 = new int[] { 1, 2, 3, 4 };
		int start6 = 1;
		int length = 2;
		int[] result6_2 = subArray(start6, length, array6_2);
//		for (int i : result6_2) {
//			System.out.print(result6_1[i] + " ");
//		}
		print(result6_2);

		System.out.println("");
//		質問７︓以下静的なメソッドを定義してください。
		char[] input = new char[] { ' ', ' ', 'A', 'b', ' ', ' ', 'C', ' ' };
		int start7 = 0;
		int end = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != ' ') {
				break;
			}
			start7++;
		}
		for (int j = input.length - 1; j >= 0; j--) {
			if (input[j] != ' ') {
				break;
			}
			end++;
		}
		System.out.println(start7);
		System.out.println(end);
		char[] output = trim(start7, end, input);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i]);
		}

		System.out.println("");
//		質問8
		int[] array8 = new int[] { 7, 6, 8, 2, 9, 1, 4, 3, 5 };
		int[] sort = bubbleSort(array8);
		for (int i = 0; i < sort.length; i++) {
			System.out.print(sort[i]);
		}

		System.out.println("");
//		質問9
		bubbleSort(result(right, left));

		int[] bub = bubbleSort(result(right, left));

		print(bub);

	}

//	質問２
	static int arr_sum(int[] datas) {
		int sum = 0;
		for (int i = 0; i < datas.length; i++) {
			sum = sum + datas[i];
		}

		return sum;
	}

	static int arr_max(int[] datas) {
		int max = 0;
		int[] arr = new int[datas.length];
		for (int a = 0; a < datas.length; a++) {
			arr[a] = datas[a];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (j != i) {
					if (arr[i] >= arr[j])
						;
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		max = arr[3];
		return max;
	}

	static int arr_min(int[] datas) {
		int min = 0;
		int[] arr = datas;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (j != i) {
					if (arr[i] >= arr[j])
						;
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		min = arr[0];
		return min;
	}

//	質問３
	private static void sayHello(String y) {
		y = "Hello world";

	}

//	質問4
	private static void fillArray(String[] array) {
		array[0] = "value2";
	}

//	質問5
	private static void fillArray5(String[] array) {
		array = new String[] { "1", "2" };
	}

//	質問6_0
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
			prefix = ",";
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

//	質問6_1
	public static int[] result(int array1[], int array2[]) {
		int[] a = new int[array1.length + array2.length];
		int al = 0;
		for (int i = 0; i < array1.length; i++) {
			a[al] = array1[i];
			al++;
		}
		for (int i = 0; i < array2.length; i++) {
			a[al] = array2[i];
			al++;
		}
		return a;
	}

//	質問6_2
	public static int[] subArray(int startindex, int length, int array[]) {
		int[] a = new int[length];
		for (int i = 0; i < length; i++) {
			a[i] = array[startindex + i];
		}
		return a;
	}

//	質問7
	public static char[] trim(int start, int end, char array[]) {
		char[] a = new char[array.length - start - end];
		for (int i = 0; i < array.length - start - end; i++) {
			a[i] = array[start + i];
		}
		return a;
	}

//	質問8
	public static int[] bubbleSort(int[] array) {
		int[] arr = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			arr[i] = array[i];
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

//	print
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

}
