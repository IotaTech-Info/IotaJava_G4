package co.jp.chapter05;

import java.util.Arrays;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		設問１︓1から100までの偶数の和を求める(for + if)。
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0){
//				sum += i;
//			}
//		}
//		System.out.println(sum);

//		設問２︓5の階乗を求める(for)。 
//		int mul = 1;
//		for (int i = 1; i <= 5; i++) {
//			mul *= i;
//		}
//		System.out.println(mul);

//		質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。 
//		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
//		int max = array[0];
//		int min = array[0];
//		float sum = 0;
//		float average = 0;
//		for (int i = 0; i < array.length; i++) {
//				sum += array[i];
//					if (array[i] > max) {
//						max = array[i];
//				}
//					else if(array[i] < min) {
//						min = array[i];
//					}
//				average = sum / array.length;
//		}
//		System.out.print("最⼤値は:" + max);
//		System.out.print("最小値は:" + min);
//		System.out.print("和は:" + sum);
//		System.out.print("平均値は:" + average);

//		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。 
//		int[] array = new int[] { 1, 2, 6, 7,9, 6, 2, 1 };
//		System.out.println("重複ある要素は：");
//		for (int i = 0; i < array.length; i++) {
//			for (int j = i + 1; j < array.length; j++) {
//				if (array[i] == array[j]) {
//					System.out.print(array[i] + " ");
//				}
//			}
//		}

//		質問５︓質問３の配列に値「７」のインデックスを求む。 
//		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };
//		for (int i = 0; i < array.length; i++) {
//			if(array[i] == 7) {
//				System.out.println("配列に値「７」のインデックスは：" + i);
//			}
//		}

//		質問６︓任意⾏列（２次元配列）の積を求める。 
//		int[][]a = new int[][] {{1,2},{1,2}};
//		int[][]b = new int[][] {{3,4},{3,4}};
//		int[][]sum = new int[2][2];
//		int[][]mul = new int[2][2];
//		for(int i = 0;i < 2;i++) {
//			for(int j = 0;j < 2;j++) {
//				sum[i][j] = a[i][j] + b[i][j];
//				mul[i][j] = a[i][j] * b[i][j];
//			}
//		}
//		System.out.println("積は：");
//		for(int i = 0;i < 2;i++) {
//			for(int j = 0;j < 2;j++) {
//				System.out.print(mul[i][j] + " ");
//			}
//			System.out.println();
//		} 

//		質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。 
//		int[] arr_1 =new int[] {1, 3, 5, 7, 100, 0, 1};
//		for(int i = 0;i<arr_1.length;i++) {
//			for(int j = i;j < arr_1.length ;j++) {
//				if(i != j) {
//					if(arr_1[i] > arr_1[j]) {
//						int temp = arr_1[j];
//						arr_1[j] = arr_1[i];
//						arr_1[i] = temp;
//					}
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr_1));

//		質問８︓LV10のパスカルの三⾓形を出⼒してください。
//		int row = 10;
//		int[][] trangle = new int[row][row];
//
//		for (int i = 0; i < row; i++) {
//			for (int j = 0; j <= i; j++) {
//				if (j == 0 || j == i) {
//					trangle[i][j] = 1;
//
//				} else {
//					trangle[i][j] = trangle[i - 1][j - 1] + trangle[i - 1][j];
//				}
//			}
//		}
//		for (int i = 0; i < row; i++) {
//			int width = row - i;
//			for (int j = 0; j <= width; j++) {
//				System.out.print(" ");
//			}
//			for (int height = 0; height <= i; height++) {
//				System.out.print(trangle[i][height] + " ");
//			}
//			System.out.println();
//		}

	}
}
