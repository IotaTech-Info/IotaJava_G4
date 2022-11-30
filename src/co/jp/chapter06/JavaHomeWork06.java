package co.jp.chapter06;

import java.util.Arrays;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 質問2のメソッドを呼び出すコード
		int[] array = new int[] { 1, 2, 3, 4 };
		System.out.println(sum(array));
		System.out.println(MAX(array));
		System.out.println(MIN(array));
		
		// 質問6
		Object[] array_obj = new Object[] {1, "1", null, 3.14f, true, false};
		printArray(array_obj);
		
		// 質問6-1
		int[] left = new int[] {1,2,3,4};
		int[] right = new int[] {5,6,7,8};
		System.out.println("Meger Array:" + Arrays.toString(megerArray(left, right)));
		
		// 質問6-2
		int[] array_1 = new int[] {1,2,3,4,5};
		int startIndex = 1;
		int length = 3;
		System.out.println("Sub Array:" + Arrays.toString(subArray(array_1, startIndex, length)));
		
		// 質問7
		char[] array_2 = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		System.out.println("Trim Array:" + Arrays.toString(trim(array_2)));
		
		// 質問8
		int[] array_3 = new int[] {50,1,-1,20,101,3,4};
		System.out.println("bubbleSort Array:" + Arrays.toString(bubbleSort(array_3)));
		
		// 質問9
		int[] left_1 = new int[] {5,8,101,-1};
		int[] right_1 = new int[] {-20,9,112,24,-8};
		System.out.println("Meger and bubblesort Array:" + Arrays.toString(bubbleSort(megerArray(left_1, right_1))));
	}

		public static int sum(int[] datas) {
			int SUM = 0;
			for (int i = 0; i < datas.length; i++) {
				SUM += datas[i];
			}
			return SUM;
		}
		//配列のMAX値:
		public static int MAX(int[] datas) {
			int MAX = datas[0];
			for (int i = 1; i < datas.length; i++) {
				if (datas[i] > MAX) {
					MAX = datas[i];
				}
			}
			return MAX;
		}
		//配列のMIN値:
		public static int MIN(int[] datas) {
			int MIN = datas[0];
			for (int i = 0; i < datas.length; i++) {
				if (datas[i] < MIN) {
					MIN = datas[i];
				}
			}
			return MIN;
		}


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
		

		public static int[] subArray(int[] array, int startIndex, int length) {
			int[] array_sub = new int[length];
			if(length > array.length || startIndex < 0 || startIndex > array.length -1) {
				System.out.println("startIndex or length ERROR!");
			}
			for(int i = 0; i < length; i++) {
				array_sub[i] = array[startIndex + i];
			}
			return array_sub;		
		}
		

		public static char[] trim(char[] array) {
			int index_head = 0;
			int index_tail = 0;

			for (int i = 0; i < array.length; i++) {
				if (array[i] == ' ') {
					index_head++;
				} else {
					break;
				}
			}

			for (int i = array.length - 1; i > 0; i--) {
				if (array[i] == ' ') {
					index_tail++;
				} else {
					break;
				}
			}

			int[] array_trim_int = subArray(array, index_head, array.length - index_head - index_tail);
			char[] array_trim_char = new char[array_trim_int.length];
			for (int i = 0; i < array_trim_int.length; i++) {
				array_trim_char[i] = (char) array_trim_int[i];
			}
			return array_trim_char;
		}

		public static int[] subArray(char[] array, int startIndex, int length) {
			int[] array_sub = new int[length];
			if (length > array.length || startIndex < 0 || startIndex > array.length - 1) {
				System.out.println("startIndex or length ERROR!");
			}
			for (int i = 0; i < length; i++) {
				array_sub[i] = array[startIndex + i];
			}
			return array_sub;
		}

		public static int[] bubbleSort(int[] array) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = 0; j < array.length - 1 - i; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			return array;
		}


	}
