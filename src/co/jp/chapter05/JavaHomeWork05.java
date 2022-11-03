package co.jp.chapter05;

import java.util.ArrayList;
import java.util.List;

public class JavaHomeWork05 {

	public static void main(String[] args) {
//		設問１︓1から100までの偶数の和を求める(for + if)。
		int sum = 0;
		for (int i=1;i<=100;i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
//		設問２︓5の階乗を求める(for)。
		int pro = 1;
		for (int i=1;i<=5;i++) {
			pro *= i;
		}
		System.out.println(pro);
//		質問３︓配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		int[] array = {1, 2, 6, 7, 9, 6, 2, 1};
		int max = 0,
			min = 999;
		double mean;
		sum = 0;
		
		for (int num : array) {
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			sum += num;
		}
		mean = (double)sum / array.length;
		System.out.println("最⼤値:"+max+"最⼩値:"+min+"和:"+sum+"平均値:"+mean);
//		質問４︓質問３の配列に重複ある要素を探す（要素の表⽰次数集計必要なし）。
		List<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				if (array[i] == array[j] && !list.contains(array[i])) {
					list.add(array[i]);
				}
			}
		}
		System.out.println(list);
//		質問５︓質問３の配列に値「７」のインデックスを求む。
		for (int i=0;i<array.length;i++) {
			if(array[i] == 7) {
				System.out.println(i);
			}
		}
//		質問６︓任意⾏列（２次元配列）の積を求める。
		int[][] array2d = new int[4][2];
		int array2d_pro = 1;
		for (int[] out : array2d) {
			 for (int inner : out) {
				 array2d_pro *= inner;
			 }
		}
		System.out.println(array2d_pro); 
//		質問７︓配列を昇順でソートする（java.util等メソッド利⽤禁⽌）。
		for (int i=0;i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				if (array[i] > array[j]) {
					int x = array[i];
					array[i] = array[j];
					array[j] = x;
				}
			}
		}
		printAll(array);
//		質問８︓LV10のパスカルの三⾓形を出⼒してください。
		int[] array1 = {1},
			  array2 = {1,1};
		printAll(array1);
		printAll(array2);
		for (int i=3;i<=10;i++) {
			array1 = array2;
			array2 = new int[i];
			array2[0] = 1;
			array2[i-1] = 1;
			for (int j=1;j<i-1;j++) {
				array2[j] = array1[j]+array1[j-1];
			}
			printAll(array2);
		}

	}
	
	private static void printAll(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println("");
	}
}
