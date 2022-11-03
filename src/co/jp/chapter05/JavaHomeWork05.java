package co.jp.chapter05;

import java.util.Arrays;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		//設問１︓1から100までの偶数の和を求める(for + if)。
		
		int a;
		
		int sum = 0 ;
		
		for (a=1;a<=100;a++) {
			
			if(a%2==0) {
				
				sum=sum+a;
				
			}
			
		}
		System.out.println("1~100偶数の和:" + sum);
		
		
		
		//設問２︓5の階乗を求める(for)。
		
		int c = 1;
		for (int b = 1;b <= 5; b++) {
			c = c * b;
		}
		System.out.println(c);
		
		
		
		//質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。



		int[] array_1 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		
		for (int i = 0 ; i < array_1.length; i++) {
			
			for (int j = i; j < array_1.length; j++) {
				
				if (i != j ) {
					
					if (array_1 [i] > array_1 [j]) {
						int temp = array_1 [j];
						array_1 [j] = array_1 [i];
						array_1 [i] = temp;
					}
				}
			}
		}
		
		int sum_1 = 0;
		
		for(int k = 0; k < array_1.length; k++) {
			
			int g = array_1 [k];
			
			sum_1 = sum_1 + g;
			
		}
		
		double ave = sum_1 /array_1.length;
		
		System.out.println("最大値:" + array_1[7]);
		
		System.out.println("最小値:" + array_1[0]);
		
		System.out.println("和:" + sum_1);
		
		System.out.println("平均値:" + ave);
		
		
		
		
		
		//質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		

		int[] array_2 = new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		
		for(int i_2 = 0 ; i_2 < array_2.length; i_2++) {
			
			int m = 0;
			
			for (int j_2 = i_2 + 1;j_2 < array_2.length; j_2 ++) {
				
				if (array_2[i_2] == array_2[j_2]) {
					
					m++;
					
				}
				
			}
			
			if (m == 1) {
				
				System.out.println("重複要素：" + array_2[i_2]);
			}
			
		}
		
		
		
		
		
		
		//質問５︓質問３の配列に値「７」のインデックスを求む。
		
		//回答：値「７」は第4個ですので、インデックス＝４－１＝３
		
		
		
		//質問６︓任意⾏列（２次元配列）の積を求める。
		

		
		
		
		//質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		

		int[] array = new int[] {4, 59, 27, 95, 31 };
		
		for (int i = 0 ; i < array.length; i++) {
			
			for (int j = i; j < array.length; j++) {
				
				if (i != j ) {
					
					if (array [i] > array [j]) {
						int temp_1 = array [j];
						array [j] = array [i];
						array [i] = temp_1;
					}
				}
			}
		}
		System.out.println(Arrays.toString(array));
		
		
		
		//質問８︓LV10のパスカルの三角形を出力してください。
		
		
		int [][]arr = new int [10][10];
		
		for(int i = 0 ; i < arr.length; i++) {
			
			for (int j = 0; j <= i; j++) {
				
				if (j == 0 || j == i) {
					
					arr[i][j]=1;
					
				}else {
					
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
					
				}
				
				System.out.print(arr[i][j]+"\t");
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
