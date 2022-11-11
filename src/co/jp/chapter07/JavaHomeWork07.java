package co.jp.chapter07;

public class JavaHomeWork07 {

	//質問１︓以下コードのコンパイルエラー理由を教えてください。
	//public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	//	public class Pet {
	///		 public String name;
	//		 
	//		 public void setName(String value) {
//			 this.name = value;
	///		 }
	//		}
	//		// Kicker.java
//			public class Kicker {
	//		 public static void main(String...args) {
	//		 Pet cat = new Pet();
	//		 cat.setAge(1234);
	//		 }
//			}

	//		答え；メソッド setAge(int) は型 Pet で定義してない。
	
	
	
	
	//質問２︓Mathクラスを作成してください。以下メソッドを定義します。
///	//1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
	//2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
////	3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
	//4. mainメソッドで上記それぞれメソッドを呼び出してください。
	
	
///	以下はメソッドの定義のソースの抜枠です。
//	public class Math {
//	 public static int max(int[] input) {
////	 }
//	 }
	 //...
	
	
//		答え：

//		public class Math {
	//		public static int max(int[] input) {
//				int[] array = new int[] { 1, 2, 3, 4, 5 };
	//			int max = max(array);
//				int min = min(array);
	//			int avg = ave(array);
//	System.out.println("最大値は : " + max + ", 最小値は : " + min + ", 平均値は: " + ave);
	//		}
	//	}
	
	
	
	
//	2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
//	
//	   public class Matrix {
//	   private final int[][] data;
	 /** construct method */
//	 public Matrix(int[][] data) {
//	 this.data = data;
	// }
//	 // 行列 ADD
	// public Matrix add(Matrix b) {
	 //....
//	 return ???
//	 }
//	}
//	}
	
	
	//public class Matrix {
	//	private final int[][] data;
		
	//	public Matrix(int[][] data) {
	//		int[][] array1 = new int[][] { { 1, 2 },
	//				                       { 3, 4 } };
//			int[][] array2 = new int[][] { { 5, 6 },
	//				                       { 7, 8 } };
	//		Matrix a = new Matrix(array1);
//			Matrix b = new Matrix(array2);

	//		this.data = data;
//		}
//
		// 行列 ADD
//		public Matrix add(Matrix b) {
//			Matrix c = new Matrix(data);
//			c.data[0][0] = this.data[0][0] + b.data[0][0];
//			c.data[0][1] = this.data[0][1] + b.data[0][1];
//			c.data[1][0] = this.data[1][0] + b.data[1][0];
//			c.data[1][1] = this.data[1][1] + b.data[1][1];
//			return c;
//		}
//	}
	
	
	

}
