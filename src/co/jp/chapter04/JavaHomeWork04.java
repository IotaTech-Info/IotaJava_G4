package co.jp.chapter04;

import java.util.Arrays;

public class JavaHomeWork04 {
	public static void print(int [][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] add(int [][] a,int [][] b){
		int [][] c = new int[a.length][b.length];
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	public static int[][] multiply(int [][] a,int [][] b){
		int [][] c = new int[a.length][b.length];
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] * b[i][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題1: {0,0,0,0} 
		int[] array_1 = new int[4];
		System.out.println(Arrays.toString(array_1));
		//問題2: {5,6}
		int[] array_2 = new int[] {5,6};
		System.out.println(Arrays.toString(array_2)); 
		//問題3: {[0, 0, 0], [0, 0, 0]}
		int[][] arr_3 = new int[2][3];
		for(int i = 0; i < arr_3.length; i++) {
			System.out.println(Arrays.toString(arr_3[i]));
//			for(int j = 0; j < arr_3[i].length; j++) {
//				System.out.print(arr_3[i][j]);
//			}
//			System.out.println();
		}
		//問題4: 
		int[][] array2d = new int[4][2];
		array2d[0] = new int[] {1,2};
		array2d[1] = new int[] {3,4};
		array2d[2] = new int[] {5,6};
		array2d[3] = new int[] {7,8};
		for(int[] out : array2d) {
			for(int inner : out) {
				System.out.print(inner);
			}
		}
		System.out.println();
		//問題5: 
		int[] arr_5 = new int[] {1,3,5,7,100,0,1};
		int arrMax = arr_5[0];
		int arrMin = arr_5[0];
		for(int i = 1; i < arr_5.length; i++) {
			if(arrMax < arr_5[i]) {
				arrMax = arr_5[i];
			}
		}
		for(int i = 1; i < arr_5.length; i++) {
			if(arrMin > arr_5[i]) {
				arrMin = arr_5[i];
			}
		}
		System.out.println("Max=" + arrMax);
		System.out.println("Min=" + arrMin);
		//問題6:
		int[] array = new int[]{2,8,25,99};
		int sum = 0;
		for(int i = 1; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum=" + sum);
		//問題7:
		int[][] array7a = new int[][] {{2,5}, {1,6}};
		int[][] array7b = new int[][] {{10,20}, {30,40}};
		System.out.println("A:");
		print(array7a);
		System.out.println("B:");
		print(array7b);
		System.out.println("行列(2次元配列)の和:");
		int[][] c = add(array7a,array7b);
		print(c);
		System.out.println("行列(2次元配列)の積:");
		int[][] d = multiply(array7a,array7b);
		print(d);
	}
}