package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		//回答：[0,0,0,0]
		
		
		
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//回答：[5,6]
		
		
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください
		//回答： 0,0,
		//       0,0,
		//       0,0,
		//
		
		
		
		//問題４︓以下２重Foreachを理解してください。
		//1 int[][] array2d = new int[4][2];
		//2 for (int[] out : array2d) {
		//3    for (int inner : out) {
		//4       System.out.println(inner);
		//5    }
		//6 }
		
		//回答：各要素を出力する。
		
		
		
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小値をSystem.out.println()。


		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		
		int max  = array[0];
		
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			
			if (array[i] > max) {
				
				max = array[i];
				
			}
			
			if (array[i] < min) {
				
				min = array[i];
				
			}
			
		}
		
		System.out.println("最大値：" + max);
	    System.out.println("最小値：" + min);
		

		
		//問題６︓問題１の配列のSUMを求める。
		
		int[]arr = {0,0,0,0};
		
		int sum = 0;
		
		for (int k = 0; k < arr.length; k++) {
			
			int g = arr[k];
			
			sum = sum + g;
			
		}
		System.out.println("SUM:" + sum);
		
		
		
		//問題７︓行列（２次元配列）の和と積を計算してください。
		
		
		
		
		
		
		
		
	}
}