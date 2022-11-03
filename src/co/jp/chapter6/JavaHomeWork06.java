package co.jp.chapter06;

public class JavaHomeWork06 {
/*	質問
	
	質問１．以下関数の修飾⼦、返却型、関数名、引数（引数の型・名称）を回答してください。
	    public static void main(String[] args);
	
	答え：修飾⼦：public (公開) 、static (静的), 返却値：void, 関数名：main,　引数名：args,  引数の型: String[] 
	
	質問２．配列の和、MAX値、MIN値を求める処理を関数化してください、main関数に呼び出してください。

	// 例：配列のMax値を求めるメソッド
	public static int max(int[] datas) {
	 // ...処理を記載
	}
	
	質問３．以下メソッドの実施結果を教えてください。

	public class Kicker {
	 private static void sayHello(String y) {
	 y = "Hello world";
	 }
	 public static void main(String args[]) {
	 String x = null;
	 sayHello(x);
	  System.out.println(x);
	  }
	 }
	
	答え：　null。
	 
	質問４︓以下メソッドの実施結果を教えてください。
	
	public class Kicker {
	 private static void fillArray(String[] array) {
	 array[0] = "value2";
	 }
	 public static void main(String args[]) {
	 String[] array = new String[]{"value1"};
	 fillArray(array);
	 System.out.println(array[0]);
	 }
	}
	
	答え：value2。
	
	質問５︓以下メソッドの実施結果を教えてください。
	
	public class Kicker {
	 private static void fillArray(String[] array) {
	 array = new String[]{"1", "2"};
	 }
	 public static void main(String args[]) {
	 String[] array = null;
	 fillArray(array);
	 System.out.println(array == null);
	 }
	}
	
	答え　：true
	
	
	質問６-０︓配列は直接に印刷できません。下記メソッドを利⽤して、配列をprintします。以下メソッドを呼び出してください。
	
	答え：
		public static void main(String[] args) {
		String[] array = {""};
		
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
	}

	
	
	質問６-１︓以下静的なメソッドを定義してください。

	

	質問８︓バブルソート⽤メソッドを作成してください。
	1. メソッド名︓bubbleSort
	2. 引数１︓intの配列
	3. 戻り値︓ソート済みの配列
	4. 処理内容︓bubbleSortアルゴリズムを⽤い、⼊⼒した引数の配列をソートしてください。
	
	質問９︓メソッドの呼び出す練習。
	1. 質問６-１を⽤い、２つ配列をマージします。
	2. 質問８を⽤い、ステップ１のマージした配列をソートする。
	3. 注意︓コードを１⾏にしてください。
	
	*/

}
