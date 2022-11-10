package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		質問１︓以下コードのコンパイルエラー理由を教えてください。
//		// Pet.java
//		public class Pet {
//		 	public String name;
//
//			public void setName(String value) {
//			 	this.name = value;
//		 	}
//		}
//		// Kicker.java
//		public class Kicker {
//			public static void main(String...args) {
//		 		Pet cat = new Pet();
//		 		cat.setAge(1234);
//		 	}
//		}
		
		// 编译错误的理由是，Pet类并不存在名为setAge()的方法，也不存在age的属性。因此这个setAge完全是无中生有的。
		
//		質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//		4. mainメソッドで上記それぞれメソッドを呼び出してください。
		
		int[] array = new int[] {1,2,3,4,5};
		int max_num = Math.max(array);
		int min_num = Math.min(array);
		double mean_num = Math.mean(array);
		
		System.out.println("max : " + max_num + ", min : " + min_num + ", mean : " + mean_num);
		// 详细代码见co.jp.chapter07.Math

//		⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
		int [][] data1 = new int[][] {{1,2,3},
									 {4,5,6}};
		int [][] data2 = new int[][] {{1,2},
									 {3,4},
									 {5,6}};							
		Matrix m1 = new Matrix(data1);
		Matrix m2 = new Matrix(data2);
		
		int [][] data3 = m1.add(m2);
		int [][] data4 = Matrix.addTwoMatrix(m1, m2);
		
		// 在上记的代码中，Matrix中实现了两种方式的加法，分别为 静态的addTwoMatrix，和非静态的add
		// 其中 add的实现与题目略有不同，我觉得基于面向对象的思想，add应该为对类里面的data进行修改的方法。
		// 此外，当两个行列式的大小不同时，算法会自动选取两个行列式的交集部分进行相加
		// 详细代码见co.jp.chapter07.Matrix
	}
}
