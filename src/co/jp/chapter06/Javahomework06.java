package co.jp.chapter06;

public class Javahomework06 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 質問1.以下関数の修飾子、返却型、関数名、引数(引数の型・名称)を回答してくださ い。
		 
		 public(修飾子),static(引数),void(返却値),main(関数名),(String[] args)(引数の型、名称)
		 
		 質問2.配列の和、MAX値、MIN値を求める処理を関数化してください、
		 main関数に呼び出してください。
		         public static int add(int[] array){
				 	int sum = 0;
				 	for(int i = 0; i < array_length; i++){
				 		sum += array[i];
				 	}
				 	return add;
				 }
				 
				 public static int max(int[] array){
				 	int max = array[0];
				 	for(int i = 0; i < array_length; i++){
				 		if(max < array[i]){
				 			max = array[i] + max;
				 			array[i] = max - array[i];
				 			max = max - array[i];
				 		}
				 	}
				 	return max;
				 }
				 
				 public static int min(int[] array){
				 	int min = array[0];
				 	for(int i = 0; i < array_length; i++){
				 		if(min > array[i]){
				 			min = array[i] + min;
				 			array[i] = min - array[i];
				 			min = min - array[i];
				 		}
				 	}
				 	return min;
				 }
		質問3.以下メソッドの実施結果を教えてください。
		null
		質問4:以下メソッドの実施結果を教えてください.
		value2
		質問5:以下メソッドの実施結果を教えてください。
		true
		質問6-0:配列は直接に印刷できません。下記メソッドを利用して、配列をprintします。
		以下メソッドを呼び出してください。
		        String[] array = {"Hello World!"};
				printArray(array);
				
			}	
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
		質問6-1:以下静的なメソッドを定義してください。
		1. メソッド名: megerArray 
				2. 引数1:intの配列 left 
				3. 引数2:intの配列 right 
				4. 戻り値:intの配列
				5. 処理内容:引数left と 引数right をマージして、新しい配列を作成して返却する。
			private static int[] mergeArray(int[] left, int[] right) {
				int[] ret = new int[left.length + right.length];

				for (int i = 0; i < left.length; i++) {
					ret[i] = left[i];
				}

				for (int i = 0; i < right.length; i++) {
					ret[left.length + i] = right[i];
				}
				return ret;
			}
		質問6-2:以下静的なメソッドを定義してください。
		1. メソッド名: subArray
				2. 引数１︓intの配列 array
				3. 引数２︓開始のstartIndex/		4. 引数３︓⻑さlength
				5. 戻り値︓intの配列
				6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
				private static int[] subArray(int[] array, int startIndex, int length) {	
					if (length > 0 && startIndex + length <= array.length) {
						int[] newArray = new int[length];
						for (int i = 0; i < length; i++) {
							newArray[i] = array[i + startIndex];
						}
						return newArray;
					} else {
						int[] newArray = {};
						return newArray;	
					}
				}
		質問7:以下静的なメソッドを定義してください。
		1. メソッド名︓trim
				2. 引数１︓charの配列
				3. 戻り値︓charの配列
				4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。
				private static char[] subArray(char[] array, int startIndex, int length) {
					if (length > 0 && startIndex + length <= array.length) {
						char[] newArray = new char[length];
						for (int i = 0; i < length; i++) {
							newArray[i] = array[i + startIndex];
						}
						return newArray;
					} else {
						char[] newArray = {};
						return newArray;
					}
				}

				private static char[] trim(char[] array) {
					int startIndex = 0;
					int length = 0;
					for (int i = 0; i < array.length; i++) {
						if (array[i] != ' ') {
							startIndex = i;
							break;
						}
					}

					for (int i = array.length - 1; i >= 0; i--) {
						if (array[i] != ' ') {
							length = i - startIndex + 1;
							break;
						}
					}

					return subArray(array, startIndex, length);
				}
		質問8:バブルソート用メソッドを作成してください。
		1. メソッド名︓bubbleSort
				2. 引数１︓intの配列
				3. 戻り値︓ソート済みの配列
				4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
				private static int[] bubbleSort(int[] array) {
					for (int i = 0; i < array.length; i++) {
						for (int j = i + 1; j < array.length; j++) {
							if (array[i] > array[j]) {
								int temp = array[i];
								array[i] = array[j];
								array[j] = temp;
							}
						}
					}
					return array;
				}
		質問9:メソッドの呼び出す練習。
		1. 質問６-１を⽤い、２つ配列をマージします。
				public static void main(String[] args) {
					int[] merged = mergeArray(new int[]{1,2,3,4}, new int[]{5,6,7,8});
			    }
				
				2. 質問８を⽤い、ステップ１のマージした配列をソートする。
				public static void main(String[] args) {
			    	int[] sorted = bubbleSort(mergeArray(new int[]{1,2,3,4}, new int[]{5,6,7,8});
			    }

		 */

			}

		
		

}
