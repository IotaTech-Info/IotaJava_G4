package co.jp.chapter04;

import java.util.Arrays;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//問題1:int[] array = new int[4]; 各要素の値を記載してください。
		  //回答: [0,0,0,0]
		  
		  
		  //問題2:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		  //回答: array[0]=5; array[1]=6
		  
		  
		  //問題3:int[][] array = new int[2][3]; 各要素の値を記載してください。
		  //回答: array[0][0]=0; array[0][1]=0; array[0][2]=0;
		  //      array[1][0]=0; array[1][1]=0; array[1][2]=0;
		  
		  
		  //問題4:以下2重Foreachを理解してください。
		  // int [][]array2d=new int[4][2]
		  // for (int[] out: array2d){
		  //   for (int inner:out){
		  //     System.out.println(inner);
		  //  }
		  // }
		  //回答: ２次元配列、4行2列の全部の要素を表示する。
		  
		  
		  //問題5:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値を System.out.println()。
		  //回答:
		  int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		  int max = array[0];
		  int min = array[0];
		  for(int i = 0; i< array.length; i++) {
		    if (array[i] > max) {
		      max = array[i];
		    }
		    
		    if (array[i] < min) {
		     min = array[i];
		    }
		  }
		  System.out.println("最大値"+ max);
		  System.out.println("最小値"+ min);
		  
		  
		  
		  //問題6:問題1の配列のSUMを求める。
		  //回答:
		  int[] array_1 = new int[4];
		  int sum = 0;
		  for(int i=0; i<array_1[i]; i++) {
		   sum = array_1[i];
		  }
		  System.out.println("SUM:"+ sum);
		  
		  
		  //問題7:行列(2次元配列)の和と積を計算してください。
		  //回答:
		  int[][]arr_1 = new int[][]{ {1,2},{3,4}};
		  int[][]arr_2 = new int[][]{ {5,6},{7,8}};
		  
		  int[][]sum_1 = new int[2][2];
		  int[][]sum_2 = new int[2][2];
		  for(int i=0; i<arr_1.length; i++) {
		   for(int j=0; j<arr_1.length; j++) {
		    sum_1[i][j] = arr_1[i][j] + arr_2[i][j];
		    sum_2[i][j] = arr_1[i][j] * arr_2[i][j];
		   }
		  }
		  
		  System.out.println("配列の和:");
		  for (int a =0; a <sum_1.length; a++) {
		   System.out.println(Arrays.toString(sum_1[a]));
		  
		  }
		  System.out.println("配列の積:");
		  for (int a=0; a<sum_2.length; a++) {
		   System.out.println(Arrays.toString(sum_2[a]));
		  }
	}
}