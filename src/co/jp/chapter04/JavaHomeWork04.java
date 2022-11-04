package co.jp.chapter04;

import java.util.Arrays;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題１:int[] array = new int[4]; 各要素の値を記載してください。
		//[0,0,0,0]
		
		//問題２:int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//[5,6]
		
		//問題３:int[][] array = new int[2][3]; 各要素の値を記載してください。
		//[0,0,0]
		//[0,0,0]
		
		//問題４:以下２重Foreachを理解してください。
		 int[][] array2d = new int[4][2];
		 for (int[] out : array2d) {
		  for (int inner : out) {
		  System.out.println(inner);
		  
		  }
		 
		 }
		 //二次元配列を一行つづ数値を表示する
		 
		 //問題５:int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最大値と最小桁値をSystem.out.println()
		 
		 int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
		 for(int i=0;i<array.length;i++) {
			 for(int j=i;j<array.length;j++) {
				 if(i!=j) {
					 if(array[i]>array[j]) {
						 int temp = array[j];
						 array[j] = array[i];
						 array[i] = temp;
					 }
				 }
			 }
		 }
		 System.out.println(Arrays.toString(array));
		 System.out.println(array[0]);
		 System.out.println(array[6]);
		 
		 //問題６︓問題１の配列のSUMを求める。
		 int sum =0;
		 int[] array = new int[4];
		     for (int i=0;i<array.length;i++) {
		    	 sum +=array[i];
		     }
		 System.out.println(sum);
		 //問題７:行列（２次元配列）の和と積を計算してください。
		 int sum2=0,multi=1;
		 int [][] array6=new int [][] {
			 {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
		 };
		 for(int[] out:array6) {
			 for(int inner:out) {
				 sum2=sum2+inner;
				 System.out.print(inner+"");
			 }
			 System.out.println();
		 }
		 System.out.println("二次元配列の和は"+sum2+"です");
		 System.out.println("二次元配列の積は"+multi+"です");
		  
	}
}