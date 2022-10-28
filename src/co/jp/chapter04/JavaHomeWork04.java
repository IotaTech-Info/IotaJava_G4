package co.jp.chapter04;

import java.util.Arrays;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１　int[] array = new int[4]; 各要素の値を記載してください。
		//答え　
		int[] array = new int[4];
		array[0]=0;
		array[1]=0;
		array[2]=0;
		array[3]=0;
		
		//質問２　int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//答え
		 array = new int[2];
		 array[0]=5;
		 array[1]=6;
		 
		 //質問３　int[][] array = new int[2][3]; 各要素の値を記載してください。
		 //答え
		 //{
		 //{0,0,0};
		 //{0.0.0};
		 //}
 
		 

		 
		 //質問４ 以下２重Foreachを理解してください。
		//答え
		 int[][] array2d = new int[4][2];
		 for (int[] out : array2d) {
			 for (int inner : out) {
			 System.out.println(inner);
			 }
			}
		 //array2dの中のすべての要素の値をプリントする

		 
		 //質問５ int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
		 //答え
		int[]array3=new int[] {1,3,5,7,100,0,1};
		int max = array3[0];
		int min = array3[0];
		for(int i =1; i<array3.length;i++) {
			if(array3[i] > max) {
				max = array3[i];
			}
			if(array3[i] < min){
				min = array3[i];
			}
		}
		System.out.println("最大値は"+max);
		System.out.println("最小値は"+min);
		

		 
		 //質問６ 問題１の配列のSUMを求める。
		 //答え
		 int[] array4 = new int[4];
			array4[0]=1;
			array4[1]=2;
			array4[2]=3;
			array4[3]=4;
		 int sum = 0;
		 for(int i = 0; i<array4.length;i++) {
			 sum = sum+array4[i];
			
		 }
		 System.out.println("配列の和は"+sum);
		 
		 //質問7 ⾏列（２次元配列）の和と積を計算してください。
	     //答え
		 int [][]array_a = new int [][]{{2,2},{3,3}};
		  int [][]array_b = new int [][]{{3,3},{4,4}};
		  int [][]array_sum =new int [2][2];
		  int [][]array_mul =new int [2][2];
		  for(int i =0;i<array_a.length;i++) {
		   for(int j = 0;j < array_a[i].length;j++) {
		    array_sum[i][j] = array_a[i][j]+array_b[i][j];
		    array_mul[i][j] = array_a[i][j]*array_b[i][j];
		   }
		  }
		  System.out.println("配列の和:");
		  for(int k = 0; k < array_sum.length; k++) {
		   System.out.println(Arrays.toString(array_sum[k]));
		  }
		  System.out.println("配列の積:");
		  for(int k = 0; k < array_sum.length; k++) {
		   System.out.println(Arrays.toString(array_mul[k]));
		  }
		
	}
}