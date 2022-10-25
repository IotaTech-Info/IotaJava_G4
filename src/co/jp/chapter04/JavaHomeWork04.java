package co.jp.chapter04;

import java.util.Arrays;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		//0，0，0，0
		
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//5
		//6
		
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//0，0，0
		//0，0，0
		
		//問題４︓以下２重Foreachを理解してください。
//		int[][] array2d = new int[4][2];
//		for (int[] out : array2d) {
//			for (int inner : out) {
//				System.out.println(inner);
//			}
//		}
		//int[] out : array2d は配列への参照を表す文字列を2行に出力する
		//int inner : out は 配列の要素を出力する
		
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値を System.out.println()。
//		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
//		System.out.print("最⼩桁値" +array[0]+ ",");
//		for(int i = 0;i<array.length;i++) {
//			for(int j = i;j < array.length ;j++) {
//				if(i != j) {
//					if(array[i] > array[j]) {
//						int temp = array[j];
//						array[j] = array[i];
//						array[i] = temp;
//					}
//				}
//			}
//		}
//		System.out.print("最⼤値" +array[6]);
//		System.out.print("最小値" +array[0]);
		
		//問題６︓問題１の配列のSUMを求める。
//		int[] array = new int[4]; 
//		System.out.print(array[0] + array[1] +array[2] +array[3]);
		//答えは０
		
		//問題７︓⾏列（２次元配列）の和と積を計算してください。
		
		int[][]a = new int[][] {{1,2},{1,2}};
		int[][]b = new int[][] {{3,4},{3,4}};
		int[][]sum = new int[2][2];
		int[][]mul = new int[2][2];
		for(int i = 0;i < 2;i++) {
			for(int j = 0;j < 2;j++) {
				sum[i][j] = a[i][j] + b[i][j];
				mul[i][j] = a[i][j] * b[i][j];
			}
		}
		System.out.println("和は：");
		for(int i = 0;i < 2;i++) {
			for(int j = 0;j < 2;j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("積は：");
		for(int i = 0;i < 2;i++) {
			for(int j = 0;j < 2;j++) {
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		} 
	
		
	}
}