package co.jp.chapter06;

public class JavaHomeWork06 {

//	質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
//	public static void main(String[] args);
//	回答：修飾⼦:public、返却型:void、関数名:main、引数の型:String[]、引数の名称:main
		
//	質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
// 	例：配列のMax値を求めるメソッド
//	public static int max(int[] datas) {
// 		...処理を記載
//	}
//	回答：
	public static int max(int[] datas) {
 		int max=datas[0];
		for (int i:datas) {
 			if (datas[i]>max) {
 				max=datas[i];
 			}
 		}
		return max;
	}
	
	public static int min(int[] datas) {
 		int min=datas[0];
		for (int i:datas) {
 			if (datas[i]<min) {
 				min=datas[i];
 			}
 		}
		return min;
	}
	
	public static int sum(int[] datas) {
 		int sum=0;
		for (int i:datas) {			
 			sum+=datas[i];
 		}
		return sum;
	}
	
	public static void main_Q2(String args[]) {
		int datas_Q2[]= {0,1,2,3};
		System.out.println(max(datas_Q2));
		System.out.println(min(datas_Q2));
		System.out.println(sum(datas_Q2));
		
	}
		
//	質問３．以下メソッドの実施結果を教えてください。
//	public class Kicker {
//		private static void sayHello(String y) {
//			y = "Hello world";
//		}
//		public static void main(String args[]) {
//			String x = null;
//			sayHello(x);
//			System.out.println(x);
//		}
//	}
//	回答：null
	

		
//	質問４︓以下メソッドの実施結果を教えてください。
//	public class Kicker_Q4 {
//		private static void fillArray(String[] array) {
//			array[0] = "value2";
//		}
//		public static void main(String args[]) {
//			String[] array = new String[]{"value1"};
//			fillArray(array);
//			System.out.println(array[0]);
//		}
//	}
//	回答：null
	
//	質問５︓以下メソッドの実施結果を教えてください。
//	public class Kicker {
//		private static void fillArray(String[] array) {
//			array = new String[]{"1", "2"};
//		}
//		public static void main(String args[]) {
//			String[] array = null;
//			fillArray(array);
//			System.out.println(array == null);
//		}
//	}
//	回答：true
	
//	質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
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
//	回答：
	public static void main_Q6_0(String args[]) {
		Object array_Q6_0[]= new Object[] {0,1,2};
		printArray(array_Q6_0);
		
	}
	
	
//	質問６-１︓以下静的なメソッドを定義してください。
//	1. メソッド名: megerArray
//	2. 引数１︓intの配列 left
//	3. 引数２︓intの配列 right
//	4. 戻り値︓intの配列
//	5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。
//	以下メソッドの実施例︓
//	int[] left = new int[] {1, 2, 3, 4};
//	int[] right = new int[] {5, 6, 7, 8};
// 	メソッドを実施後
//	int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
//	回答：
	public static int[] mergeArray(int[]left,int[]right) {
		int result[]=new int[left.length+right.length];
		for(int i=0;i<left.length;i++) {
			result[i]=left[i];
		}
		for(int i=0;i<right.length;i++) {
			result[i+left.length]=right[i];
		}
		return result;
	}
	
//	質問６-２︓以下静的なメソッドを定義してください。
//	1. メソッド名: subArray
//	2. 引数１︓intの配列 array
//	3. 引数２︓開始のstartIndex
//	4. 引数３︓⻑さlength
//	5. 戻り値︓intの配列
//	6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
//	以下メソッドの実施例︓
//	int[] array = new int[] {1, 2, 3, 4};
//  start = 1, length = 2
//	int[] result = new int[] {2, 3};
//	回答：
	public static int[] subArray(int[]array,int startIndex, int length) {
		int result[]=new int[length];
		for(int i=0;i<length;i++) {
			result[i]=array[startIndex+i];
		}
		return result;
	}
	
//	質問７︓以下静的なメソッドを定義してください。
//	1. メソッド名︓trim
//	2. 引数１︓charの配列
//	3. 戻り値︓charの配列
//	4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
//	以下メソッドの実施例︓
//	ヒント︓
//	1. 配列の起点から、' ' ではない⽂字列のインデックスを探す。
//	2. 配列の終点から、' ' ではない⽂字列のインデックスを探す。
//	3. 起点と終点を引数として、質問６-２で作成したサブ配列メソッドを呼び出して、結果を求める。
//	char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
// 	メソッドを実施後
//	char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; 
//	回答：
	public static char[] trim(char[]input) {
		int startIndex=0;
		int endIndex=0;
		for(int i=0;i<input.length;i++) {
			if(input[i]==' ') {
				startIndex=i;
			}
		}
		for(int i=input.length-1;i>-1;i--) {
			if(input[i]==' ') {
				endIndex=i;
			}
		}
		char result[]=new char[endIndex-startIndex];
		for(int i=0;i<endIndex-startIndex+1;i++) {
			result[i]=input[startIndex+i];
		}
		return result;
	}

	//質問８︓バブルソート⽤メソッドを作成してください。
	//1. メソッド名︓bubbleSort
	//2. 引数１︓intの配列
	//3. 戻り値︓ソート済みの配列
	//4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
	public static int[] bubbleSort(int[]array) {
		for(int i=0; i < array.length-1; i++) {
            for(int j=i+1; j<array.length;j++) {
            	if(array[i]>array[j]) {
            		int tmp = array[i];
            		array[i] = array[j];
            		array[j] = tmp;
            	}
            	
            }
		}
		return array;
	}
	
	//質問９︓メソッドの呼び出す練習。
	//1. 質問６-１を⽤い、２つ配列をマージします。
	//2. 質問８を⽤い、ステップ１のマージした配列をソートする。
	//3. 注意︓コードを１⾏にしてください。
	//回答：
	public static void main_Q9() {
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		int[] Q9=mergeArray(left,right);
		int[] sorted_Q9=bubbleSort(Q9);
	}
	
}
