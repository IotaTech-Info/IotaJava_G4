package co.jp.chapter05;

import java.util.Arrays;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		 * 設問1:1から100までの偶数の和を求める(for + if)。 
		 * 設問2:5の階乗を求める(for)。
		 * 質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。 
		 * 質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。 
		 * 質問5:質問3の配列に値「7」のインデックスを求む。 
		 * 質問6:任意行列(2次元配列)の積を求める。 
		 * 質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。 
		 * 質問8:LV10のパスカルの三角形を出力してください。
		 */
		//設問1:
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1から100までの偶数の和:" + sum);
		//設問2:
		int n = 1;
		for(int i = 1; i <= 5; i++) {
			n = n * i;
		}
		System.out.println("5の階乗:" + n);
		//質問3:
		int[] array = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int sum_3 = 0;
		for(int i = 0; i < array.length; i++) {
			sum_3 += array[i];
		}
		double ave = sum_3 / array.length;
		System.out.println("和:" + sum_3);
		System.out.println("平均値:" + ave);
		for(int i = 0; i < array.length; i++) { //排序
			for(int j = i; j <array.length; j++) { 
				if(i != j) {
					if(array[i] > array[j]) {
						int temp = array[j];
						array[j] = array[i];
						array[i] = temp;
					}
				} 
			} 
		}
		System.out.println("最大値:" + array[array.length - 1]);
		System.out.println("最小値:" + array[0]);
		//質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。 
		int[] array_1 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		System.out.print("重複ある要素: ");
		for(int i = 0; i < array_1.length; i++) {
			for(int j = i + 1; j <array_1.length; j++) { 
				if(array_1[i] == array_1[j]) {
					System.out.print(array_1[i] + " ");
				}
			} 
		}
		System.out.println();
		//質問5:質問3の配列に値「7」のインデックスを求む。 
		System.out.print("配列に値「7」のインデックス: ");
		for(int i = 0; i < array_1.length; i++) {
			if(array_1[i] == 7) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//質問6:任意行列(2次元配列)の積を求める。
		int[][] a = new int[][] {{2,5}, {1,6}};
		int[][] b = new int[][] {{10,20}, {30,40}};
		int [][] multi = new int[a.length][b.length];
		for(int i =0;i<multi.length;i++) {
			for(int j = 0;j < multi.length;j++) {
				multi[i][j] = a[i][j] * b[i][j];
			}
		}
		System.out.println("a:");
		for(int k = 0; k < multi.length; k++) {
			System.out.println(Arrays.toString(a[k]));
		}
		System.out.println("b:");
		for(int k = 0; k < multi.length; k++) {
			System.out.println(Arrays.toString(b[k]));
		}
		System.out.println("積:");
		for(int k = 0; k < multi.length; k++) {
			System.out.println(Arrays.toString(multi[k]));
		}
		//質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。 
		System.out.print("配列を昇順でソートする: ");
		int[] array_2 = new int[]{ 22, 86, 6, 9, 70};
		for(int i = 0; i < array_2.length; i++) { 
			for(int j = i; j <array_2.length; j++) { 
				if(i != j) {
					if(array_2[i] > array_2[j]) {
						int temp = array_2[j];
						array_2[j] = array_2[i];
						array_2[i] = temp;
					}
				} 
			} 
		} 
		System.out.println(Arrays.toString(array_2)); 
		//質問8:LV10のパスカルの三角形を出力してください。
		int t[][] = new int[20][20];
		int lv = 10;
		t[0][0] = 1;
		for(int i = 0; i <= lv; i++) {
			for(int j = 0; j <= i; j++) {
				if(j == i || j == 0) {
					t[i][j] = 1;
				}else
					t[i][j] = t[i-1][j-1] + t[i-1][j];
				
				System.out.print(t[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();

	}
}
