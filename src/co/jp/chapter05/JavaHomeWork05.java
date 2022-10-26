package co.jp.chapter05;
import java.util.*;

public class JavaHomeWork05 {

	public static void main(String[] args) {
//		質問1:1から100までの偶数の和を求める(for + if)。
		int sumEven = 0;
		for(int i = 1; i < 101; i++) {
			if (i%2==0) {
				sumEven = sumEven + i;
			}
		}
		System.out.println("回答1:1から100までの偶数の和は"+sumEven);
		
		
//		質問2:5の階乗を求める(for)。
		int factorial5 = 1;
		for(int i = 5; i > 0; i--) {
			factorial5 = factorial5 * i;
		}
		System.out.println("回答2:5の階乗は"+factorial5);
		
		
//		質問3:配列 {1, 2, 6, 7, 9, 6, 2, 1} の最大値、最小値、和、平均値を求める。
		int sum = 0, mean = 0;
		int[] array =  new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		int max = array[0], min = array[0];
		for(int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
			sum = sum + array[i];
		}
		mean = sum / array.length;
		System.out.println("回答3:最大値は"+max+"、最小値は"+min+"、和は"+sum+"、平均値は"+mean);
		
		
//		質問4:質問3の配列に重複ある要素を探す(要素の表示次数集計必要なし)。 
//		System.out.println(Arrays.toString(array));
		System.out.print("回答4:重複の要素は");
		for(int i = 0; i < array.length; i++) {
			for(int t = i+1; t < array.length; t++) {
				if(array[i] == array[t]) {
					System.out.print(array[i]+"、");
					break;
				}
			}
		}
		System.out.println("である");
		
		
//		質問5:質問3の配列に値「7」のインデックスを求む。 
		int target = 7;
		for(int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				System.out.println("回答5:値「7」のインデックスは"+i);
			}
		}
		
		
//		質問6:任意行列(2次元配列)の積を求める。 
		int [][]a = new int[][] {{1,3,1},{5,7,1}};
		int [][]b = new int[][] {{2,4},{6,8},{1,1}};
		int [][]sekiab = new int[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int t = 0; t < a[i].length; t++) {
					sekiab[i][j] = sekiab[i][j] + a[i][t] * b[t][j]; 
				}
			}
		}
		System.out.println("回答6:");
		for (int i = 0; i < sekiab.length; i++) {
			System.out.println(Arrays.toString(sekiab[i]));

		}
		
//		質問7:配列を昇順でソートする(java.util等メソッド利用禁止)。 
		int sortElement;
		for(int i = 0; i < array.length; i++) {
			sortElement = array[i];
			for(int t = i+1; t < array.length; t++) {
				if(array[t] < sortElement) {
					sortElement = array[t];
					array[t] = array[i];
					array[i] = sortElement;
				}
			}
		}
		System.out.println("回答7:昇順でソートした配列は"+Arrays.toString(array));
		
		
//		質問8:LV10のパスカルの三角形を出力してください。
		System.out.println("回答8:");
		int[] pascal = new int[1];
		pascal[0] = 1;
		for (int i = 0; i<11; i++) {
			System.out.println(Arrays.toString(pascal));
			int[] array8 = new int[pascal.length + 1];
			array8[0] = pascal[0];
			for (int t = 1; t < pascal.length; t++) {
				array8[t] = pascal[t-1] + pascal[t];
			}
			array8[array8.length-1] = 1;
			pascal = array8;
		}
	}
}
