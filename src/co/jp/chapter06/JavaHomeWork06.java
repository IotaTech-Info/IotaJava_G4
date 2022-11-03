package co.jp.chapter06;

public class JavaHomeWork06 {

//	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ

//		質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
//		public static void main(String[] args);
	// 修飾⼦:public と static
	// 返却型:void
	// 関数名:main
	// 引数:引数が１つあります。引数名は args , 引数の型は String[]

//		質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。 
//	public static void main(String[] args) {
//		int[] array = { 3, 1, 6, 8, 9 };
//
//		int MAX = max(array);
//		int MIN = min(array);
//		int SUM = sum(array);
//
//		System.out.println("最大値は：" + MAX);
//		System.out.println("最小値は：" + MIN);
//		System.out.println("和は：" + SUM);
//	}
//
//	public static int max(int[] array) {
//		int MAX = array[0];
//
//		for (int i = 1; i < array.length; i++) {
//			if (MAX < array[i]) {
//				MAX = array[i];
//			}
//		}
//		return MAX;
//	}
//
//	public static int min(int[] array) {
//		int MIN = array[0];
//
//		for (int i = 1; i < array.length; i++) {
//			if (MIN > array[i]) {
//				MIN = array[i];
//			}
//		}
//		return MIN;
//	}
//
//	public static int sum(int[] array) {
//		int SUM = 0;
//
//		for (int i = 0; i < array.length; i++) {
//			SUM += array[i];
//		}
//		return SUM;
//	}

//		質問３．以下メソッドの実施結果を教えてください。 
//		public class Kicker {
//			private static void sayHello(String y) {
//				y = "Hello world";
//			}
//
//			public static void main(String args[]) {
//				String x = null;
//				sayHello(x);
//				System.out.println(x);
//			}
//      }
	// 結果はnullです。

//		質問４︓以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			private static void fillArray(String[] array) {
//				array[0] = "value2";
//			}
//
//			public static void main(String args[]) {
//				String[] array = new String[] { "value1" };
//				fillArray(array);
//				System.out.println(array[0]);
//			}
//		}
	// 結果はvalue2です。

//		質問５︓以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			private static void fillArray(String[] array) {
//				array = new String[] { "1", "2" };
//			}
//
//			public static void main(String args[]) {
//				String[] array = null;
//				fillArray(array);
//				System.out.println(array == null);
//			}
//		}
	// 結果はtrueです。

//		質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
//	public static void main(String[]args) {
//		Object[]a = {1,2,3,4};
//		printArray(a);
//		Object[]b = {5,6,7,8};
//		printArray(b);
//	}
//
//	public static void printArray(Object[] objs) {
//		if (objs == null) {
//			System.out.println("null");
//			return;
//		}
//		String prefix = "";
//		StringBuilder sb = new StringBuilder();
//		sb.append("[");
//		for (Object obj : objs) {
//			sb.append(prefix);
//			sb.append(String.valueOf(obj));
//			prefix = ", ";
//		}
//		sb.append("]");
//		System.out.println(sb.toString());
//	}

//		質問６-１︓以下静的なメソッドを定義してください。
//		1. メソッド名: megerArray 
//		2. 引数１︓intの配列 left 
//		3. 引数２︓intの配列 right 
//		4. 戻り値︓intの配列 
//		5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
//		以下メソッドの実施例︓
//		int[] left = new int[] {1, 2, 3, 4}; 
//		int[] right = new int[] {5, 6, 7, 8};
//		// メソッドを実施後 
//		int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
	public static void main(String[] args) {
		int[] left = {1, 2, 3, 4}; 
		int[] right = {5, 6, 7, 8};
		System.out.println(Arrays.toString(mergeArray(left,right)));
	}
	static int[] mergeArray(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		for(int i = 0;i<result.length;i++) {
			if(i< left.length) {
				result[i] = left[i];
			}else {
				result[i] = right[i - left.length];
			}
		}
		return result;
	}
	


//		質問６-２︓以下静的なメソッドを定義してください。
//		1. メソッド名: subArray 
//		2. 引数１︓intの配列 array 
//		3. 引数２︓開始のstartIndex 
//		4. 引数３︓⻑さlength 
//		5. 戻り値︓intの配列 
//		6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
//		以下メソッドの実施例︓
//		int[] array = new int[] {1, 2, 3, 4};
//		// start = 1, length = 2
//		int[] result = new int[] {2, 3}
	

//		質問７︓以下静的なメソッドを定義してください。
//		1. メソッド名︓trim 
//		2. 引数１︓charの配列 
//		3. 戻り値︓charの配列 
//		4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
//		以下メソッドの実施例︓
//		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
//		// メソッドを実施後 
//		char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
//		ヒント︓ 
//		1. 配列の起点から、 ' ' ではない⽂字列のインデックスを探す。
//		2. 配列の終点から、 ' ' ではない⽂字列のインデックスを探す。 
//		3. 起点と終点を引数として、質問６-２で作成したサブ配列メソッドを呼び出して、結果 を求める。

//		質問８︓バブルソート⽤メソッドを作成してください。 
//		1. メソッド名︓bubbleSort
//		2. 引数１︓intの配列 
//		3. 戻り値︓ソート済みの配列
//		4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。 

//		質問９︓メソッドの呼び出す練習。 
//		1. 質問６-１を⽤い、２つ配列をマージします。 
//		2. 質問８を⽤い、ステップ１のマージした配列をソートする。
//		3. 注意︓コードを１⾏にしてください。

//		
//	}
}
