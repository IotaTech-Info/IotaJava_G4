package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
//		質問１︓以下コードのコンパイルエラー理由を教えてください。
//		// Pet.java
//		public class Pet {
//		 public String name;
//
//		 public void setName(String value) {
//		 this.name = value;
//		 }
//		}
//		// Kicker.java
//		public class Kicker {
//		 public static void main(String...args) {
//		 Pet cat = new Pet();
//		 cat.setAge(1234);
//		 }
//		}
//　　　理由：setAgeメソードは設定されていない。
		
//		質問２︓Mathクラスを作成してください。以下メソッドを定義します。
//		1. 配列のMAXを求める静的メソッドを定義。（引数は int 配列）
//		2. 配列のMINを求める静的メソッドを定義。（引数は int 配列）
//		3. 配列の平均値を求める静的メソッドを定義。（引数は int 配列）
//		4. mainメソッドで上記それぞれメソッドを呼び出してください。
//		
//  public class Math {
//		public static int max(int[] input) {
//			int max = input[0];
//			for (int i = 0; i < input.length; i++) {
//				if (max < input[i]) {
//					max = input[i];
//				}
//			}
//			return max;
//		}
//		public static int min(int[] input) {
//		    int min = input[0];
//		    for (int i = 0; i < input.length; i++) {
//			    if (min > input[i]) {
//				    min = input[i];
//			    }
//		    }
//		    return min;
//	    }
//		public static double average(int[] input) {
//		    int sum = 0;
//		    for (int i = 0; i < input.length; i++) {
//		           sum=sum+input[i];
//		    }
//		    double average=sum/input.length;
//		    return average;		
//		}
//		public static void main(String[] args) {
//			int[] array=new int[]{1,2,3};
//          int arraymax= max(array);		
//	        int arraymin= min(array);
//          double arraymax= average(array);		
//		}
//	}		

		
//		2.⾏列計算。2D⾏列クラスのコンストラクタには１配列引数設定してください。
//		public class Matrix {
//			private final int[][] data;
//
//			public Matrix(int[][] data) {
//				this.data = data;
//			}
//
//			public Matrix add(Matrix b) {
//				int[][] ret = new int[this.data.length][this.data[0].length];
//				for (int i = 0; i < this.data.length; i++) {
//					for (int j = 0; j < this.data[0].length; j++) {
//						ret[i][j] = this.data[i][j] + b.data[i][j];
//					}
//				}
//				return new Matrix(ret);
//			}
//		}


	}
}
