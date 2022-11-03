package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してくださ
//		い。
//		public static void main(String[] args);
		
		// 修飾⼦ "public static"、返却型 "void"、関数名 "main"、引数 "String[] args"
		
//		質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼
//		び出してください。
		
		// max(int[]) , min(int[])
		
//		質問３．以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			 private static void sayHello(String y) {
//			 	y = "Hello world";
//			 }
//			 public static void main(String args[]) {
//			 	String x = null;
//			 	sayHello(x);
//			 	System.out.println(x);
//			 }
//		}
		
		// 该程序只会执行出null的结果。因为跨方法的赋值是不会生效的。
		
//		質問４︓以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			 private static void fillArray(String[] array) {
//			 	array[0] = "value2";
//			 }
//			 public static void main(String args[]) {
//			 	String[] array = new String[]{"value1"};
//			 	fillArray(array);
//			 	System.out.println(array[0]);
//			 }
//		}

		// 该程序会输出"value2",这是由于数组中存储的是数组每个元素在内存中的地址，
		// 因此通过下标查询到的地址是与在主函数中的地址相同的，因此可以成功修改
		
//		質問５︓以下メソッドの実施結果を教えてください。
//		public class Kicker {
//			 private static void fillArray(String[] array) {
//				 array = new String[]{"1", "2"};
//			 }
//			 public static void main(String args[]) {
//				 String[] array = null;
//				 fillArray(array);
//				 System.out.println(array == null);
//			 }
//		}

		//  该程序会输出"true",即array的值还是为null。这是因为在fillArray方法中，
		//一个新的数组被创建，即原先的地址被抹去了，因此不能正确的访问
		
//		質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintしま
//		す。以下メソッドを呼び出してください。
		
		// 这里由于是Object，因此应该实用Integer[],因此我把函数的形参改成int了
		int[] array = {1,2,3};
		printArray(array);
		
//		質問６-１︓以下静的なメソッドを定義してください。
//		1. メソッド名: megerArray
//		2. 引数１︓intの配列 left
//		3. 引数２︓intの配列 right
//		4. 戻り値︓intの配列
//		5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
		
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		// メソッドを実施後
		printArray(megerArray(left, right));
		
//		質問６-２︓以下静的なメソッドを定義してください。
//		1. メソッド名: subArray
//		2. 引数１︓intの配列 array
//		3. 引数２︓開始のstartIndex
//		4. 引数３︓⻑さlength
//		5. 戻り値︓intの配列
//		6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
		int[] array1 = new int[] {1, 2, 3, 4};
		// start = 1, length = 2
		printArray(subArray(array1, 1, 2));
		
//		質問７︓以下静的なメソッドを定義してください。
//		1. メソッド名︓trim
//		2. 引数１︓charの配列
//		3. 戻り値︓charの配列
//		4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。

		char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
		// メソッドを実施後
		printArray(trim(input));
		
//		質問８︓バブルソート⽤メソッドを作成してください。
//		1. メソッド名︓bubbleSort
//		2. 引数１︓intの配列
//		3. 戻り値︓ソート済みの配列
//		4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
//		い。
		
		int[] array2 = {4,6,2,8,2,5};
		printArray(bubbleSort(array2));
		
//		質問９︓メソッドの呼び出す練習。
//		1. 質問６-１を⽤い、２つ配列をマージします。
//		2. 質問８を⽤い、ステップ１のマージした配列をソートする。
//		3. 注意︓コードを１⾏にしてください。1
		
		left = new int[] {5,2,4,7,8,1};
		right = new int[] {7,23,8,9,4,1};
		printArray(bubbleSort(megerArray(left, right)));
	}
	
	public static int max(int[] array) {
		int max = -999;
		for (int num : array) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}
	public static int min(int[] array) {
		int min = 999;
		for (int num : array) {
			if (num > min) {
				min = num;
			}
		}
		return min;
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
	public static void printArray(char [] objs) {
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
	
	public static int[] megerArray(int[] left,int[] right) {
		int[] result = new int[left.length + right.length];
		for (int i=0;i<left.length;i++) {
			result[i] = left[i];
		}
		for (int i=0;i<right.length;i++) {
			result[i+left.length] = right[i];
		}
		return result;
	}

	public static int[] subArray(int[] array, int startIndex, int length) {
		int[] result = new int[length];
		for (int i=0;i<length;i++) {
			result[i] = array[i+startIndex];
		}
		return result;
	}
	
	public static char[] trim(char[] array) {
		int start = 0;
		while (array[start] == ' ') start++;
		int end = array.length;
		while(array[end-1] == ' ') end--;
		int length = end-start;
		char[] result = new char[length];
		for (int i=0;i<length;i++) {
			result[i] = array[i + start];
		}
		return result;
	}
	
	public static int[] bubbleSort(int[] array) {
		for (int i=0;i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				if (array[i] > array[j]) {
					int x = array[i];
					array[i] = array[j];
					array[j] = x;
				}
			}
		}
		return array;
	}
}
