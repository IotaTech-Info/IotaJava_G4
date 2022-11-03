package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {

		// 問題１︓int[] array = new int[4]; 各要素の値を記載してください。

//		int[] array = new int[4];
//		System.out.println(Arrays.toString(array));
//		
//
//		// 問題２︓int[] array_1 = new int[] {5, 6}; 各要素の値を記載してください。
//
//		int[] array_1 = new int[] { 5, 6 };
//		System.out.println(array_1[0]);
//		System.out.println(array_1[1]);
//
//		// 問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
//
//		int[][] array_2 = new int[2][3];
//		for (int i = 0; i < array_2.length; i++) {
//			for (int j = 0; j < array_2[i].length; j++) { // int[] is = array_2[j];
//				System.out.print(array_2[i][j] + ",");
//
//			}
//			System.out.println();
//
//		}
//
//		// 問題４︓以下２重Foreachを理解してください。
//
//		int[][] array2d = new int[4][2];
//		for (int[] out : array2d) {
//			for (int inner : out) {
//				System.out.println(inner);
//
//			}
//		}
//
//		// 問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; //
////		左の配列の最⼤値と最⼩桁値をSystem.out.println()。
//
//		int[] array_4 = new int[] { 1, 3, 5, 7, 100, 0, 1 };
//
//		int max = array_4[0];
//		int min = array_4[0];
//		for (int i = 0; i < array_4.length; i++) {
//			if (max < array_4[i]) {
//				max = array_4[i]; //
//				System.out.println("max:" + max);
//			}
//			if (min > array_4[i]) {
//				min = array_4[i];
//				// System.out.println("min:"+min); }
//
//			}
//			System.out.println("max:" + max);
//			System.out.println("min:" + min);

		// 問題６︓問題１の配列のSUMを求める。

//			int[] array = new int[4];
//
//			int sum_2 = 0;
//			for (int i = 0; i < array.length; i++) {
//				sum_2 = sum_2 + array[i];
//			}
//			System.out.println(sum_2);

//		   問題７︓⾏列（２次元配列）の和と積を計算してください。
//		int[][] a = { { 1, 3 }, { 5, 7 } };
//		int[][] b = { { 2, 4 }, { 6, 8 } };
//		int[][] sum = new int[2][2];
//		int[][] mun = new int[2][2];
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				sum[i][j] = a[i][j] + b[i][j];
//			}
//		}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				
//				System.out.print(sum[i][j]);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				mun[i][j] = a[i][j] * b[i][j];
//			}
//		}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				
//				System.out.print(mun[i][j]);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}


		// 設問１︓1から100までの偶数の和を求める(for + if)。
//
//			int sum = 0;
//			for (int i = 0; i < 101; i++) {
//
//				if (i % 2 == 0) {
//					sum = sum + i;
//				}
//			}
//			System.out.println(sum);
//
//			// 設問２︓5の階乗を求める(for)。
//
//			int x = 5;
//			int f = 1;
//			for (int i = 1; i < x + 1; i++) {
//				f = f * i;
//			}
//			System.out.println(f);
//
//			// 質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
//
//			int[] Y = { 1, 2, 6, 7, 9, 6, 2, 1 };
//			int max_1 = Y[0];
//			int min_1 = Y[0];
//			int sum_1 = 0;
//			int length = Y.length; // System.out.println(length); int average;
//			for (int i = 0; i < Y.length; i++) {
//				if (max_1 < Y[i]) {
//					max_1 = Y[i];
//				}
//			}
//			System.out.println(max_1);
//			for (int i = 0; i < Y.length; i++) {
//				if (min_1 > Y[i]) {
//					min_1 = Y[i];
//				}
//			}
//			System.out.println(min_1);
//
//			for (int i = 0; i < Y.length; i++) {
//				sum_1 = sum_1 + Y[i]; // average=sum_1/length
//
//			}
//			System.out.println(average = sum_1 / length);
//
////		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
//
//			int[] Z = { 1, 2, 6, 7, 9, 6, 2, 1 };
//			for (int i = 0; i < Z.length; i++) {
//				int G = Z[i];
//				for (int j = i + 1; j < Z.length; j++) {
//					int K = Z[j];
//					if (G == K) {
//						System.out.println(Z[j]);
//					}
//				}
//			}
//
//			// 質問５︓質問３の配列に値「７」のインデックスを求む。
//		int[] a = { 1, 2, 6, 7, 9, 6, 2, 1 };
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] == 7) {
//				System.out.println(i);
//			}
//		}
			 
			// 質問６︓任意⾏列（２次元配列）の積を求める。
//		int[][] a = { { 1, 3 }, { 5, 7 } };
//		int[][] b = { { 2, 4 }, { 6, 8 } };
//		int[][] mun = new int[2][2];
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				mun[i][j] = a[i][j] * b[i][j];
//			}
//		}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				
//				System.out.print(mun[i][j]);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
			// 質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
//		int[] a = { 11, 9, 12, 7, 91, 6, 2, 14 };
//		int temp;
//		for (int i = 0; i < a.length-1; i++) {
//			for (int j = 0; j < a.length-1-i; j++) {
//				if (a[j]>a[j+1]) {
//					  temp = a[j+1];        // 元素交换
//		                a[j+1] = a[j];
//		                a[j] = temp;
//				}
//				
//			}
//			
//		}
//		System.out.println(Arrays.toString(a));
//		
		// 質問８︓LV10のパスカルの三⾓形を出⼒してください。
		a();

	}
	public static void a() {

		int[] n = new int[1];
		n[0] = 1;
		for (int i = 0; i < 11; i++) {
		print(n);
		n = n(n);
		}

		}

		public static int[] n(int[] n) {

		int[] is = new int[n.length + 1];
		is[0] = n[0];
		for (int i = 1; i < n.length; i++) {
		is[i] = n[i - 1] + n[i];
		}
		is[is.length - 1] = 1;
		return is;
		}

		static void print(int[] is) {
		for (int i : is) {
		System.out.print(i + " ");
		}
		System.out.println();
		}
}
//}