package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//問題４︓以下２重Foreachを理解してください。
		int[][] array2d = new int[4][2];
		for (int[] out : array2d) {
			for (int inner : out) {
				System.out.println(inner);
			}
		}
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩値を
		//System.out.println()。
		//問題６︓問題１の配列のSUMを求める。
		//問題７︓⾏列（２次元配列）の和と積を計算してください。

	}
}