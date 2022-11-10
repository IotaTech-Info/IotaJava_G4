package co.jp.chapter07;

public class JavaHomeWork07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 質問2-1の呼び出すコード
		int[] arrayInput = new int[] {1,8,24,-1,-9,101};		
		Math array = new Math();
		
		int Max = array.max(arrayInput);
		System.out.println("配列の最大値は：" + Max);
		
		int Min = array.min(arrayInput);
		System.out.println("配列の最小値は：" + Min);
		
		float Mean = array.mean(arrayInput);
		System.out.println("配列の平均値は：" + Mean);
		
		// 質問2-2の呼び出すコード
		int[][] array_1 = new int[][] {
			{1,2},
			{3,4}
		};
		
		int[][] array_2 = new int[][] {
			{5,6},
			{-1,-3}
		};
		
		Matrix array_a = new Matrix(array_1);
		Matrix array_b = new Matrix(array_2);
		
		array_a.add(array_b);
		
		for(int i = 0; i < array_1.length; i++) {
			for(int j = 0; j < array_1[i].length; j++) {
				System.out.print(array_1[i][j] + "  ");
			}
			System.out.println();
		}
		
		// 質問1：以下コードのコンパイルエラー理由を教えてください。
		// Pet.java
		//	public class Pet {
		//		public String name;
		//			
		//		public void setName(String value) {
		//			this.name = value;
		//		}
		//	}
		// Kicker.java
		//	public class kicker {
		//		public static void main(String[] args) {			
		//			Pet cat = new Pet();
		//			cat.setAge(1234);
		//
		//		}
		//	}
		// 回答：setAgeのメソッドはクラスPetで定義されていません。

		// 質問2-1：Mathクラスを作成してください。以下メソッドを定義します。
		// 1.配列のMAXを求める静的メソッドを定義。(引数はint配列)
		// 2.配列のMINを求める静的メソッドを定義。(引数はint配列)
		// 3.配列のMINを求める静的メソッドを定義。(引数はint配列)
		// 4.mainメソッドで上記それぞれメソッドを呼び出してください。
		// 回答：
		// public class Math {

		//	public static int max(int[] input) {
		//		int Max = input[0];
		//
		//		for (int i = 1; i < input.length; i++) {
		//			if (input[i] > Max) {
		//				Max = input[i];
		//			}
		//		}
		//		return Max;
		//	}
		//		
		//	public static int min(int[] input) {
		//		int Min = input[0];
		//
		//		for (int i = 1; i < input.length; i++) {
		//			if (input[i] < Min) {
		//				Min = input[i];
		//			}
		//		}
		//		return Min;
		//		}
		//		
		//	public static float mean(int[] input) {
		//		int sum = 0;
		//			
		//		for(int i = 0; i < input.length; i++) {
		//			sum += input[i];
		//		}
		//			
		//		float mean = (float)sum / input.length;
		//		return mean;
		//		}
		//	}
		
		// 質問2-2：行列計算。2D行列クラスのコンストラクタには1配列引数設定してください。
		// 回答：
		//	public class Matrix {
		//			
		//		private final int[][] array;
		//
		//		public Matrix(int[][] array) {
		//				
		//			this.array = array;
		//				
		//		}
		//			
		//		public Matrix add(Matrix b) {
		//				
		//			Matrix c = new Matrix(array);
		//				
		//			c.array[0][0] = this.array[0][0] + b.array[0][0];
		//			c.array[0][1] = this.array[0][1] + b.array[0][1];
		//			c.array[1][0] = this.array[1][0] + b.array[1][0];
		//			c.array[1][1] = this.array[1][1] + b.array[1][1];
		//				
		//			return c;
		//		}
		//	}
	}	
}