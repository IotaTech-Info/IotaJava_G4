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
		
		// 質問6-0のメソッドを呼び出すコード
		Object[] array_obj = new Object[] {1, "1", null, 3.14f, true, false};
		printArray(array_obj);
		
		// 質問6-1のメソッドを呼び出すコード
		int[] left = new int[] {1,2,3,4};
		int[] right = new int[] {5,6,7,8};
		System.out.println("Meger Array:" + Arrays.toString(megerArray(left, right)));
		
		// 質問6-2のメソッドを呼び出すコード
		int[] array_1 = new int[] {1,2,3,4,5};
		int startIndex = 1;
		int length = 3;
		System.out.println("Sub Array:" + Arrays.toString(subArray(array_1, startIndex, length)));
		
		// 質問7のメソッドを呼び出すコード
		char[] array_2 = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '};
		System.out.println("Trim Array:" + Arrays.toString(trim(array_2)));
		
		// 質問8のメソッドを呼び出すコード
		int[] array_3 = new int[] {50,1,-1,20,101,3,4};
		System.out.println("bubbleSort Array:" + Arrays.toString(bubbleSort(array_3)));
		
		// 質問9のメソッドを呼び出す練習コード
		int[] left_1 = new int[] {5,8,101,-1};
		int[] right_1 = new int[] {-20,9,112,24,-8};
		System.out.println("Meger and bubblesort Array:" + Arrays.toString(bubbleSort(megerArray(left_1, right_1))));
	}
		
		// 質問1：以下関数の修飾子、返却型、関数名、引数（引数の型・名称）を回答してください。
		// 1 public static void main(String[] args);
		// 回答：修飾子: public static; 返却型: void; 関数名: main; 引数: 引数の型: String[], 引数の名称: args
		
		// 質問2：配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		// 回答：
		// 配列の和:
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

		// 質問3：以下メソッドの実施効果を教えてください。
		//	public class Kicker{
		//		private static void sayHello(String y){
		//			y = "Hello world";
		//		}
		//		public static void main(String[] args){
		//			String x = null;
		//			sayHello(x);
		//			System.out.println(x);
		//		}
		//	}
		// 回答：実施効果はnullを出力します。xの値はHello worldに変更されません。
		
		// 質問4：以下メソッドの実施効果を教えてください。
		//	public class Kicker{
		//		private static void fillArray(String[] array){
		//			array[0] = "value2";
		//		}
		//		public static void main(String[] args){
		//			String[] array = new String[]{"value1"};
		//			fillArray(array);
		//			System.out.println(array[0]);
		//		}
		//	}
		// 回答：実施効果はvalue2を出力します。配列arrayの一つ目の要素の値はvalue2に変更されます。
		
		// 質問5：以下メソッドの実施効果を教えてください。
		//	public class Kicker{
		//		private static void fillArray(String[] array){
		//			array = new String[]{"1", "2"};
		//		}
		//		public static void main(String[] args){
		//			String[] array = null;
		//			fillArray(array);
		//			System.out.println(array == null);
		//		}
		//	}
		// 回答：実施効果はtrueを出力します。空配列arrayに1と2の要素を加えません。
		
		// 質問6‐0：配列は直接に印刷できません。下記のメソッドを利用して、配列をprintします。以下メソッドを呼び出してください。
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
		
		// 質問6-1：以下静的なメソッドを定義してください。
		// 1.メソッド名：megerArray
		// 2.引数1：intの配列left
		// 3.引数2：intの配列right
		// 4.戻り値：intの配列
		// 処理内容：引数leftと引数rightをマージして、新しい配列を作成して返却する。
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
		
		// 質問6-2：以下静的なメソッドを定義してください。
		// 1.メソッド名：subArray
		// 2.引数1：intの配列array
		// 3.引数2：開始のstartIndex
		// 4.引数3：長さlength
		// 5.戻り値：intの配列
		// 処理内容：startIndexからstartIndex + lengthまでサブ配列を取得する。
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
		
		// 質問7：以下静的なメソッドを定義してください。
		// 1.メソッド名：trim
		// 2.引数1：charの配列
		// 3.戻り値：charの配列
		// 処理内容：引数1のcharの配列先頭と末尾の空白文字列を削除してください。
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
		// 質問6-2のsubArrayメソッドのオーバーロード
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
		
		// 質問8：バブルソート用メソッドを作成してください。
		// 1.メソッド名：bubbleSort
		// 2.引数1：intの配列
		// 3.戻り値：ソート済みの配列
		// 4.処理内容：bubbleSortアルゴリズムを用い、入力した引数の配列をソートしてください。
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
		
		// 質問9：メソッドを呼び出す練習
		// 1.質問6-1を用い、2つの配列をマージします。
		// 2.質問8を用い、ステップ1のマージした配列をソートする。
		// 3.注意：コードを１行にしてください。
		
		// 質問9の回答はmain関数に呼び出しています。

	}
