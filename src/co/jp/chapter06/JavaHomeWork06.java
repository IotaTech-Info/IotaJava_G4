package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
		//1 public static void main(String[] args);
		//
		//回答：関数名：main
        //返却値型：void
		//修飾子：public static
		//引数：String[] args
		
		
		
		//質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。
		//1  //例：配列のMax値を求めるメソッド
		//2 public static int max(int[] datas) {
		//3 // ...処理を記載
		//4 }
		
		
		
		
		
		
		
		//質問３．以下メソッドの実施結果を教えてください。
		//1  public class Kicker {
		//2   private static void sayHello(String y) {
		//3  	 y = "Hello world";
		//4    }
		 //5   public static void main(String args[]) {
		//6  	 String x = null;
		//7 	 sayHello(x);
		 //8      System.out.println(x);
		 //9   }
		//10 }
		
		//回答：null
		
		
		
		
		//質問４︓以下メソッドの実施結果を教えてください。
        //1 public class Kicker {
		//2  private static void fillArray(String[] array) {
		//3 	 array[0] = "value2";
		//4  }
		//5  public static void main(String args[]) {
		//6 	 String[] array = new String[]{"value1"};
		//7 	 fillArray(array);
		//8 	 System.out.println(array[0]);
		//9    }
		//10  }
		//
		
		
		//回答：value2
		
		
		
		//質問５︓以下メソッドの実施結果を教えてください
		//1 public class Kicker {
		//2  private static void fillArray(String[] array) {
		//3 	 array = new String[]{"1", "2"};
		//4 	 }
		//5 	 public static void main(String args[]) {
		//6 	 String[] array = null;
		//7 	 fillArray(array);
		//8 	 System.out.println(array == null);
		//9 	 }
		//10 	}
		//
		//
		//回答：true
		//
		//
		//
		
		
		
		//質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
		//1 public static void printArray(Object[] objs) {
		// if(objs == null) {
		// System.out.println("null");
		//return;
		// }
		// String prefix = "";
		// StringBuilder sb = new StringBuilder();
		// sb.append("[");
		// for(Object obj : objs) {
		// sb.append(prefix);
		// sb.append(String.valueOf(obj));
		// prefix = ", ";
		// }
		// sb.append("]");
		// System.out.println(sb.toString());
		//}
		
		
		
		
		//質問６-１︓以下静的なメソッドを定義してください。
		//1. メソッド名: megerArray
		//2. 引数１︓intの配列 left
		//3. 引数２︓intの配列 right
		//4. 戻り値︓intの配列
		//5. 処理内容︓引数left と 引数right をマージして、新しい配列を作成して返却する。

		//以下メソッドの実施例︓
		//1 int[] left = new int[] {1, 2, 3, 4};
		//2 int[] right = new int[] {5, 6, 7, 8};
		//3  //メソッドを実施後
		//4 int[] result = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
		//
		
		
		
		
		//質問６-２︓以下静的なメソッドを定義してください。
		//1. メソッド名: subArray
		//2. 引数１︓intの配列 array
		//3. 引数２︓開始のstartIndex
		//4. 引数３︓⻑さlength
		//5. 戻り値︓intの配列
		//6. 処理内容︓startIndexからstartIndex + lengthまでサブ配列を取得する
		
		//以下メソッドの実施例︓
		//1 int[] array = new int[] {1, 2, 3, 4};
		//2  start = 1, length = 2
		//3 int[] result = new int[] {2, 3}
		
		
		
		
		//質問７︓以下静的なメソッドを定義してください
		//1. メソッド名︓trim
		//2. 引数１︓charの配列
		//3. 戻り値︓charの配列
		//4. 処理内容︓引数１のcharの配列先頭と末尾の空⽩⽂字列を削除してください。

		//以下メソッドの実施例︓
		//1 char[] input = new char[] {' ', ' ', 'A', 'b', ' ', ' ', 'C', ' '}; // 入力引数
		//2  メソッドを実施後
		//3 char[] output = new char[] {'A', 'b', ' ', ' ', 'C'}; // 入力引数
		
		
		
		
		//質問８︓バブルソート⽤メソッドを作成してください。
		//1. メソッド名︓bubbleSort
		//2. 引数１︓intの配列
		//3. 戻り値︓ソート済みの配列
		//4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてくださ
		//い
		
		
		
		
		
		//質問９︓メソッドの呼び出す練習。
		//1. 質問６-１を⽤い、２つ配列をマージします。
		//2. 質問８を⽤い、ステップ１のマージした配列をソートする。
		//3. 注意︓コードを１⾏にしてください。

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
