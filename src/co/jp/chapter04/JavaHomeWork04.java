package co.jp.chapter04;

public class JavaHomeWork04 {
	public static void main(String[] args) {
		
		int[] array1 = new int[4];
		for (int x : array1) {
			System.out.println(x);
		}
		System.out.println();
		/*
		 * 問題1:
		 * array1[0]=0,array1[1]=0,array1[2]=0,array1[3]=0
		 * 
		 */
		
		int[] array2 = new int[] {5, 6};
		for (int x : array2) {
			System.out.println(x);
		}
		System.out.println();
		/*
		 * 問題2:
		 * array2[0]=5,array1[1]=6
		 * 
		 */
		
		int[][] array3 = new int[2][3]; 
		for (int[] x : array3) {
			for (int y : x) {
				System.out.print(y);
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 問題3:
		 * array3[0][0]=0,array1[0][1]=0
		 * array3[1][0]=0,array1[1][1]=0
		 * array3[2][0]=0,array1[2][1]=0
		 * 
		 */
		
		int[][] array4 = new int[4][2]; 
		for (int[] out : array4) {
			for (int inner : out) {
				System.out.print(inner);
			}
		}
		System.out.println();
		/*
		 *問題4:
		 *二次元配列を一行つづ循環に数値を表示する 
		 */
		
		int[] array5 = new int[] {1, 3, 5, 7, 100, 0, 1};
		int max,min;//-2147483648-2147483647
		min=max=array5[1];
		for (int x :array5) {
			if(min>x)min=x;
			if(max<x)max=x;
		}
		System.out.println("max:"+max+",min:"+min);
		System.out.println();
		
		int sum1=0;
		for(int x:array1) {
			sum1=sum1+x;
		}
		System.out.println("問題1の配列のSUMは"+sum1+"です");
		System.out.println();
		
		int sum2=0,multi=1;
		int[][] array6 = new int[][] {
			{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
		};
		for(int[] out:array6) {
			for(int inner: out){
				sum2=sum2+inner;
				multi=multi*inner;
				System.out.print(inner+" ");
			}
			System.out.println();
		}
		System.out.println("二次元配列の和は"+sum2+"です");
		System.out.println("二次元配列の積は"+multi+"です");
		
	}
}